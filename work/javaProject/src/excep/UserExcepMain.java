package excep;

class MyExcep extends Exception
{
	String [] arr = {"id ����", "pw ����", "��ȭ��ȣ ����"};
	int num;
	
	public MyExcep(String msg) 
	{
		super(msg);
	}
	
	public MyExcep(int num) 
	{
		this.num = num;
	}
	
	public String getMessage()
	{
		return arr[num];
	}
}

public class UserExcepMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			throw new MyExcep(0);
		} catch (MyExcep e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
