package dynamic;

import java.util.Arrays;

class FinalStud
{
	String name;
	private int [] jum;
	FinalStud(String name, int kor, int eng, int mat) 
	{
		super();
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
	}
	public int getJum(int i) 
	{
		return this.jum[i];
	}
	public String getName() 
	{
		return name;
	}
	
}


class FinalExam
{
	String name, school, res;
	final int [] jum;
	
	FinalExam(String name, String school, int kor, int eng, int mat, String res) 
	{
		super();
		this.name = name;
		this.school = school;
		this.res = res;
		this.jum = new int [] {kor, eng, mat};
	}

	public void print()
	{
		System.out.println(name+"\t"+school+"\t"+Arrays.toString(jum)+"\t"+res);
	}
}

class FinalSchool
{
	double [] rate;
	final int cutline =70;
	String name;
	FinalSchool(String name, int kor, int eng, int mat) 
	{
		super();
		this.rate = new double[]{(double)kor / 100, (double)eng / 100, (double)mat / 100};
		this.name = name;
	}
	
	FinalExam exam(FinalStud st)
	{
		double sum = 0;
		for (int i = 0; i < rate.length; i++) 
		{
			sum += rate[i] * st.getJum(i);
		}
		
		String res = "���հ�";
		if(sum >= cutline)
		{
			res = "�հ�";
		}
		return new FinalExam(st.getName(), name, st.getJum(0), st.getJum(1), st.getJum(2), res);
	}
	
}



public class FinalStudMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FinalStud [] stArr = {  new FinalStud("��1��", 90, 99, 98),
								new FinalStud("��2��", 56, 56, 57),
								new FinalStud("��3��", 74, 46, 84),
								new FinalStud("��4��", 63, 23, 75),
								new FinalStud("��5��", 96, 47, 84)};
		
		FinalSchool [] schArr = { new FinalSchool("A��", 30, 30, 40),
								  new FinalSchool("B��", 50, 20, 20)};
		
		for (FinalSchool fs : schArr) 
		{
			for (FinalStud st : stArr) 
			{
				fs.exam(st).print();
			}
			System.out.println("--------------------------");
		}
	}

}
