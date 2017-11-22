package oops;

class Cons{
	
	int a= setA();
	
	Cons()
	{
		this(1111,2222);
		//this(3333);
		System.out.println("Cons() 奄沙持失切");
		
		
		
	}
	
	Cons(int a){
		System.out.println("Cons() 持失切:"+a+","+b);
		this.a=a;
		b=10000;
	}
	
	
	
	
	public Cons(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}




	int b = setB();
	
	int setA()
	{
		System.out.println("setA()");
		return 10;
	}
	
	int setB()
	{
		System.out.println("setB()");
		return 20;
	}
	
}

public class ConstustorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons cs1 = new Cons(123,456);
		Cons cs2 = new Cons();
		System.out.println("cs1.a:"+cs1.a);
		System.out.println("cs1.b:"+cs1.b);
		System.out.println("cs2.a:"+cs2.a);
		System.out.println("cs2.b:"+cs2.b);
	}

}
