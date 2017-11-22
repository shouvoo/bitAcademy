package kr.co.mlec.board;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.MyAppSqlConfig;




public class BoardMapper {

	private static SqlSession session;
	private final static String NS = "kr.co.mlec.member.mapper.MemberMapper.";
	
	public BoardMapper() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List<BoardDomain> listBoard() throws Exception
	{		
		List<BoardDomain> list = session.selectList(NS + "getMemberList");
		return list;
	}
	
	public void deleteBoard(int no) throws Exception
	{
		session.delete(NS + "deleteBoard", no);
	}
	
	public  BoardDomain detailBoard(int no) throws Exception
	{
		BoardDomain board = session.selectOne(NS + "detailBoard", no);
		return board;
	}
	
	public void deleteCommentBoard(CommentBoardDomain cbd) throws Exception
	{
		session.delete(NS + "deleteCommentBoard", cbd);
	}
	
	public void commentModifyBoard(CommentBoardDomain cbd) throws Exception
	{
		session.update(NS + "commentModifyBoard", cbd);
	}
	
	public CommentBoardDomain commentDetailBoard(CommentBoardDomain cbd) throws Exception
	{		
		CommentBoardDomain board = session.selectOne(NS + "commentDetailBoard", cbd);
		return board;
	}
	
	public void modifyBoard(BoardDomain bd) throws Exception
	{
		session.update(NS + "modifyBoard", bd);
	}
	
	public int getNextVal() throws Exception
	{
		int no = session.selectOne(NS + "getNextVal");
		return no;
	}
	
	public void insertBoard(BoardDomain bd) throws Exception
	{
		session.insert(NS + "insertBoard", bd); 
	}
	
	public void insertFileBoard(UploadBoardDomain ubd) throws Exception
	{
		session.insert(NS + "insertFileBoard", ubd); 
	}
	
	public void commentInsertBoard(CommentBoardDomain cbd) throws Exception
	{
		session.insert(NS + "commentInsertBoard", cbd); 
	}
	
	
	public List<CommentBoardDomain> commentListBoard(int no) throws Exception
	{		
		List<CommentBoardDomain> list = session.selectList(NS + "commentListBoard", no);
		return list;
	}
	
	public List<UploadBoardDomain> fileBoard(int no) throws Exception
	{		
		List<UploadBoardDomain> list = session.selectList(NS + "fileBoard", no);
		return list;
	}
	
	
	
}






















