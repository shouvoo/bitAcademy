package basic;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		while(a<10)
		{
			System.out.println("while 시작:"+a);
			if(a==5)
				break;
			
			System.out.println("while 끝:"+a);
			a++;
		}
		
		System.out.println("----------------");
		
		a=0;
		while(a<10)
		{
			System.out.println("while 시작:"+a);
			a++;
			if(a==5)
				continue;
			
			System.out.println("while 끝:"+a);
			
		}
		
		System.out.println("----------------");
		
		a=0;
		while(a<10)
		{
			System.out.println("while 시작:"+a);
			a++;
			if(a!=5)
				System.out.println("while 끝:"+a);
			
		}
		
		
	}

}
