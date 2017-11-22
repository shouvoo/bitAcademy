package dynamic;

class ManageStudent
{
	String name;
	int [] score;
	int total;
	int average;
	int [] printScoreArr;
	double [] averageNumArr; 
	String [] ratingArr = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
	
	ManageStudent()
	{
		
	}
	
	void cal()
	{
		printScoreArr = new int[score.length];
		for (int i = 0; i < score.length; i++) 
		{
			printScoreArr[i] = (int)(score[i] * averageNumArr[i]);
			total += score[i];
		}
		average = total / score.length;
	}
	
	void print()
	{
		String res = "";
		res += name + "\t";
		
		for (int i = 0; i < score.length; i++) 
		{
			res += printScoreArr[i] +  "\t";
		}
		res += total + "\t" + average + "\t" + ratingArr[average / 10]; 
		System.out.println(res);
	}
}


class SetStudent extends ManageStudent
{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private  double [] averageNumArr = {0.6, 0.4, 0.5}; 
	
	private int [] score;
	
	public SetStudent(String name, int kor, int eng, int math) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.score = new int [] {kor, eng, math};
		
		super.name = this.name;
		super.score = this.score;
		super.averageNumArr = this.averageNumArr;
		
		cal();
		print();
	}
	
	public int getKor()
	{
		return kor;
	}
	
	public int getEng()
	{
		return eng;
	}
	
	public int getMath()
	{
		return math;
	}
}

public class ExStudent 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String [] index = {"�̸�", "����", "����", "����", "����", "���", "���"};
        for (int i = 0; i < index.length; i++) 
        {
            System.out.print(index[i] + "\t");
        }
        System.out.println();
		
		SetStudent [] ss = {new SetStudent("�ι�Ʈ", 58, 88, 75),
							new SetStudent("�Ҹ�", 78, 64, 56),
							new SetStudent("���Ҷ�", 68, 78, 54),
							new SetStudent("����", 46, 45, 76),
							new SetStudent("����Ʈ", 84, 76, 34),
							new SetStudent("���", 57, 77, 87)};
	}

}
