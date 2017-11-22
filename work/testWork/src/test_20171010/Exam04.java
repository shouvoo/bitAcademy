package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Exam04 
{
	String fName;
	char comment;
	String delm;
	HashMap<String, String> map;
	
	public Exam04(String fName)  throws Exception 
	{
		this.fName = fName;
		this.comment = '#'; // �ּ� ������ # ��ȣ.
		this.delm = "=>"; // ���� ���� ������ = ��ȣ.
		map = new HashMap<>(); // ������ �Ľ��Ͽ� key, value ������ �����ϱ� ���� ����
		
		
	}
	
	
	public String getValue(String name) 
	{
	 // ���α׷� ���� �κ� ---------------------------
	 // �ؽ����� Ű�� �ش��ϴ� ���� ���Ͻ�Ű���� ����.
	 // ---------------------------------------------------------
		return map.get(name);
	}

	 public void parse() throws IOException 
	 {
	// ���α׷� ���� �κ� --------------------------------------
	 // 1. ���Ϸκ��� ������ �о�� �Ľ� �ϴ� �κ��̴�.
	 // 2. ���� ù ���ڰ� ��#�� �� ���� �ּ��̹Ƿ� ���������� �а�,
	 // 3. �ּ��� �ƴ� ���� ���� �����̹Ƿ�.. �������� �������� delm (��=>��)��
	 // �̿��Ͽ� key, value �� �����Ͽ� �ؽ� �ʿ� �����ϴ� ����� �ϼ��϶�.
	 //---------------------------------------------------------
		FileReader fr = new FileReader(fName);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int num = 0;
		for (int i = 0; (line = br.readLine()) != null; i++) 
		{
			if(!line.substring(0,  1).equals(this.comment + ""))
			{
				String [] str = line.split(this.delm);
				map.put(str[0], str[1]);
			};
		}
		 
	 }

	 public static void main(String args[]) throws Exception 
	 { // ���� ���� ������
		 Exam04 cr = new Exam04("data/myserver.txt");

		 try 
		 {
			 cr.parse();
			 System.out.println(cr.getValue("port"));
			 System.out.println(cr.getValue("server"));
			 System.out.println(cr.getValue("admin"));
		 } catch (Exception e) { 
			 
		 }
	}
}
