package kr.co.mlec.member.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import freeBoard.FreeBoardCommentDomain;
import freeBoard.FreeBoardDomain;
import freeBoard.Page;




public class MemberMapper {

	private static SqlSession session;
	private final static String NS = "kr.co.mlec.member.mapper.MemberMapper.";
	
	public MemberMapper() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	/* */
	public void deleteCommentBoard(FreeBoardCommentDomain commentBoard) throws Exception
	{
		session.delete(NS + "deleteCommentBoard", commentBoard);
	}
	
	public  FreeBoardDomain detailBoard(int no) throws Exception
	{
		FreeBoardDomain board = session.selectOne(NS + "detailBoard", no);
		return board;
	}
	
	public void deleteBoard(int no) throws Exception
	{
		session.delete(NS + "deleteBoard", no);
	}
	
	public void commentModifyBoard(FreeBoardCommentDomain commentBoard) throws Exception
	{
		session.update(NS + "commentModifyBoard", commentBoard);
	}
	
	public FreeBoardCommentDomain commentDetailBoard(FreeBoardCommentDomain commentBoard) throws Exception
	{		
		FreeBoardCommentDomain board = session.selectOne(NS + "commentDetailBoard", commentBoard);
		return board;
	}
	
	public List<FreeBoardCommentDomain> commentListBoard(int no) throws Exception
	{
		List<FreeBoardCommentDomain> list = session.selectList(NS + "commentListBoard", no);
		return list;
	}
	
	public int getNextVal() throws Exception
	{
		int no = session.selectOne(NS + "getNextVal");
		return no;
	}
	
	public void insertBoard(FreeBoardDomain board)
	{
		session.insert(NS + "insertBoard", board);
	}
	
	public void commentInsertBoard(FreeBoardCommentDomain commentBoard)
	{
		session.insert(NS + "commentInsertBoard", commentBoard);
	}
	
	public void modifyBoard(FreeBoardDomain board) throws Exception
	{
		session.update(NS + "modifyBoard", board);
	}
	
	
	public List<FreeBoardDomain> getFreeBoardList(Page page) throws Exception
	{
		List<FreeBoardDomain> list = session.selectList(NS + "getFreeBoardList", page);
		return list;
	}
	
	public int freeBoardCount() throws Exception
	{
		int count = session.selectOne(NS + "freeBoardCount");
		return count;
	}
	
}






















