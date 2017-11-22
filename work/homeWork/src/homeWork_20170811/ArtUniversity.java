package homeWork_20170811;
import homeWork_20170811.BasicStudent;
import homeWork_20170811.BasicUniversity;
import homeWork_20170811.PassResult;

public class ArtUniversity extends BasicUniversity
{	
	public ArtUniversity() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void init(BasicStudent bs)
	{
		super.students = bs;
		editStudent();		
	}
	
	protected void editStudent()
	{
		
		super.index = new String []{"대학교", "이름", "성별", "전형", "국어", 
                "영어", "수학", "예술", "총점", "평균", "결과"};
		super.universityType = "예술대학교";
		super.cutLine = 46;
		super.rateArr = new double [][] {{0.7, 0.6, 0.7, 0.4}, 
											{0.5, 0.6, 0.4, 0.9}, 
											{0.4, 0.5, 0.7, 0.7},
											{0.8, 0.7, 0.5, 0.6},
											{0.4, 0.5, 0.9, 0.5}};
		
		
		super.name = students.getName();
		super.studentType = students.getStudentType();
		super.gender = students.getGender();
		super.subjectArr = students.getSubjectArr();
		super.editRateArr();
	}

}
