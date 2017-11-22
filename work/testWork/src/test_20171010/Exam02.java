package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Exam02 
{
	 // main �޼���� �������� ������.	 
	 public static void main(String[] args) 
	 {
		 try 
		 {
			 searchFileContent("data/find.txt", "System");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }

	 
	 public static void searchFileContent(String readFileName, String findStr) throws Exception 
	 {
		// �Ʒ� �κп� ������ �����մϴ�. Ŭ������ �ٸ� �κ��� �������� �ʽ��ϴ�.
		 ////////////////////////////////////////////////////
		FileReader fr = new FileReader(readFileName);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		for (int i = 0; (line = br.readLine()) != null; i++) 
		{
			if((line.contains(findStr)))
			{
				System.out.println((i + 1) + "  :  " + line);
			}
		}
		
		br.close();
		fr.close();
	}


}
