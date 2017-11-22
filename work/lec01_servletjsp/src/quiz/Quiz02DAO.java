package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Quiz02DAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql,id = "hr", pw="hr", url="localhost:1521:xe";
	
	public Quiz02DAO() {
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@"+url,id, pw);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Quiz02VO> list()
	{
		ArrayList<Quiz02VO> res = new ArrayList<>();
		sql = "select * from stud";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			
			rs = ptmt.executeQuery();
			
			while(rs.next())
			{
				Quiz02VO vo = new Quiz02VO();
				vo.setId(rs.getString("id"));
				vo.setGender(rs.getString("gender"));
				vo.setEmail(rs.getString("email"));
				
				
				res.add(vo);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	public Quiz02VO detail(String id, int pw)
	{
		Quiz02VO res = null;
		sql = "select * from stud where id = ? and pw = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, pw);
			
			rs = ptmt.executeQuery();
			
			if(rs.next())
			{
				res = new Quiz02VO();
				res.setId(rs.getString("id"));
				res.setGender(rs.getString("gender"));
				res.setEmail(rs.getString("email"));
				res.setPw(rs.getString("pw"));
				res.setContent(rs.getString("content"));
				res.setHobby(rs.getString("hobby"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	public void insert(Quiz02VO vo)
	{
		sql = "insert into stud (id, pw, email, gender, hobby, content) "
				+ "values (?,?,?,?,?,?)";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, vo.id);
			ptmt.setString(2, vo.pw);
			ptmt.setString(3, vo.email);
			ptmt.setString(4, vo.gender);
			ptmt.setString(5, vo.hobby);
			ptmt.setString(6, vo.content);
					
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void delete(String id)
	{
		sql = "delete from stud where id = ?";
		//System.out.println(sql);
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void close()
	{
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(ptmt!=null) try {ptmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
}
