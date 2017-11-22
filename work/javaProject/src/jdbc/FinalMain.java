package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class FinalMain 
{

	static int total, average, kor, eng, math;
	static String title;
	static ArrayList scoreList = new ArrayList();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from exam");
			while(rs.next())
			{
				
				
				if(rs.getString("title").equals("final"))
				{
					/*System.out.println(title + "   국어 : " +  kor + 
							"   영어 : " +  eng + "   수학 : " +  math + " : " + cnt);*/
					ArrayList list = new ArrayList();
					
					title = rs.getString("title");
					kor = rs.getInt("kor");
					eng = rs.getInt("eng");
					math = rs.getInt("mat");
					list.add(title);
					list.add(kor);
					list.add(eng);
					list.add(math);
					scoreList.addAll(list);
					System.out.println(title + "   국어 : " +  kor + 
							"   영어 : " +  eng + "   수학 : " +  math);
				}
				
			}
			
			//System.out.println(scoreList.get(1));
			for (Object sl : scoreList) 
			{
				System.out.println(sl);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
