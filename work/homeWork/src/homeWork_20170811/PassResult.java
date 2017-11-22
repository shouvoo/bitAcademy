package homeWork_20170811;
import homeWork_20170811.BasicUniversity;

public class PassResult 
{
	
	private double [] rateArr;
	private String name, studentType, gender, universityType;
	private int [] subjectArr;
	private int total;
	private double average;
	private int [] editScore;
	private String passSign = "ÇÕ°Ý";
	private String line;
	
	
	public PassResult() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void init(BasicUniversity bu, int j) 
	{
		// TODO Auto-generated constructor stub
		
		if(j == 0) indexPrint(bu);
		this.rateArr = bu.getRateArr();
		this.name = bu.getName();
		this.studentType = bu.getStudentType();
		this.gender = bu.getGender();
		this.subjectArr = bu.getSubjectArr();
		this.universityType = bu.getUniversityType();
		cal();
		if(this.average > bu.getCutLine()) print();
	}
	
	

	private void cal()
	{
		editScore = new int [rateArr.length];
		total = 0;
		average = 0;
		for (int i = 0; i < rateArr.length; i++) 
		{
			editScore[i] = (int)(subjectArr[i] * rateArr[i]);
			total += editScore[i];
		}
		
		average = total / rateArr.length;
	}
	
	private void indexPrint(BasicUniversity bu)
	{
		String str = "";
		line = "¡ñ¡ñ   ¡ñ¡ñ   ";
		for (int i = 0; i < bu.getIndex().length; i++) 
		{
			if(i == 1) System.out.print("\t");
			System.out.print(bu.getIndex()[i] + "\t");
			str += line;
		}
		System.out.println();
		System.out.println(str);
	}
	
	void print()
	{
		String str = "";
		str += universityType + "\t\t" + name + "\t" + gender + "\t" + studentType + "\t";
		for (double score : editScore) 
		{
			str += (int)score + "\t";
		}
		str += total + "\t" + (int)average + "\t" + passSign;
		System.out.println(str);
		
	}
	
}
