package basic;

public class VarableMain 
{
	public static void main(String[] args) 
	{
		//1. ����
			//1_1. ����
		System.out.println("1. ����");
		System.out.println("	1_1. ����");
		byte bb = 127; //byte �������� -127 ~ 127 ���� �����
		short sh = 32767; //short �������� -32767 ~ 32767 ���� �����
		int x = 2147483647; //int �������� -2147483647 ~ 2147483647 ���� ����� 
		long lo = 9223372036854775807L; 
		//long �������� -9223372036854775807 ~ 9223372036854775807 ���� ����� 
		//long ���� �ǳ��� L �� ���������
		
		
		System.out.println(bb);
		System.out.println(sh);
		System.out.println(x);
		System.out.println(lo);
		
		System.out.println("	1_2. �Ǽ�");
		float ff = 123.456f;
		//float ���� �Ǹ������� f �� �������
		double dd = 123.456;
		System.out.println(ff);
		System.out.println(dd);
		
		
		System.out.println("2. boolean");
		boolean bo = true; //boolean �� true, false �� ���Եȴ� ���� 0, 1 ���� �߻�
		System.out.println(bo);
		
		System.out.println("3. ����");
		char ch = 'a'; // ���ڴ� '' Ȧ ����ǥ�� �����ش�
		System.out.println(ch);
		char ch2 = 'b';
		System.out.println(ch2);
		
		System.out.println("4. ���ڿ�");
		String str = "�������� �Ϳ���"; // ���ڿ��� "" �ֵ���ǥ�� �����ش�
		System.out.println(str);
	}
}
































