package kr.co.mlec.board;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;
import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;
import org.springframework.web.mvc.RequestParam;

import com.oreilly.servlet.MultipartRequest;

import kr.co.mlec.board.BoardDomain;
import kr.co.mlec.board.CommentBoardDomain;
import kr.co.mlec.board.UploadBoardDomain;
import kr.co.mlec.common.HanbitFileRenamcePloicy;

@Controller
public class BoardController 
{
	@RequestMapping("/board/delete.do")
	public String delete(int no) throws Exception {
		BoardMapper dao = new BoardMapper();
		dao.deleteBoard(no);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(int no) throws Exception {
		BoardMapper dao = new BoardMapper();
		BoardDomain board = dao.detailBoard(no);
		ModelAndView mav = new ModelAndView("/board/detail.jsp");
		mav.addAttribute("board", board);
		return mav;
	}	

	@RequestMapping("/board/list.do")
	public ModelAndView list(
			@RequestParam(name="pageNo", defaultValue="1") int no) throws Exception {
		System.out.println(no);
		
		// 작업을 처리하기 위한 파라미터 추출
		// 데이터를 가져오기
		// List<BoardDomain> listBoard()
		BoardMapper dao = new BoardMapper();
		List<BoardDomain> list = dao.listBoard();
	
		ModelAndView mav = new ModelAndView("/board/list.jsp");
		// 데이터를 사용할 페이지로 이동
		mav.addAttribute("list", list);
		
		return mav;
	}
	
	@RequestMapping("/board/modify.do")
	public String modify(BoardDomain board) throws Exception {
		// DAO를 호출해서 작업처리 지시
		BoardMapper dao = new BoardMapper();
		dao.modifyBoard(board);
		
		return "redirect:/board/list.do";
	}
	
	@RequestMapping("/board/modifyform.do")
	public ModelAndView modifyForm(int no) throws Exception {
		BoardMapper dao = new BoardMapper();
		BoardDomain board = dao.detailBoard(no);
		ModelAndView mav = new ModelAndView("/board/modifyForm.jsp");
		mav.addAttribute("board", board);
		return mav;
	}
	
	@RequestMapping("/board/write.do")
	public String write(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uploadPath = "C:/!SHOU/upload";
		SimpleDateFormat sdf = new SimpleDateFormat("/yy/MM/dd/HH");
		String subPath = sdf.format(new Date());
		File f = new File(uploadPath + subPath);
		
		if(!f.exists())
		{
			f.mkdirs();
		}

		MultipartRequest mRequest = new MultipartRequest(request, 
														f.getPath(), 
														1024 * 1024 * 100, 
														"utf-8", 
														new HanbitFileRenamcePloicy());
		

		BoardDomain board;		
		BoardMapper mm = new BoardMapper();
		int listNo = 0;
		try {
			board = (BoardDomain)WebUtil.toVO(mRequest, BoardDomain.class);
			listNo = mm.getNextVal();
			board.setNo(listNo);
			mm.insertBoard(board);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		Enumeration<String> fNames = mRequest.getFileNames();
		
		while(fNames.hasMoreElements())
		{
			String fName = fNames.nextElement();
			
			File file = mRequest.getFile(fName);
			
			if(file != null)
			{
				long fileSize = file.length(); // 파일 크기
				String oriName = mRequest.getOriginalFileName(fName); //업로드시 원본 이름
				String systemName = mRequest.getFilesystemName(fName); //서버에 저장되는 이름
				System.out.println("파일 사이즈 : " + fileSize);
				System.out.println("원본 파일명 : " + oriName);
				System.out.println("서버 파일명 : " + systemName);
				
				try {
					UploadBoardDomain ubd = new UploadBoardDomain();
					ubd.setNo(listNo);
					ubd.setFilePath(subPath);
					ubd.setOriName(oriName);
					ubd.setSystemName(systemName);
					ubd.setFileSize(fileSize);
					mm.insertFileBoard(ubd);
				} catch (Exception e) {
					throw new ServletException(e);
				} 
			}
		}	
		
		return "redirect:/board/list";
	}
	
	@RequestMapping("/board/writeform.do")
	public void writeForm() throws Exception {}
	
	@RequestMapping("/board/writecomment.do")
	public String writecomment(HttpServletRequest request) throws ServletException, IOException
	{

		int no = Integer.parseInt(request.getParameter("no"));
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		CommentBoardDomain commentBoard = new CommentBoardDomain();
		commentBoard.setNo(no);
		commentBoard.setContent(content);
		commentBoard.setWriter(writer);
		
		BoardMapper mm = new BoardMapper();
		
		try {
			mm.commentInsertBoard(commentBoard);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		return "redirect:/board/detail?no="+no;
	}
	
	
	
	@RequestMapping("/board/commentdelete.do")
	public String commentDelete(int no, int commentNo) throws ServletException, IOException 
	{		
		try 
		{	
			BoardMapper mm = new BoardMapper();
			CommentBoardDomain cbd = new CommentBoardDomain();
			cbd.setNo(no);
			cbd.setCommentNo(commentNo);
			mm.deleteCommentBoard(cbd);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return "redirect:/board/detail?no="+no;
	}
	
	@RequestMapping("/board/commentmodify.do")
	public String commentmodify(HttpServletRequest request) throws ServletException, IOException 
	{
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		// 화면에서 넘어온 파라미터 추출하기
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		// Domain 클래스에 파라미터 담기
		CommentBoardDomain board;
		BoardMapper mm = new BoardMapper();
		
		// DAO를 호출해서 작업처리 지시
		/*BoardDAO dao = new BoardDAO();*/
		try {
			board = (CommentBoardDomain)WebUtil.toVO(request, CommentBoardDomain.class);
			board.setNo(no);
			board.setCommentNo(commentNo);
			board.setContent(content);
			board.setWriter(writer);
			mm.commentModifyBoard(board);
			/*dao.commentModifyBoard(board);*/
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		// 페이지 이동
		return "redirect:/board/detail?no="+no;
	}
	
	
	@RequestMapping("/board/commentmodifyform.do")
	public void commentmodifyform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		System.out.println(no);
		System.out.println(commentNo);
		try {
			BoardMapper mm = new BoardMapper();
			CommentBoardDomain board = new CommentBoardDomain();
			board.setNo(no);
			board.setCommentNo(commentNo);
			board = mm.commentDetailBoard(board);			
			ModelAndView mav = new ModelAndView("/board/commentModifyForm.jsp");
			mav.addAttribute("board", board);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
