package homeWork_20170826;

public class TestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestPrint jt = new GetJDBC().getValue("no", 5);
		if(jt != null)
		{
			jt.print();
		} else 
		{
			System.out.println("데이터 없음");
		}
	}

}
