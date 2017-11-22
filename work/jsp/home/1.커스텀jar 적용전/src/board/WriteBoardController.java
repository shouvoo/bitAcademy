package board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;

import com.oreilly.servlet.MultipartRequest;

import common.HanbitFileRenamcePloicy;
import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/board/write")
public class WriteBoardController extends HttpServlet {
	@Override
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//필터 처리됨 : EncodingFilter 확인
		// post 방식일 경우 파라미터 한글 처리
		//request.setCharacterEncoding("utf-8");
		
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
		
		
		// 화면에서 넘어온 파라미터 추출하기
		/*String title = mRequest.getParameter("title");
		String content = mRequest.getParameter("content");
		String writer = mRequest.getParameter("writer");*/
		
		// Domain 클래스에 파라미터 담기
		
		/*BoardDomain board = new BoardDomain();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);*/
		

		BoardDomain board;
		// DAO를 호출해서 작업처리 지시
		/*BoardDAO dao = new BoardDAO();
		dao = new BoardDAO();*/
		
		MemberMapper mm = new MemberMapper();
		int listNo = 0;
		try {
			board = (BoardDomain)WebUtil.toVO(mRequest, BoardDomain.class);
			/*listNo = dao.getNextVal();*/
			listNo = mm.getNextVal();
			board.setNo(listNo);
			mm.insertBoard(board);
			/*dao.insertBoard(board);*/
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
				
				/*dao = new BoardDAO();*/
				try {
					UploadBoardDomain ubd = new UploadBoardDomain();
					ubd.setNo(listNo);
					ubd.setFilePath(subPath);
					ubd.setOriName(oriName);
					ubd.setSystemName(systemName);
					ubd.setFileSize(fileSize);
					mm.insertFileBoard(ubd);
					/*dao.insertFileBoard(ubd);*/
				} catch (Exception e) {
					throw new ServletException(e);
				} 
			}
		}	
		
		// 페이지 이동
		response.sendRedirect(request.getContextPath() + "/board/list");
	}
}










