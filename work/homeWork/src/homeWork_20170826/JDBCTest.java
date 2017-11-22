package homeWork_20170826;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest 
{
	
	public static void main(String[] args) 
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "homework", "1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from jdbctest1");
			
			while(rs.next())
			{
				System.out.print(rs.getString("no") + ",");
				System.out.print(rs.getString("kor") + ",");
				System.out.print(rs.getString("eng") + ",");
				System.out.print(rs.getString("mat") + ",");
				System.out.print(rs.getString("title") + ",");
				System.out.println(rs.getString("sid"));
			}
			
			if(rs != null) try {rs.close();} catch (Exception e) {};
			if(stmt != null) try {stmt.close();} catch (Exception e) {};
			if(con != null) try {con.close();} catch (Exception e) {};
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
