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
			System.out.println("������ �����߻�");
			return;
		}
		
		catch(Exception e)
		{
			try {
				System.out.println("����ó�� �� ����");
				int a = 10/0;
				System.out.println("����ó�� �� ��");
			}
			catch(Exception e2)
			{
				System.out.println("����ó���� ����ó��");
			}
			System.out.println("�Ϲ��� �����߻�");
		}
		finally {
			
			System.out.println("�ý�������");
		}
		
		
		
		
		
		/*catch(ArithmeticException e)
		{
			System.out.println("������ �����߻�");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭 �ε��� �����߻�");
		}*/
	}

}
