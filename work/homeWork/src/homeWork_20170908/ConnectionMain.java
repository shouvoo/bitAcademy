package homeWork_20170908;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConnectionMain 
{

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public ConnectionMain() {
		// TODO Auto-generated constructor stub
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	
	ArrayList<DataBank> getData()
	{
		ArrayList<DataBank> dbArrayList = new ArrayList<>();
		sql = "select * from work";
		
		try 
		{
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next())
			{
				DataBank db = new DataBank();
				db.setName(rs.getString("name"));
				db.setId(rs.getString("id"));
				db.setPass(rs.getString("pass"));
				db.setPhone(rs.getString("phone"));
				dbArrayList.add(db);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			allClose();
		}
		
		
		return dbArrayList;
	}
	
	void insertMultiData(ArrayList<DataBank> dbList)
	{
		try 
		{
			for (DataBank db : dbList) 
			{
				sql = "insert into work(name, id, pass, phone) values(?, ?, ?, ?)";
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, db.getName());
				ptmt.setString(2, db.getId());
				ptmt.setString(3, db.getPass());
				ptmt.setString(4, db.getPhone());
				
				System.out.println(ptmt.executeUpdate());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			allClose();
		}

	}
	
	void insertSingleData(String name, String id, String pass, String phone)
	{
		try 
		{
			sql = "insert into work(name, id, pass, phone) values(?, ?, ?, ?)";
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, name);
			ptmt.setString(2, id);
			ptmt.setString(3, pass);
			ptmt.setString(4, phone);
			
			System.out.println(ptmt.executeUpdate());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			allClose();
		}
	}
	
	void deleteMultiData(ArrayList<String> deleteList)
	{
		try 
		{
			for (String name : deleteList) 
			{
				sql = "delete from work where name = ?";
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, name);				
				System.out.println(ptmt.executeUpdate());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			allClose();
		}
	}
	
	void deleteSingleData(String deleteStr)
	{
		try 
		{
			sql = "delete from work where name = ?";
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deleteStr);				
			System.out.println(ptmt.executeUpdate());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			allClose();
		}
	}
	
	void allClose()
	{
		if(rs != null) try { rs.close(); } catch(Exception e) {};
		if(ptmt != null) try { ptmt.close(); } catch(Exception e) {};
		if(con != null) try { con.close(); } catch(Exception e) {};
	}
	

}










