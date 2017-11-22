package dynamic;

class ResultTest
{
	String name, school, pass;
	int total;
	int averageTotal;
	int [] scoreArr;
	
	
	void cal()
	{
		
	}
	
	void print()
	{
		cal();
		String str = "";
		str += name + "\t" + school + "\t";
		
		for (double d : scoreArr) 
		{
			str += (int)d + "\t";
		}
		
		str += total + "\t" + averageTotal + "\t" + pass;
		System.out.println(str);
	}
}

class SchoolA extends ResultTest
{
	final double [] averageArr = {0.3, 0.3, 0.4};
	final int passScore = 70;
	final String school = "�Ѻ����б�"; 
	
	public SchoolA(String name, int kor, int eng, int meth) 
	{
		super.school = school;
		this.name = name;
		super.scoreArr = new int [] {kor, eng, meth};
		// TODO Auto-generated constructor stub
	}
	
	void cal()
	{
		for (int i = 0; i < super.scoreArr.length; i++) 
		{
			super.total += super.scoreArr[i];
			super.averageTotal += super.scoreArr[i] * averageArr[i];
		}
		
		if(averageTotal > passScore) super.pass = "�հ�";
		else super.pass = "���հ�";
	}
}

class SchoolB extends ResultTest
{
	final double [] averageArr = {0.5, 0.2, 0.3};
	final int passScore = 70;
	final String school = "������б�"; 
	
	public SchoolB(String name, int kor, int eng, int meth) 
	{
		super.school = school;
		this.name = name;
		super.scoreArr = new int [] {kor, eng, meth};
		// TODO Auto-generated constructor stub
	}
	
	void cal()
	{
		for (int i = 0; i < super.scoreArr.length; i++) 
		{
			super.total += super.scoreArr[i];
			super.averageTotal += super.scoreArr[i] * averageArr[i];
		}
		
		if(averageTotal > passScore) super.pass = "�հ�";
		else super.pass = "���հ�";
	}
}

public class ResultTestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ResultTest [] arr = {new SchoolA("�귡��", 87, 95, 76),
							new SchoolB("��Ʈ", 67, 45, 46)};
		
		for (ResultTest rt : arr) 
		{
			
			rt.print();
		}
	}

}
