package kr.co.mlec.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;
import org.springframework.web.mvc.RequestParam;

import kr.co.mlec.common.MyAppSqlConfig;

@Controller
public class BoardController {
	
	private BoardService service = null;
	
	public BoardController()
	{
		service = new BoardServiceImpl();
	}
	
	@RequestMapping("/board/delete.do")
	public String delete(int no) throws Exception {
		service.delete(no);
		return "redirect:/board/list.do";
	}	
	
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(int no) throws Exception {
		ModelAndView mav = new ModelAndView("/board/detail.jsp");
		mav.addAttribute("board", service.detail(no));
		return mav;
	}	
	
	@RequestMapping("/board/list.do")
	public ModelAndView list(
			@RequestParam(name="pageNo", defaultValue="1") int no) throws Exception {
	
		ModelAndView mav = new ModelAndView("/board/list.jsp");
		// 데이터를 사용할 페이지로 이동
		mav.addAttribute("list", service.list(no));
		
		return mav;
	}	
	
	
	@RequestMapping("/board/list.json")
	public List<BoardDomain> listAjax(
			@RequestParam(name="pageNo", defaultValue="1") int no) throws Exception {	
		return service.listAjax(no);
	}	


	@RequestMapping("/board/modify.do")
	public String modify(BoardDomain board) throws Exception {
		// DAO를 호출해서 작업처리 지시
		service.modify(board);
		return "redirect:/board/list.do";
	}

	@RequestMapping("/board/modifyform.do")
	public ModelAndView modifyForm(int no) throws Exception {
		BoardDomain board = service.modifyForm(no);
		ModelAndView mav = new ModelAndView("/board/modifyForm.jsp");
		mav.addAttribute("board", board);
		return mav;
	}
	
	@RequestMapping("/board/write.do")
	public String write(BoardDomain board) throws Exception {
		// DAO를 호출해서 작업처리 지시
		service.write(board);
		// 페이지 이동
		return "redirect:/board/list.do";
	}	

	@RequestMapping("/board/writeform.do")
	public void writeForm() throws Exception {}
}







