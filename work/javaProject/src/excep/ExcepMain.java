package excep;

import java.io.FileInputStream;

import javax.sql.rowset.serial.SerialException;

public class ExcepMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*try 
		{
			int [] arr = {10, 20, 30};
			System.out.println(arr[7]);
			int a = 10 / 1;
			System.out.println("a : " + a);
		} catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("������ �����߻�");
			return;
		} catch (Exception e)
		{
			try 
			{
				System.out.println("����ó�� �� ����");
				int a  = 10/0;
				System.out.println("����ó�� �� ��");
			} catch (Exception e2) 
			{
				System.out.println("����ó�� �� ����ó��");
			}
			
			System.out.println("�Ϲ��� �����߻�");
		} finally
		{
			System.out.println("�ý��� ����");
		}*/
	
		
		/*} catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("������ �����߻�");
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO: handle exception
			System.out.println("�迭 �ε��� �����߻�");
		}*/
		
		for (int i = 0; i < 100; i++) 
		{
			int f = i / 10; 
			int s = i % 10;
			
			
			try 
			{
				switch(s)
				{
					case 3 :
					case 6 :
					case 9 :
						int a = 10 / 0;
						break;
				} 
				System.out.println(i);
			} catch (Exception e) 
			{
				System.out.println("¦");
				// TODO: handle exception
			} 
				
			
		}

	}

}
