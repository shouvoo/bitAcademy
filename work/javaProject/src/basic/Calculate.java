package basic;

public class Calculate 
{

	public static void main(String[] args) 
	{
		// 5 + 3 = 8; �ּ� ::: �ڵ��� �����̳� �ΰ��� ������ ����� ���
		/*
			8 = 5 + 3;
			�ּ�����
		��*/
		int x;
		x = 10;
		int y = 20, z, a = 10 + 20;
		//�޸��� ��� ������ ���ÿ� �����Ҽ��ִ�
		//���̸��� ���ڷ� �����Ҽ� ����
		//Ư����ȣ ���Ұ� ��! ��밡���� Ư����ȣ�� _, $ ��밡��
		//�����̸��� ���ڷ� ���� �Ұ�
		int b = y + a;
		
		System.out.println("x  :  " + x);
		System.out.println("y  :  " + y);
		System.out.println("a  :  " + a);
		System.out.println("b  :  " + b);
		
		//���������� �ѱ��� ����Ҽ� ������ ����� �����Ѵ�
		//int ���� = 88;
		
		
		
		
		
		
		
		
		
		
		
		trace("x  :  " + x);
		trace("y  :  " + y);
		trace("a  :  " + a);
		trace("b  :  " + b);
	}
	
	public static void trace(String arg)
	{
		System.out.println(arg);
	}

}