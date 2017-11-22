package freeBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionPool;

public class FreeBoardDAO 
{	
	public List<FreeBoardDomain> getFreeBoardList(Page page)
	{
		List<FreeBoardDomain> list = new ArrayList<>();
		
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnectionPool.getConnection();
			
			StringBuffer sql = new StringBuffer();

			sql.append("select * ") 
				.append(" from(select rownum rnum, a.*  ")
				.append(" 	from (select *  ")
				.append(" 		from t_freeboard  ")
				.append(" 	order by no desc)a)  ")
				.append(" where rnum between ? and ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, page.getBegin());
			pstmt.setInt(2, page.getEnd());

			rs = pstmt.executeQuery();
			while(rs.next())
			{
				FreeBoardDomain fbd = new FreeBoardDomain();
				
				fbd.setNo(rs.getInt("no"))
				   .setTitle(rs.getString("title"))
				   .setContents(rs.getString("contents"))
				   .setWriter(rs.getString("writer"))
				   .setRegDate(rs.getDate("reg_date"));
				
				list.add(fbd);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
		
		return list;
	}
	
	public void insertBoard(FreeBoardDomain board)
			throws Exception {

		// t17_board 테이블에 데이터를 입력..
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into t_freeboard( ");
			sql.append("	no,  ");
			sql.append("	title,  ");
			sql.append("	writer,  ");
			sql.append("	contents  ");
			sql.append(") values (  ");
			sql.append("	s_freeboard_no.nextval,  ");
			sql.append("   ?, ?, ? ");
			sql.append(") ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getWriter());
			pstmt.setString(index++, board.getContents());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
	}
	
	public FreeBoardDomain detailBoard(int no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t_freeboard ")
			   .append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) 
			{
				FreeBoardDomain board = new FreeBoardDomain();
				board.setNo(no);
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				return board;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
		return null;
	}
	
	public FreeBoardCommentDomain commentDetailBoard(int no, int commentNo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t_freecommentboard ")
			   .append(" where no = ? and ")
			   .append(" comment_no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.setInt(2, commentNo);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				FreeBoardCommentDomain board = new FreeBoardCommentDomain();
				board.setNo(no);
				board.setCommentNo(commentNo);
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				return board;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
		return null;
	}
	
	public List<FreeBoardCommentDomain> commentListBoard(int no) throws Exception {
		List<FreeBoardCommentDomain> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * ")
			   .append("  from t_freecommentboard ")
			   .append(" where no = ? ")
			   .append(" order by comment_no desc ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				FreeBoardCommentDomain commentBoard = new FreeBoardCommentDomain();
				commentBoard.setCommentNo(rs.getInt("comment_no"));
				commentBoard.setNo(rs.getInt("no"));
				commentBoard.setWriter(rs.getString("writer"));
				commentBoard.setContents(rs.getString("contents"));
				commentBoard.setRegDate(rs.getDate("reg_date"));
				list.add(commentBoard);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
			ConnectionPool.releaseConnection(con);
		}
		return list;
	}
	
	public void deleteBoard(int no) throws Exception 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("delete ")
			   .append("  from t_freeboard ")
			   .append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
			ConnectionPool.releaseConnection(con);
		}
	}
	
	public void modifyBoard(FreeBoardDomain board) throws Exception 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("update t_freeboard ")
			   .append("   set title = ?, ")
			   .append("       contents = ?, ")
			   .append("       writer = ? ")
			   .append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getContents());
			pstmt.setString(index++, board.getWriter());
			pstmt.setInt(index++, board.getNo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {}
			ConnectionPool.releaseConnection(con);
		}
		
	}
	
	public void commentInsertBoard(FreeBoardCommentDomain commentBoard)throws Exception 
	{

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into t_freecommentboard( ");
			sql.append("	comment_no,  ");
			sql.append("	no,  ");
			sql.append("	writer,  ");
			sql.append("	contents  ");
			sql.append(") values (  ");
			sql.append("	s_freecommentboard_no.nextval,  ");
			sql.append("   ?, ?, ?");
			sql.append(") ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, commentBoard.getNo());
			pstmt.setString(index++, commentBoard.getWriter());
			pstmt.setString(index++, commentBoard.getContents());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
	}
	
	public void deleteCommentBoard(int no, int commentNo)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try 
		{
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("delete ")
			   .append(" from t_freecommentboard ")
			   .append( "where no = ? and comment_no = ?");
			
			int i = 1;
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(i++, no);
			pstmt.setInt(i++, commentNo);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}	finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
				ConnectionPool.releaseConnection(con);
		}
	}
	
	public void commentModifyBoard(FreeBoardCommentDomain board) throws Exception 
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		System.out.println("!!!!!" + board.getNo());
		System.out.println("!!!!!" + board.getCommentNo());
		System.out.println("!!!!!" + board.getContents());
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("update t_freecommentboard ")
			   .append("    set   contents = ? ")
			   .append(" where no = ? and ")
			   .append(" comment_no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getContents());
			pstmt.setInt(index++, board.getNo());
			pstmt.setInt(index++, board.getCommentNo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {}
			ConnectionPool.releaseConnection(con);
		}
		
	}
	
	public int freeBoardCount() throws Exception
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select count(*) from t_freeboard "); 
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
			ConnectionPool.releaseConnection(con);
		}
		
		return 0;
	}
	
}
