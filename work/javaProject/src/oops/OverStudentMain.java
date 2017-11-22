package oops;

class OverStudent
{
	String studentType;
	int kor, eng, meth, lol, totalScore, average;
	int [] subjectArr;
	String etc;
	
	void student(int kor, int eng, int meth, int lol)
	{
		this.studentType = "���л�";
		this.lol = lol;
		int [] hap = {kor, eng, meth, lol};
		subjectArr = hap;
		etc = "";
		student(subjectArr);
	}
	
	void student(int kor, int eng, int meth)
	{
		this.studentType = "���л�";
		int [] hap = {kor, eng, meth};
		subjectArr = hap;
		etc = "" + "\t";
		student(subjectArr);
	}
	
	void student(int [] arr)
	{
		for (int i : arr) 
		{
			this.totalScore += i;
		}
		
		this.average = this.totalScore / arr.length;
	}
	
	void print()
	{
		String res = studentType + "\t";
		for (int i : subjectArr) 
		{
			res += i + "\t";
		}
		res += etc + 
				this.totalScore + "\t" +
				this.average;
		
		System.out.println(res);
	}
}

class Students
{	
	OverStudent student(int kor, int eng, int meth, int lol)
	{
		OverStudent os = new OverStudent();
		os.student(kor, eng, meth, lol);
		
		
		
		return os;
	}
	
	OverStudent student(int kor, int eng, int meth)
	{
		OverStudent os = new OverStudent();
		os.student(kor, eng, meth);
		return os;
	}
}

public class OverStudentMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*�л����� �����ϼ���
		���л� - ����, ����, ����, lol
		���л� - ����, ����, ����
		
		������ ������ ����ϰ�
		�� ���� ���� ������ ����ϼ���
		���� ���� : ����, ���*/
		/*OverStudent os = new OverStudent();
		os.student(96, 87, 94, 80);
		os.print();
		os.student(96, 87, 94);
		os.print();*/
		
		/*Students ss = new Students();
		OverStudent os = ss.student(96, 87, 94, 80);
		os.print();*/
		Students ss = new Students();
		OverStudent [] arr = {ss.student(96, 77, 84, 70), 
							  ss.student(76, 57, 81),
							  ss.student(66, 67, 79),
							  ss.student(86, 87, 74, 80),
							  ss.student(56, 75, 94)};
		
		for (OverStudent os : arr) 
		{
			os.print();
		}
	}

}
