package homeWork_20170826;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetJDBC 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	String classAddres = "oracle.jdbc.driver.OracleDriver";
	String connectionAddres = "jdbc:oracle:thin:@localhost:1521:xe";
	String connectionId = "homework";
	String connectionPw = "1234";
	String queryAddres = "select * from jdbctest1";
	
	
	
	public GetJDBC() 
	{
		try 
		{
			Class.forName(classAddres);
			con = DriverManager.getConnection(connectionAddres	, connectionId, connectionPw);
			stmt = con.createStatement();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	TestPrint getValue(String type, int id)
	{
		TestPrint tp = null;
		//sql = "select * from exam where id =" + no;
		sql = queryAddres + " where " + type + " =" +  id;
		try 
		{
			rs = stmt.executeQuery(sql);
			if(rs.next())
			{
				tp = new TestPrint();
				tp.no = rs.getInt("no");
				tp.title = rs.getString("title");
				tp.sid = rs.getString("sid");
				tp.kor = rs.getInt("kor");
				tp.eng = rs.getInt("eng");
				tp.mat = rs.getInt("mat");
			}
		} catch (Exception e) 
		{
			// TODO: handle exception
		} finally
		{
			closeConnction();
		}
		return tp;
	}
	
	public void closeConnction()
	{
		if(rs != null) try { rs.close(); } catch (Exception e){};
		if(stmt != null) try { stmt.close(); } catch (Exception e){};
		if(con != null) try { con.close(); } catch (Exception e){};
	}

}














