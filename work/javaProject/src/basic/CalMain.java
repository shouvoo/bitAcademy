package basic;

public class CalMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("2항 연산자");
		System.out.println("	2_1 산술 연산자");
		
		// param 숫자형 or 문자열
		// return 숫자형 or 문자열
		
		int x = 15, y = 7;
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + x * y);
		System.out.println(x + " / " + y + " = " + x / y);
		System.out.println(x + " % " + y + " = " + x % y);
		
		String str1 = "아기상어", str2 = "뚜루루 뚜루";
		System.out.println(str1 + str2);
		
		System.out.println("	2_2 비교 연산자");
		// param 숫자형 or 문자열
		// return boolean true of false
		int z = 15;
		
		System.out.println(x + " > " + z + " = " +   (x > z));
		System.out.println(x + " >= " + z + " = " +   (x >= z));
		System.out.println(x + " <= " + z + " = " +   (x <= z));
		System.out.println(x + " < " + z + " = " +   (x < z));
		System.out.println(x + " == " + z + " = " +   (x == z));
		System.out.println(x + " != " + z + " = " +   (x != z));

		
		System.out.println("문자열 비교  :  " + (str1 != str2));
		
		System.out.println("	2_3 논리 연산자");
		/*
		 *return boolean (true, false)
		 *&& - and : (연산항이 모두 참일때 참)
		 *|| - or  : (연상항중 하나라도 참이면 참)
		 *^ - xor  : (연상항의 값이 다를때만 참)
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
		
		
		System.out.println("	2_4 shift 연산자");
		//param 숫자
		//return 숫자
		System.out.println(5<<2);
		//5 를 이진수로 변환 -> 0101
		//0101 + 00 --> 01 0100
		//              16+ 4
		
		System.out.println(5>>2);
		//5 를 이진수로 변환 -> 0101
		//0101 --> 0001 / 01
		
		System.out.println(-5>>>2);
		System.out.println(5>>>2);
		
		
		System.out.println("	2_5 bit 연산자");
		//param 숫자
		//return 숫자
		System.out.println(12 & 5);
		// 12 -> 2진수 = 1100;
		// 5 -> 2진수 = 0101;
		//0100
		System.out.println(12 | 5);
		//1101
		System.out.println(12 ^ 5);
		//1001
		
		System.out.println("	2_6 대입 연산자");
		//param 숫자형, 문자
		//return 숫자, 문자
		x = 100;
		x = x + 1;
		
		x += 5;
		x *= 2;
		
		//x = x * 2;
		System.out.println(x);
		
		str1 = str1 + "엄마상어";
		str1 += "아빠상어";
		System.out.println(str1);
		
		System.out.println("	2_7 1항 연산자");
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
		
		System.out.println("	2_8 3항 연산자");
		
		System.out.println(true ? "난 참이야" : "거짓이야");
		
		System.out.println("And : " + (kk >= 185 && mm >= 1000 ? "결혼가능" : "결혼불가능"));
		System.out.println("Or : " + (kk >= 185 || mm >= 1000 ? "결혼가능" : "결혼불가능"));
		System.out.println("^ : " + (kk >= 185 ^ mm >= 1000 ? "결혼가능" : "결혼불가능"));
		
	}

}






























