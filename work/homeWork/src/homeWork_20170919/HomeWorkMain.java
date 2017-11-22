package homeWork_20170919;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student implements Serializable, Comparable<Student>
{
	int [] scoreArr;
	int average, total, rank = 1, genderRank = 1;
	String name;
	String gender;
	public Student(String name, int kor, int eng, int math, int gender) 
	{
		this.name = name;
		this.gender = "����".charAt(gender - 1) + "��";
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
	
	public void rank(ArrayList<Student> studentList)
	{
		
		for (Student student : studentList) 
		{
			
			if(this.average < student.average) rank++;
			if(this.gender.equals(student.gender) && this.average < student.average) genderRank++; 
		}
	}
	
	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
		return o.average - average;
	}
	
	Student genderType(String gen)
	{
		Student returnType = null;
		if(this.gender.equals(gen)) returnType = this;
		return returnType;
	}
	
	public void print()
	{
		String str = "";
		
		str += name + "\t" + gender + "\t";
		
		for (int i : scoreArr) 
		{
			str += i + "\t";
		}
		
		str += total + "\t" + average + "\t" + genderRank + "\t" + rank;
		
		System.out.println(str);
	}
}

class ReadFile
{
	public ReadFile(String path) 
	{
		try 
		{			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Student> ost = (ArrayList<Student>)ois.readObject();
			
			ois.close();
			fis.close();
			
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

class WriteFile
{
	public WriteFile(ArrayList<Student> st, String path) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(st);
			
			oos.close();
			fos.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		ArrayList<Student> st = new ArrayList<>(); 
		st.add(new Student("�귡��", 95, 75, 64, 1));
		st.add(new Student("��Ʈ", 64, 56, 76, 1));
		st.add(new Student("��������", 85, 57, 76, 2));
		st.add(new Student("����", 67, 45, 78, 2));
		st.add(new Student("���� ��", 73, 85, 95, 1));
		
		Collections.sort(st);
		
		ArrayList<Student> femaleList = new ArrayList<>(); 
		ArrayList<Student> maleList = new ArrayList<>(); 
		Collections.sort(femaleList);
		Collections.sort(maleList);
		for (Student student : st) 
		{
			student.rank(st);
			
			if(student.genderType("����") != null) femaleList.add(student.genderType("����"));
			else maleList.add(student.genderType("����"));
		}
		
		System.out.println("===== �ݺ� ���� =====");
		new WriteFile(st, "media/student.txt");
		
		System.out.println("===== �ݺ� ��� =====");
		new ReadFile("media/student.txt");
		
		System.out.println("===== ���л� ���� =====");
		new WriteFile(femaleList, "media/femaleStudent.txt");
		System.out.println("===== ���л� ���� =====");	
		new WriteFile(maleList, "media/maleStudent.txt");
		
		System.out.println("===== ���л� ��� =====");
		new ReadFile("media/femaleStudent.txt");
		
		System.out.println("===== ���л� ��� =====");
		new ReadFile("media/maleStudent.txt");
	}

}























