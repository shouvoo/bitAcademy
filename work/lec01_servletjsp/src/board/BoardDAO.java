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

public class BoardDAO {
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
			sql.append("	s17_board_no.nextval,  ");
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
				commentBoard.setNo(rs.getInt("comment_no"));
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
}













