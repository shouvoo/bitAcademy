package homeWork_20170811;


public class BasicStudent 
{
	private String name, studentType, gender;
	private int [] subjectArr;
	
	public BasicStudent(String name, String gender, String studentType, int [] subjectArr) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.studentType = studentType;
		this.subjectArr = subjectArr;
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
	
	
	
}
