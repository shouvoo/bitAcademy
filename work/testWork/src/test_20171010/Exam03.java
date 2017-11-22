package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Exam03 
{
	public static void main(String[] args) 
	{
		try {
			searchEmployeeInfo("data/employee.txt", "김");
			searchEmployeeInfo("data/employee.txt", "다");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	 /**
	* @param readFileName : 읽을 파일명
	 * @param lastName : 찾을 성씨
	 * @throws Exception
	 */
	 public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception 
	 {
		 // 내용 구현
		FileReader fr = new FileReader(readFileName);
		BufferedReader br = new BufferedReader(fr);
		String [] title = {"이름", "나이", "부서", "연봉"};
		
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
		System.out.println(lastName + "씨 성을 가진 회원은 총 " + num + "명 입니다");
		System.out.println("==========================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		br.close();
		fr.close();
	 }
}
