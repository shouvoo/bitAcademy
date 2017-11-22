package homeWork_20170826;

public class TestPrint 
{
	Integer kor, eng, mat, no;
	String title, sid;
	
	void print()
	{
		String str = no + " - " + title + " - " + sid + " - " + kor
				 + " - " + eng + " - " + mat;
		System.out.println(str);
	}
}
