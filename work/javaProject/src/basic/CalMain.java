package basic;

public class CalMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("2�� ������");
		System.out.println("	2_1 ��� ������");
		
		// param ������ or ���ڿ�
		// return ������ or ���ڿ�
		
		int x = 15, y = 7;
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + x * y);
		System.out.println(x + " / " + y + " = " + x / y);
		System.out.println(x + " % " + y + " = " + x % y);
		
		String str1 = "�Ʊ���", str2 = "�ѷ�� �ѷ�";
		System.out.println(str1 + str2);
		
		System.out.println("	2_2 �� ������");
		// param ������ or ���ڿ�
		// return boolean true of false
		int z = 15;
		
		System.out.println(x + " > " + z + " = " +   (x > z));
		System.out.println(x + " >= " + z + " = " +   (x >= z));
		System.out.println(x + " <= " + z + " = " +   (x <= z));
		System.out.println(x + " < " + z + " = " +   (x < z));
		System.out.println(x + " == " + z + " = " +   (x == z));
		System.out.println(x + " != " + z + " = " +   (x != z));

		
		System.out.println("���ڿ� ��  :  " + (str1 != str2));
		
		System.out.println("	2_3 ���� ������");
		/*
		 *return boolean (true, false)
		 *&& - and : (�������� ��� ���϶� ��)
		 *|| - or  : (�������� �ϳ��� ���̸� ��)
		 *^ - xor  : (�������� ���� �ٸ����� ��)
		 */
		boolean bo1 = false, bo2 = false;
		
		System.out.println(bo1 && bo2);
		System.out.println(bo1 || bo2);
		System.out.println(bo1 ^ bo2);
		
		double kk = 186;
		int mm = 1300;
		
		/*boolean kkchk = kk >= 185;
		boolean mmchk = mm >= 1000;*/
		
		System.out.println("And : " + (kk >= 185 && mm >= 1000));
		System.out.println("Or : " + (kk >= 185 || mm >= 1000));
		System.out.println("^ : " + (kk >= 185 ^ mm >= 1000));
		
		
		System.out.println("	2_4 shift ������");
		//param ����
		//return ����
		System.out.println(5<<2);
		//5 �� �������� ��ȯ -> 0101
		//0101 + 00 --> 01 0100
		//              16+ 4
		
		System.out.println(5>>2);
		//5 �� �������� ��ȯ -> 0101
		//0101 --> 0001 / 01
		
		System.out.println(-5>>>2);
		System.out.println(5>>>2);
		
		
		System.out.println("	2_5 bit ������");
		//param ����
		//return ����
		System.out.println(12 & 5);
		// 12 -> 2���� = 1100;
		// 5 -> 2���� = 0101;
		//0100
		System.out.println(12 | 5);
		//1101
		System.out.println(12 ^ 5);
		//1001
		
		System.out.println("	2_6 ���� ������");
		//param ������, ����
		//return ����, ����
		x = 100;
		x = x + 1;
		
		x += 5;
		x *= 2;
		
		//x = x * 2;
		System.out.println(x);
		
		str1 = str1 + "�������";
		str1 += "�ƺ����";
		System.out.println(str1);
		
		System.out.println("	2_7 1�� ������");
		int q = 20;
		boolean bbb = true;
		System.out.println(-q);
		System.out.println(!bbb);

		//q += 1;
		//q++;
		System.out.println(q);
		
		int a = 5, b = 6, c = 10, d;
		d = a++ + ++c - (b-- * --a) + a++;
		System.out.println(d);
		
		System.out.println("	2_8 3�� ������");
		
		System.out.println(true ? "�� ���̾�" : "�����̾�");
		
		System.out.println("And : " + (kk >= 185 && mm >= 1000 ? "��ȥ����" : "��ȥ�Ұ���"));
		System.out.println("Or : " + (kk >= 185 || mm >= 1000 ? "��ȥ����" : "��ȥ�Ұ���"));
		System.out.println("^ : " + (kk >= 185 ^ mm >= 1000 ? "��ȥ����" : "��ȥ�Ұ���"));
		
	}

}





























