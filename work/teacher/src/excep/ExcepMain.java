package excep;

public class ExcepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			
			int [] arr = {10,20,30};
			
			System.out.println(arr[7]);
			int a = 10/0;
			
			System.out.println("a:"+a);
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("수학적 에러발생");
			return;
		}
		
		catch(Exception e)
		{
			try {
				System.out.println("에러처리 안 시작");
				int a = 10/0;
				System.out.println("에러처리 안 끝");
			}
			catch(Exception e2)
			{
				System.out.println("에러처리안 에러처리");
			}
			System.out.println("일반적 에러발생");
		}
		finally {
			
			System.out.println("시스템종료");
		}
		
		
		
		
		
		/*catch(ArithmeticException e)
		{
			System.out.println("수학적 에러발생");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 인덱스 에러발생");
		}*/
	}

}
