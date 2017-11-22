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
	public List<BoardDomain> listBoard(Page page) throws Exception {
		List<BoardDomain> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ") 
				.append(" from(select rownum rnum, a.*  ")
				.append(" 	from (select *  ")
				.append(" 		from paging_board  ")
				.append(" 	order by no desc)a)  ")
				.append(" where rnum between ? and ? ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, page.getBegin());
			pstmt.setInt(2, page.getEnd());
			
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
	
	public int listBoardCount() throws Exception
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select count(*) from paging_board "); 
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













