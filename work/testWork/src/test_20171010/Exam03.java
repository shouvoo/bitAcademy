package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Exam03 
{
	public static void main(String[] args) 
	{
		try {
			searchEmployeeInfo("data/employee.txt", "��");
			searchEmployeeInfo("data/employee.txt", "��");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	 /**
	* @param readFileName : ���� ���ϸ�
	 * @param lastName : ã�� ����
	 * @throws Exception
	 */
	 public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception 
	 {
		 // ���� ����
		FileReader fr = new FileReader(readFileName);
		BufferedReader br = new BufferedReader(fr);
		String [] title = {"�̸�", "����", "�μ�", "����"};
		
		String line;
		int num = 0;
		for (int i = 0; (line = br.readLine()) != null; i++) 
		{
			if((line.contains(lastName)))
			{
				//System.out.println((i + 1) + "  :  " + line);
				String [] str = line.split(":");
				for (int j = 0; j < str.length; j++) 
				{
					System.out.print(title[j] + " : " + str[j] + "\t");
				}
				System.out.println();
				num++;
			}
		}
		
		System.out.println("==========================================================");
		System.out.println(lastName + "�� ���� ���� ȸ���� �� " + num + "�� �Դϴ�");
		System.out.println("==========================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		br.close();
		fr.close();
	 }
}
