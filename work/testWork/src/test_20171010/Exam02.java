package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Exam02 
{
	 // main 메서드는 수정하지 마세요.	 
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
		// 아래 부분에 내용을 구현합니다. 클래스의 다른 부분은 변경하지 않습니다.
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
