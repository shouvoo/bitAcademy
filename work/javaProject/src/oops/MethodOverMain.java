package oops;

class MathodOver
{
	void meth(int a, String b)
	{
		System.out.println("�⺻�� : " + a + ", " + b);
	}
	
	public void meth(int a, String b, int c)
	{
		System.out.println("�μ��� ��Ұ� �ٸ� ���  :  " + a + " ," + b + ", " + c);
	}
	
	void meth(int a, int b)
	{
		System.out.println("�μ��� �ڷ����� �ٸ� ��� : " + a + ", " + b);
	}
	
	void meth(String b, int a)
	{
		System.out.println("�μ��� ������ �ٸ� ��� : " + b + ", " + a);
	}
}

public class MethodOverMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MathodOver mo = new MathodOver();
		mo.meth(100, "�ٶ��� �д�");
		mo.meth(100, "�ٶ��� �д�", 200);
		mo.meth(100, 200);
		mo.meth("�ٶ��� �д�", 100);
		
	}

}










































