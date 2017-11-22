package jdbc;

public class ExamVO 
{
	Integer no, kor, eng, mat;
	String title, sid;
	
	void print() 
	{
		String str = no + "," + title + "," + sid + "," + kor + "," + eng + "," + mat;
		System.out.println(str);
	}
}
