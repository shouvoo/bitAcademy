package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable
{
	int [] scoreArr;
	int average, total;
	String name;
	public Student(String name, int kor, int eng, int math) 
	{
		this.name = name;
		scoreArr = new int [] {kor, eng, math};
		cal();
	}
	
	private void cal()
	{
		for (int i : scoreArr) 
		{
			total += i;
		}
		
		average = total / scoreArr.length;
	}
	
	public void print()
	{
		String str = "";
		
		str += name + "\t";
		
		for (int i : scoreArr) 
		{
			str += i + "\t";
		}
		
		str += total + "\t" + average;
		
		System.out.println(str);
	}
}

public class StudentMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<>(); 
		st.add(new Student("ºê·¡µå", 95, 75, 64));
		st.add(new Student("ÇÇÆ®", 64, 56, 76));
		st.add(new Student("¾ÈÁ©¸®³ª", 85, 57, 76));
		st.add(new Student("Á¹¸®", 67, 45, 78));
		st.add(new Student("Á¶´Ï µª", 73, 85, 95));
		
		/*for (Student student : st) 
		{
			student.print();
		}*/
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("fff/student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(st);
			
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream("fff/student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Student> ost = (ArrayList<Student>)ois.readObject();
			
			for (Student o : ost) 
			{
				o.print();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
