package basic;

public class IfMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 97;
		String sss = "기본값";
		if(a > 90)
		{
			sss = "90점";
		} else if(a > 80) {
			sss = "80점";
		} else {
			sss = "70점";
		}
		System.out.println(sss);
	}

}
