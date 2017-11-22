package kr.co.mlec.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.mvc.ModelAndView;

import kr.co.mlec.common.MyAppSqlConfig;

public class BoardServiceImpl implements BoardService
{
	private SqlSession session = null;
	private BoardMapper dao = null;

	public BoardServiceImpl() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
		dao = session.getMapper(BoardMapper.class);
	}
	
	public void delete(int no) throws Exception 
	{
		dao.deleteBoard(no);
	}	
	
	public BoardDomain detail(int no) throws Exception 
	{
		return dao.detailBoard(no);
	}

	public List<BoardDomain> list(int no) throws Exception 
	{
		return dao.listBoard();
	}

	public List<BoardDomain> listAjax(int no) throws Exception 
	{
		return dao.listBoard();
	}

	public void modify(BoardDomain board) throws Exception
	{
		dao.modifyBoard(board);
	}

	public BoardDomain modifyForm(int no) throws Exception 
	{
		return dao.detailBoard(no);
	}

	public void write(BoardDomain board) throws Exception 
	{
		dao.insertBoard(board);
	}

	public void writeForm() throws Exception 
	{
	}
	
	
	
}

























