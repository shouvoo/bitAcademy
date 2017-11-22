package homeWork_20170907;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

class JDBC
{
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public JDBC() 
	{
		// TODO Auto-generated constructor stub
		setConnection();
	}
	
	private void setConnection()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	ArrayList<DataBank> setData()
	{
		ArrayList<DataBank> db =  new ArrayList<>();
		try 
		{
			
			sql = "select * from exam";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			int cnt = 0;
			while(rs.next())
			{
				db.add(new DataBank());
				db.get(cnt).setTitle(rs.getString("title"));
				db.get(cnt).setKor(rs.getInt("kor"));
				db.get(cnt).setEng(rs.getInt("eng"));
				db.get(cnt).setMat(rs.getInt("mat"));
				cnt++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			close();
		}
		
		return db;
	}
	
	private void close()
	{
		if(rs != null) try{rs.close();} catch(Exception e) {};
		if(ptmt != null) try{ptmt.close();} catch(Exception e) {};
		if(con != null) try{con.close();} catch(Exception e) {};
	}
}

class DataBank
{
	String title;
	int kor, eng, mat;
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public int getKor() 
	{
		return kor;
	}
	public void setKor(int kor) 
	{
		this.kor = kor;
	}
	public int getEng() 
	{
		return eng;
	}
	public void setEng(int eng) 
	{
		this.eng = eng;
	}
	public int getMat() 
	{
		return mat;
	}
	public void setMat(int mat) 
	{
		this.mat = mat;
	}
	public void print()
	{
		String res = "title=" + title + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat;
		System.out.println(res);
	}
}

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<DataBank> db = new JDBC().setData(); 
		
		System.out.println("ÀüÃ¼ exam LIST");
		for (int i = 0; i < db.size(); i++) 
		{
			db.get(i).print();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("exam in final");
		for (int j = 0; j < db.size(); j++) 
		{
			if(db.get(j).title.equals("final")) 
			{
				db.get(j).print();
			}
		}		
		
	}

}
