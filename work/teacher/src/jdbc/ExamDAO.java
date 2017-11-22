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
	
	ArrayList<Test3VO> testList()
	{
		ArrayList<Test3VO> res =  new ArrayList<>();
		
		sql = "select * from test3";
		
		try {
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
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		
		
		return res;
	}
	
	
	void test3Insert(Test3VO vo)
	{
		sql = "insert into test3 (id, kor, eng, sid) values (?,?,?,?)";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, vo.id);
			stmt.setInt(2, vo.kor);
			stmt.setInt(3, vo.eng);
			stmt.setInt(4, vo.sid);
			
			System.out.println(stmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	
	void test3InsertList(ArrayList<Test3VO> list)
	{
		
		
		try {
			con.setAutoCommit(false);
			
			for (Test3VO vo : list) {
				
			
			
				sql = "insert into test3 (id, kor, eng, sid) values (?,?,?,?)";
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, vo.id);
				stmt.setInt(2, vo.kor);
				stmt.setInt(3, vo.eng);
				stmt.setInt(4, vo.sid);
				
				
				
				System.out.println(stmt.executeUpdate());
				
				
			}
			
			con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	
	void test3Update(Test3VO vo)
	{
		sql = "update test3 set kor= ?, eng = ?, sid = ? where id = ?";
		
		try {
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, vo.kor);
			stmt.setInt(2, vo.eng);
			stmt.setInt(3, vo.sid);
			stmt.setInt(4, vo.id);
			
			System.out.println(stmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	void test3Delete(Test3VO vo)
	{
		sql = "delete from test3 where id = ? and eng =?";
		
		try {
			stmt = con.prepareStatement(sql);
			
			
			stmt.setInt(1, vo.id);
			stmt.setInt(2, vo.eng);
			
			System.out.println(stmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	void close()
	{
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
	
}

