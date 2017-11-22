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
			System.out.println("수학적 에러발생");
			return;
		} catch (Exception e)
		{
			try 
			{
				System.out.println("에러처리 안 시작");
				int a  = 10/0;
				System.out.println("에러처리 안 끝");
			} catch (Exception e2) 
			{
				System.out.println("에러처리 안 에러처리");
			}
			
			System.out.println("일반적 에러발생");
		} finally
		{
			System.out.println("시스템 종료");
		}*/
	
		
		/*} catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("수학적 에러발생");
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO: handle exception
			System.out.println("배열 인덱스 에러발생");
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
				System.out.println("짝");
				// TODO: handle exception
			} 
				
			
		}

	}

}
