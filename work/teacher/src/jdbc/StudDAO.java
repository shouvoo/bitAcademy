package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public StudDAO() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	StudVO [] list()
	{
		StudVO [] res =null;
		
		try {
			
			
			sql = "select count(*) from stud";
			
			System.out.println(sql);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			rs.next();
			
			System.out.println(rs.getInt(1));
			
			res = new StudVO[rs.getInt(1)];
			
			//////////////////
			
			sql = "select * from stud";
			
			System.out.println(sql);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			int i=0;
			while(rs.next())
			{
				res[i] = new StudVO();
				
				res[i].setId(rs.getString("id"));
				res[i].setName(rs.getString("name"));
				res[i].setPw(rs.getString("pw"));
				res[i].setJumin(rs.getString("jumin"));
				
				i++;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
		
	}
	
	StudVO detail(String id, String pw)
	{
		StudVO res =null;
		sql = "select * from stud where id = ? and pw = ? ";
		
		System.out.println(sql);
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
				res.setPw(rs.getString("pw"));
				res.setJumin(rs.getString("jumin"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
		
	}
	
	void close()
	{
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(ptmt!=null) try {ptmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
}
