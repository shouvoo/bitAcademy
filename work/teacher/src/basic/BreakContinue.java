package basic;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		while(a<10)
		{
			System.out.println("while ����:"+a);
			if(a==5)
				break;
			
			System.out.println("while ��:"+a);
			a++;
		}
		
		System.out.println("----------------");
		
		a=0;
		while(a<10)
		{
			System.out.println("while ����:"+a);
			a++;
			if(a==5)
				continue;
			
			System.out.println("while ��:"+a);
			
		}
		
		System.out.println("----------------");
		
		a=0;
		while(a<10)
		{
			System.out.println("while ����:"+a);
			a++;
			if(a!=5)
				System.out.println("while ��:"+a);
			
		}
		
		
	}

}
