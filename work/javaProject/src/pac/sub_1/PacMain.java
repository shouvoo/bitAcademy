package pac.sub_1;
import pac.sub_2.BBB;
import pac.sub_2.CCC;
import pac.sub_2.EEE;
import pac.sub_1.mini.FFF;
//import pac.sub_2.AAA;
/*�ܱ�(�븸��) �ڵ��� ��ǰ
	-ī�޶�, ����ũ, ���͸�
����(�Ｚ)�ڵ��� ����
	����� ȸ�� - �Ｚ
	�ڵ��� - ������
�������, ��ȭ�ϱ�, ������*/

class AAA
{
	int a = 10;
	private int b = 20;
	int c = b;
}

class ExtBBB extends BBB
{
	int aa = a;
	int bb = b;
}

public class PacMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AAA s1a = new AAA();
		BBB s2b = new BBB();
		EEE s1e = new EEE();
		FFF mf = new FFF();
		ExtBBB s1xb = new ExtBBB();
		pac.sub_1.EEE s1ee = new pac.sub_1.EEE();
		System.out.println("s1a.a : " + s1a.a);
		//System.out.println("s1a.b : " + s1a.b);
		System.out.println("s1a.c : " + s1a.c);
		System.out.println("s2b.a : " + s2b.a);
		System.out.println("s1e.a : " + s1e.a);
		System.out.println("s1ee.a : " + s1ee.a);
		System.out.println("s1xb.aa : " + s1xb.aa);
		System.out.println("s1xb.bb : " + s1xb.bb);
		//System.out.println("s2b.b : " + s2b.b);
	}

}
