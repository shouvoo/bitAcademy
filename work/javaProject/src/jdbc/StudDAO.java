package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudDAO 
{

	Connection con;
	//Statement stmt;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public StudDAO() 
	{
		// TODO Auto-generated constructor stub
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	StudVO detail(String id, String pw)
	{
		StudVO res = null;
		sql = "select * from stud where id = ? and pw = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pw);
			rs = ptmt.executeQuery();
			if(rs.next())
			{
				res = new StudVO();
				res.setId(rs.getString("id"));
				res.setName(rs.getString("name"));
				res.setJumin(rs.getString("jumin"));
				res.setPw(rs.getString("pw"));
				res.setTel(rs.getString("tel"));
				res.setEmail(rs.getString("email"));
				res.setGrade(rs.getInt("grade"));
				
			}
		} catch (Exception e) 
		{
			// TODO: handle exception
		} finally 
		{
			close();
		}
		return res;
	}
	
	StudVO [] list()
	{
		StudVO [] res = null;
		
		try 
		{			
			sql = "select count(*) from stud";
			System.out.println(sql);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1));
			
			res = new StudVO[rs.getInt(1)];
			
			/////////////////////////////////////
			
			sql = "select * from stud";
			System.out.println(sql);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			int i = 0;
			while(rs.next())
			{
				res[i] = new StudVO();
				res[i].setId(rs.getString("id"));
				res[i].setName(rs.getString("name"));
				res[i].setJumin(rs.getString("jumin"));
				res[i].setPw(rs.getString("pw"));
				i++;
			}
		} catch (Exception e) 
		{
			// TODO: handle exception
		} finally 
		{
			close();
		}
		return res;
	}
	
	void close()
	{
		if(rs != null) try {rs.close();} catch (Exception e) {};
		if(ptmt != null) try {ptmt.close();} catch (Exception e) {};
		if(con != null) try {con.close();} catch (Exception e) {};
	}

}
