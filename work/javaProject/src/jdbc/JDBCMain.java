package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from exam");
			//executeQuery 는select 문 사용시
			//executeUpdate 는 그외에 명령어 사용시
			while(rs.next())//rs.next()는 다음 내용이 있을때가지 돌려준다
			{
				System.out.print(rs.getInt("id") + ",");
				System.out.print(rs.getString("title") + ",");
				System.out.print(rs.getString("sid") + ",");
				System.out.print(rs.getInt("kor") + ",");
				System.out.print(rs.getInt("eng") + ",");
				System.out.println(rs.getInt("mat") + ",");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch(Exception  e)
		{
			e.printStackTrace();
		}
		
		
	}

}
