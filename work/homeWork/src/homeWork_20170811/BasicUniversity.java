package homeWork_20170811;
import homeWork_20170811.BasicStudent;
import homeWork_20170811.PassResult;

public class BasicUniversity 
{
	protected String universityType = "�Ϲݴ��б�";
	protected int cutLine = 45;
	protected double [][] rateArr = {{0.7, 0.5, 0.6},
										{0.7, 0.8, 0.7},
										{0.5, 0.7, 0.6},
										{0.8, 0.7, 0.5},
										{0.6, 0.9, 0.5}
										};
	protected int rateId;
	protected String name, studentType, gender;
	protected int [] subjectArr;
	protected BasicStudent students;
	protected String [] index;
//	�Ϲ�, Ư������, ����, ���ü, �ܱ���
	
	
	public  BasicUniversity() 
	{
		// TODO Auto-generated constructor stub
		//students = bs;
		//editStudent();
	}
	
	public void init(BasicStudent bs)
	{
		students = bs;
		editStudent();
	}
	
	protected void editStudent()
	{
		this.index = new String []{"���б�", "�̸�", "����", "����", "����", "����", 
                "����", "����", "���", "���"};
		this.name = students.getName();
		this.studentType = students.getStudentType();
		this.gender = students.getGender();
		this.subjectArr = students.getSubjectArr();
		editRateArr();
	}
	
	protected void editRateArr()
	{
		rateId = 0;
		switch(this.studentType)
		{
			case "�Ϲ�" : 
				rateId = 0;
				break;
			case "Ư������" : 
				rateId = 1;
				break;
			case "����" : 
				rateId = 2;
				break;
			case "���ü" : 
				rateId = 3;
				break;
			case "�ܱ���" : 
				rateId = 4;
				break;
		}
	}

	public String getUniversityType() 
	{
		return universityType;
	}

	public double[] getRateArr() 
	{
		return rateArr[rateId];
	}

	public String getName() 
	{
		return name;
	}

	public String getStudentType() 
	{
		return studentType;
	}

	public String getGender() 
	{
		return gender;
	}

	public int[] getSubjectArr() 
	{
		return subjectArr;
	}
	
	public int getCutLine() 
	{
		return cutLine;
	}
	
	public String[] getIndex()
	{
		return index;
	}
	
}
