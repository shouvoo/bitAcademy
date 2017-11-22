package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamDAO 
{

	Connection con;
	//Statement stmt;  20170907 수정
	PreparedStatement stmt;
	ResultSet rs;
	String sql;
	
	public ExamDAO() 
	{
		// TODO Auto-generated constructor stub
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//stmt = con.createStatement(); 20170907 수정
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	ExamVO detail(int no)
	{
		ExamVO res = null;
		sql = "select * from exam where id =" + no;
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next())
			{
				res = new ExamVO();
				res.no = rs.getInt("id");
				res.sid = rs.getString("sid");
				res.title = rs.getString("title");
				res.kor = rs.getInt("kor");
				res.eng = rs.getInt("eng");
				res.mat = rs.getInt("mat");
				
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
	
	ArrayList<Test3VO> testList()
	{
		ArrayList<Test3VO> res = new ArrayList<>();
		sql = "select * from test3";
		try 
		{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Test3VO vo = new Test3VO();
				vo.id = rs.getInt("id");
				vo.kor = rs.getInt("kor");
				vo.eng = rs.getInt("eng");
				vo.sid = rs.getInt("sid");
				res.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			close();
		}
		return res;
	}
	
	void test3InsertList(ArrayList<Test3VO> list)
	{
		try 
		{
			con.setAutoCommit(false);
			for (Test3VO vo : list) 
			{
				sql = "insert into test3(id, kor, eng, sid) values(?, ?, ?, ?)";
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, vo.id);
				stmt.setInt(2, vo.kor);
				stmt.setInt(3, vo.eng);
				stmt.setInt(4, vo.sid);
				
				System.out.println(stmt.executeUpdate());
			}
			
			con.commit();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}
	
	void test3Insert(Test3VO vo)
	{
		sql = "insert into test3 (id, kor, eng, sid) values (?, ?, ?, ?)";
		try 
		{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, vo.id);
			stmt.setInt(2, vo.kor);
			stmt.setInt(3, vo.eng);
			stmt.setInt(4, vo.sid);
			//stmt.executeUpdate();
			System.out.println(stmt.executeUpdate());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}

	}
	
	void close()
	{
		if(rs != null) try {rs.close();} catch (Exception e) {};
		if(stmt != null) try {stmt.close();} catch (Exception e) {};
		if(con != null) try {con.close();} catch (Exception e) {};
	}

}
