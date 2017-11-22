package day05.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import board.BoardDomain;
import common.ConnectionPool;

public class LoginDAO {
	// Login detailMember(Login) 
	public Login detailMember(Login login) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ")
			   .append("  from t17_member ")
			   .append(" where id = ? ")
			   .append("   and pass = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, login.getId());
			pstmt.setString(2, login.getPass());
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) 
			{
				Login user = new Login();
				user.setId(login.getId());
				user.setPass(login.getPass());
				user.setName(rs.getString("name"));
				return user;
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
}
