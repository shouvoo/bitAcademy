package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionPool;
import fixBoard.FixVO;
import freeBoard.FreeBoardDomain;
import qna.QnaDomain;

public class MemberDAO {

	public void insertMember(MemberDomain member) throws Exception{
		Connection con= null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into t_member (")
				.append("id, pass, name, email)")
				.append("values(?,?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, member.getId());
			pstmt.setString(index++, member.getPass());
			pstmt.setString(index++, member.getName());
			pstmt.setString(index++, member.getEmail());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		
	}
	
	public MemberDomain detailMember(MemberDomain member) throws Exception {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * from t_member where id =? and pass = ? and chk = 'Y' ");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPass());
			
			ResultSet rs= pstmt.executeQuery();
			
			if(rs.next()) {
				MemberDomain user = new MemberDomain();
				user.setId(rs.getString("id"));
				user.setPass(rs.getString("pass"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				return user;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		return null;
	}
	
	public boolean compareMember(String id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select id from t_member where id=?");
			
			pstmt= con.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		return true;
		
	}
	
public List<QnaDomain> qnaMemberInfo(String id) throws Exception {
		List<QnaDomain> qlist = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("select no, title, reg_date, a_comment, a_reg_date from ")
				.append("(select rownum rnum , a.* from (select  * from t_qboard where writer = ")
				.append("(select id from  t_member where id = ? and chk = 'Y') order by reg_date desc) a) ")
				.append("where rnum < 3");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next()) {
				QnaDomain qna = new QnaDomain();
				qna.setNo(rs.getInt("no"));
				qna.setTitle(rs.getString("title"));
				qna.setRegDate(rs.getTimestamp("reg_date"));
				qna.setAnComment(rs.getString("a_comment"));
				qna.setAnRegDate(rs.getTimestamp("a_reg_date"));
				qlist.add(qna);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		return qlist;
	}

public List<FreeBoardDomain> freeMemberInfo(String id) throws Exception {
	List<FreeBoardDomain> flist = new ArrayList<>();
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		con = ConnectionPool.getConnection();
		StringBuffer sql = new StringBuffer();
		
		sql.append("select no, title, reg_date from ")
			.append("(select rownum rnum , a.* from (select  * from t_freeboard where writer = ")
			.append("(select id from  t_member where id = ? and chk = 'Y') order by reg_date desc) a) ")
			.append("where rnum < 3");
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, id);
		
		ResultSet rs= pstmt.executeQuery();
		
		while(rs.next()) {
			FreeBoardDomain free = new FreeBoardDomain();
			free.setNo(rs.getInt("no"));
			free.setTitle(rs.getString("title"));
			free.setRegDate(rs.getTimestamp("reg_date"));
			flist.add(free);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		throw e;
	}finally {
		pstmt.close();
		ConnectionPool.releaseConnection(con);
	}
	return flist;
}
public List<FixVO> fixMemberInfo(String id) throws Exception {
	List<FixVO> fixlist = new ArrayList<>();
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		con = ConnectionPool.getConnection();
		StringBuffer sql = new StringBuffer();
		
		sql.append("select no, title, reg_date from ")
			.append("(select rownum rnum , a.* from (select  * from t_fixboard where writer =")
			.append("(select id from  t_member where id = ? and chk = 'Y') order by reg_date desc) a) ")
			.append("where rnum < 3");
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, id);
		
		ResultSet rs= pstmt.executeQuery();
		
		while(rs.next()) {
			FixVO fix = new FixVO();
			fix.setNo(rs.getInt("no"));
			fix.setTitle(rs.getString("title"));
			fix.setRegDate(rs.getTimestamp("reg_date"));
			fixlist.add(fix);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		throw e;
	}finally {
		pstmt.close();
		ConnectionPool.releaseConnection(con);
	}
	return fixlist;
}

	public void modifyInfo(MemberDomain member) throws Exception {
		Connection con = null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("update t_member set pass = ? , email = ? where id = ? ");
			pstmt =con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, member.getPass());
			pstmt.setString(index++, member.getEmail());
			pstmt.setString(index++, member.getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		
	}
	
	public void withdrawalMember(String id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt= null;
		
		try {
			con= ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			
			sql.append("update t_member set chk = 'N' where id = ? ");
			pstmt =con.prepareStatement(sql.toString());
			
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			pstmt.close();
			ConnectionPool.releaseConnection(con);
		}
		
	}




}
