package basic;

public class VarableMain 
{
	public static void main(String[] args) 
	{
		//1. 숫자
			//1_1. 정수
		System.out.println("1. 숫자");
		System.out.println("	1_1. 정수");
		byte bb = 127; //byte 허용범위는 -127 ~ 127 까지 허용함
		short sh = 32767; //short 허용범위는 -32767 ~ 32767 까지 허용함
		int x = 2147483647; //int 허용범위는 -2147483647 ~ 2147483647 까지 허용함 
		long lo = 9223372036854775807L; 
		//long 허용범위는 -9223372036854775807 ~ 9223372036854775807 까지 허용함 
		//long 사용시 맨끝에 L 을 적어줘야함
		
		
		System.out.println(bb);
		System.out.println(sh);
		System.out.println(x);
		System.out.println(lo);
		
		System.out.println("	1_2. 실수");
		float ff = 123.456f;
		//float 사용시 맨마지막에 f 를 써줘야함
		double dd = 123.456;
		System.out.println(ff);
		System.out.println(dd);
		
		
		System.out.println("2. boolean");
		boolean bo = true; //boolean 은 true, false 만 대입된다 숫자 0, 1 에러 발생
		System.out.println(bo);
		
		System.out.println("3. 문자");
		char ch = 'a'; // 문자는 '' 홀 따옴표로 감싸준다
		System.out.println(ch);
		char ch2 = 'b';
		System.out.println(ch2);
		
		System.out.println("4. 문자열");
		String str = "선생님은 귀여워"; // 문자열은 "" 쌍따옴표로 감싸준다
		System.out.println(str);
	}
}

































