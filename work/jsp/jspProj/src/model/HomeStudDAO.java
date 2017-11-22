package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HomeStudDAO 
{
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql = "", id = "hr", pw = "hr", url = "localhost:1521:xe";
	
	public HomeStudDAO() 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@" + url, id, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(HomeStudVO vo)
	{
		sql = "insert into stud(id, pw, email, gender, hobby, content, name, grade, friend, jumin)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, vo.id);
			ptmt.setString(2, vo.pw);
			ptmt.setString(3, vo.email);
			ptmt.setString(4, vo.gender);
			ptmt.setString(5, vo.hobby);
			ptmt.setString(6, vo.content);
			ptmt.setString(7, vo.name);
			ptmt.setString(8, vo.grade);
			ptmt.setString(9, vo.friend);
			ptmt.setString(10, vo.jumin);
			
			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public ArrayList<HomeStudVO> getData()
	{
		ArrayList<HomeStudVO> dbArrayList = new ArrayList<>();
		sql = "select * from stud";
		
		try 
		{
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next())
			{
				HomeStudVO db = new HomeStudVO();
				db.setName(rs.getString("name"));
				db.setJumin(rs.getString("jumin"));
				db.setPw(rs.getString("pw"));
				db.setGender(rs.getString("gender"));
				db.setGrade(rs.getString("grade"));
				db.setFriend(rs.getString("friend"));
				db.setHobby(rs.getString("hobby"));
				db.setEmail(rs.getString("email"));
				db.setContent(rs.getString("content"));
				
				dbArrayList.add(db);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return  dbArrayList;
	}

	public void close()
	{
		if(rs != null) try { rs.close(); } catch (Exception e) {};
		if(ptmt != null) try { ptmt.close(); } catch (Exception e) {};
		if(con != null) try { con.close(); } catch (Exception e) {};
	}
}

























