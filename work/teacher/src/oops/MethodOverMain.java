package oops;

class MethodOver{
	
	void meth(int a, String b)
	{
		System.out.println("�⺻����:"+a+","+b);
	}
	
	void meth(int a, String b, int c)
	{
		System.out.println("�μ��� ������ �ٸ� ���:"+a+","+b+","+c);
	}
	
	void meth(int a, int b)
	{
		System.out.println("�μ��� �ڷ����� �ٸ� ���:"+a+","+b);
	}
	
	void meth(String b, int a)
	{
		System.out.println("�μ��� ������ �ٸ� ���:"+a+","+b);
	}
	
	
	/*String meth(int a, String b)
	{
		System.out.println("�⺻����:"+a+","+b);
	}
	
	void meth(int d, String b)
	{
		System.out.println("�⺻����:"+a+","+b);
	}*/
}

public class MethodOverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver mo = new MethodOver();
		
		mo.meth(100, "�ٶ��� ��ó");
		mo.meth(100, "�ٶ��� ��ó",200);
		mo.meth(100,200);
		mo.meth( "�ٶ��� ��ó", 200);
	}

}
