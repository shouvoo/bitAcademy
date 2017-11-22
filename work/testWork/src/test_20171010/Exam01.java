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
		 // �����ϼ���~ ---------------------------------------------------
		 // �� ��� ������ file1 �� file2 ���� ���ڿ� �������� ���μ��� ���ٰ� �����մϴ�~!!
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
	 // main �޼���� �������� ������.
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
