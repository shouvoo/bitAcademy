package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamDAO {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	String sql;
	
	public ExamDAO() {
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
	
	
	
	ArrayList<ReportVO> reportList(String title)
	{
		ArrayList<ReportVO> res =new ArrayList<>();
		sql = "select * from stud, exam " + 
				"where sid = stud.id(+) and title = ?" + 
				"order by id desc";
		try {
			
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, title);
			
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				ReportVO vo = new ReportVO();
				
				vo.setId(rs.getString("id"));
				vo.setJumin(rs.getString("jumin"));
				vo.setName(rs.getString("name"));
				vo.setPw(rs.getString("pw"));
				vo.setTitle(rs.getString("title"));
				vo.setJum(rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"));
				vo.setGrade(rs.getInt("grade"));
				
				
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
	
	ExamVO detail(int no)
	{
		ExamVO res =null;
		sql = "select * from exam where no ="+no;
		try {
			
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			if(rs.next())
			{
				res = new ExamVO();
				res.no = rs.getInt("no");
				res.title=rs.getString("title");
				res.sid=rs.getString("sid");
				res.kor = rs.getInt("kor");
				res.eng = rs.getInt("eng");
				res.mat = rs.getInt("mat");
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
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
}
