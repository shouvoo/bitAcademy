package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from exam");
			
			while(rs.next())
			{
				System.out.print(rs.getInt("no")+",");
				System.out.print(rs.getString("title")+",");
				System.out.print(rs.getString("sid")+",");
				System.out.print(rs.getInt("kor")+",");
				System.out.print(rs.getInt("eng")+",");
				System.out.println(rs.getInt("mat"));
				
			}
			rs.close();
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
