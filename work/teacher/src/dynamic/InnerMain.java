package dynamic;

class Outer
{
	int a =10;
	static int d =40;
	
	
	////1. 일반이너클래스
	class Inner
	{
		int b = 200;
		int aa = a;
		public Inner() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner 생성자");
		}
	}
	
	////2.static 이너클래스
	static class InnerSt{
		int c = 30000;
		//int aa = a;
		int dd = d;
		public InnerSt() {
			// TODO Auto-generated constructor stub
			System.out.println("StInner 생성자");
		}
	}
	
	
	//int bb = b;
	public Outer() {
		// TODO Auto-generated constructor stub
		System.out.println("Outer 생성자");
	}
	
	
	void meth()
	{
		int mx =1234;
		
		
		////3.local 이너클래스
		class InnerLocal{
			public InnerLocal() {
				// TODO Auto-generated constructor stub
				System.out.println("InnerLocal 생성자");
			}
			int e = 5050;
			int aaa = a;
			
			int mmxx = mx;
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println("il.e:"+il.e);
		System.out.println("il.aaa:"+il.aaa);
		System.out.println("il.mmxx:"+il.mmxx);
		
	}
}


class IIChild extends Outer.Inner
{
	public IIChild() {
		// TODO Auto-generated constructor stub
		new Outer().super();
		System.out.println("IIChild 생성자");
		
	}
}

public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer oo = new Outer();
		System.out.println("-------------------");
		//Inner ii = new Inner();
		//Inner ii = oo.new Inner();
		Outer.Inner ii = oo.new Inner();
		System.out.println("-------------------");
		//Outer.InnerSt is = new InnerSt();
		Outer.InnerSt is = new Outer.InnerSt();
		
		
		//is = oo.InnerSt();
		
		System.out.println("-------------------");
		IIChild cc = new IIChild();
		System.out.println("-------------------");
		
		
		///4. 익명 이너클래스
		Outer ooAno = new Outer() {
			@Override
			void meth() {
				// TODO Auto-generated method stub
				System.out.println("생성시 재정의 meth()");
			}
		};
		
		
		
		System.out.println("oo.a:"+oo.a);
		//System.out.println("oo.b:"+oo.b);
		//System.out.println("ii.a:"+ii.a);
		System.out.println("ii.b:"+ii.b);
		System.out.println("ii.aa:"+ii.aa);
		System.out.println("is.c:"+is.c);
		System.out.println("is.dd:"+is.dd);
		System.out.println("-------------------");
		oo.meth();
		System.out.println("-------------------");
		ooAno.meth();

	}

}

///// 중국집을 구현하세요
///포장용- 군만두, 탕수육, 삭스핀, 라조기(주문을 받아 미리 만든 제품을 준다)
///홀용 : 제품 - 짜장면, 짬뽕, 울면, 단무지 (주문을 받아 홀에 준다)

///포장용 만들기, 포장용 팔기, 홀 주문
///








