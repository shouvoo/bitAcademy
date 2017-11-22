package test_20171010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Exam01 
{
	
	public static ArrayList<String> readFile(String file) throws Exception
	{
		ArrayList<String> returnFile = new ArrayList<>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		for (int i = 0; (line = br.readLine()) != null; i++) 
		{
			//System.out.println(file + " : " + line);
			returnFile.add(line);
		}
		
		br.close();
		fr.close();
		
		return returnFile;
	}

	public static void dataCheck(String file1 , String file2) throws Exception
	{
		 // 구현하세요~ ---------------------------------------------------
		 // 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!
		 // --------------------------------------------------------------
		ArrayList<String> txt1List = readFile(file1);
		ArrayList<String> txt2List = readFile(file2);
		
		//System.out.println(txt1List + " : " + txt2List);
		
		for (int i = 0; i < txt1List.size(); i++) 
		{
			if(txt1List.get(i).toLowerCase().equals(txt2List.get(i).toLowerCase()))
			{
				System.out.println("LINE " + (i + 1) + " : Equal");
			} else 
			{
				System.out.println("LINE " + (i + 1) + " : NotEqual");
			};
		}
		
	 }
	 // main 메서드는 수정하지 마세요.
	 public static void main(String[] args) throws Exception 
	 {
		 try 
		 {
			 dataCheck("data/data1.txt", "data/data2.txt");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 } 

}
