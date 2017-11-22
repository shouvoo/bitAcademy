/*
 *   insert 
 *   delete
 *   detail
 *   modify
 * 	 list
 */
package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionPool;

public class BoardDAO 
{
	public int getNextVal() throws Exception 
	{
		int listNo = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select ")
			   .append(" s17_board_no.nextval ")
			   .append(" from dual ");
			
			/*sql.append("select ")
			   .append(" s17_board_no.nextval as no ")
			   .append(" from dual ");*/
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				listNo = rs.getInt(1);
				/*listNo = rs.getInt("no");*/ // as no 하면 dual 한 값을 지정한 no변수로 가져올수있음
				/*listNo = rs.getInt(1);*/ //select 값이 한개 일때는 1로 값을 가져올수있음
				return listNo;
			}

		} catch (Exception e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
		}

		return -1;
	}
	
	public void insertBoard(BoardDomain board)
			throws Exception {

		// t17_board 테이블에 데이터를 입력..
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into t17_board( ");
			sql.append("	no,  ");
			sql.append("	title,  ");
			sql.append("	writer,  ");
			sql.append("	content  ");
			sql.append(") values (  ");
			sql.append("	"+board.getNo()+",  ");
			sql.append("   ?, ?, ? ");
			sql.append(") ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getWriter());
			pstmt.setString(index++, board.getContent());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
		}
	}
	
	public void commentInsertBoard(CommentBoardDomain commentBoard)
			throws Exception {

		// t17_board 테이블에 데이터를 입력..
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into t17_comment( ");
			sql.append("	comment_no,  ");
			sql.append("	no,  ");
			sql.append("	writer,  ");
			sql.append("	content  ");
			sql.append(") values (  ");
			sql.append("	t17_comment_no.nextval,  ");
			sql.append("   ?, ?, ? ");
			sql.append(") ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, commentBoard.getNo());
			pstmt.setString(index++, commentBoard.getWriter());
			pstmt.setString(index++, commentBoard.getContent());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
		}
	}
	
	
	public void modifyBoard(BoardDomain board) 
			throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("update t17_board ")
			   .append("   set title = ?, ")
			   .append("       content = ?, ")
			   .append("       writer = ? ")
			   .append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getContent());
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
	
	public void commentModifyBoard(CommentBoardDomain board) 
			throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("update t17_comment ")
			   .append("    set   content = ?, ")
			   .append("       writer = ? ")
			   .append(" where no = ? and ")
			   .append(" comment_no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getContent());
			pstmt.setString(index++, board.getWriter());
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
	
	public void deleteBoard(int no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("delete ")
			   .append("  from t17_board ")
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
	
	public void deleteCommentBoard(int no, int commentNo)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try 
		{
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("delete ")
			   .append(" from t17_comment ")
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
	
	public BoardDomain detailBoard(int no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t17_board ")
			   .append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				BoardDomain board = new BoardDomain();
				board.setNo(no);
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
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
	
	public CommentBoardDomain commentDetailBoard(int no, int commentNo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t17_comment ")
			   .append(" where no = ? and ")
			   .append(" comment_no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.setInt(2, commentNo);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				CommentBoardDomain board = new CommentBoardDomain();
				board.setNo(no);
				board.setCommentNo(commentNo);
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
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
	
	public List<BoardDomain> listBoard() throws Exception {
		List<BoardDomain> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t17_board ")
			   .append(" order by no desc ");
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDomain board = new BoardDomain();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("reg_date"));
				list.add(board);
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
	
	public List<CommentBoardDomain> commentListBoard(int no) throws Exception {
		List<CommentBoardDomain> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * ")
			   .append("  from t17_comment ")
			   .append(" where no = ? ")
			   .append(" order by comment_no desc ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				CommentBoardDomain commentBoard = new CommentBoardDomain();
				commentBoard.setCommentNo(rs.getInt("comment_no"));
				commentBoard.setNo(rs.getInt("no"));
				commentBoard.setWriter(rs.getString("writer"));
				commentBoard.setContent(rs.getString("content"));
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
	
	public List<UploadBoardDomain> fileBoard(int no) throws Exception {
		List<UploadBoardDomain> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		System.out.println(no);
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * ")
			   .append(" from t17_board_file ")
			   .append(" where no = ? ")
			   .append(" order by file_no desc ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				UploadBoardDomain fileBoard = new UploadBoardDomain();
				fileBoard.setFileNo(rs.getInt("file_no"));
				fileBoard.setNo(rs.getInt("no"));
				fileBoard.setFilePath(rs.getString("file_path"));
				fileBoard.setOriName(rs.getString("ori_name"));
				fileBoard.setSystemName(rs.getString("system_name"));
				fileBoard.setFileSize(rs.getLong("file_size"));
				list.add(fileBoard);
				
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
	
	public void insertFileBoard(UploadBoardDomain board)
			throws Exception {

		// t17_board 테이블에 데이터를 입력..
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into t17_board_file( ");
			sql.append("	file_no,  ");
			sql.append("	no,  ");
			sql.append("	file_path,  ");
			sql.append("	ori_name,  ");
			sql.append("	system_name,  ");
			sql.append("	file_size  ");
			sql.append(") values (  ");
			sql.append("	s17_board_file_no.nextval,  ");
			sql.append("	"+board.getNo()+",  ");
			sql.append("   ?, ?, ?, ? ");
			sql.append(") ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, board.getFilePath());
			pstmt.setString(index++, board.getOriName());
			pstmt.setString(index++, board.getSystemName());
			pstmt.setLong(index++, board.getFileSize());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
		}
	}
}













