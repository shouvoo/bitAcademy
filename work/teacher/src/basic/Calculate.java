package basic;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5 + 3 = 8  주석 ::: 코딩의 설명이나 부가적 내용을 기술시 사용
		/*
			8 = 5+ 3;
			주석구간
			문단 단위로 주석을 넣을 수 있음
			/*
			 * 
			 * 
			 */
		//*/	주석구간 안에 주석구간을 넣을 수 없다
		
		//변수의 선언
		//자료형 변수명;
		int x;
		
		/*
		 * 변수의 선언과 대입은 순서를 맞추어서한다.
		 y =20;
		
		int y;*/
		
		x=10;	//변수의 값 대입
		int y = 20, z, a = 10+20;	//변수의 선언 및 초기화
		//동시에 여러 변수 선언 가능
		//변수에 값 대입시 연산 결과로 가능
		
		int b = y+a;	//변수의 값을 이용하여 변수 값 대입 가능
		
		//int 3asdf = 3;	//변수이름은 숫자로 시작 불가
		//int +123 = 123;	//특수기호사용불가
		int __123 = 1234, $$asdf = 456 ;	//사용가능특수기호 _,$
		
		
		
		int a123 = 123;
		//int a b = 456;	//변수명은 띄어쓰기 불가
		
		int 국어 = 88;
		
		//int a = 1234;
		
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
