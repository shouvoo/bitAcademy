package basic;

public class WhileBreak 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//2�� 10�� �����ּ���
		/*int h = 1;
		boolean chk = false;
		while(h <= 12) 
		{
			if(chk) break;
			System.out.println(h + "��");
			
			int m = 0;
			while(m < 60)
			{
				System.out.println(h + " : " + m);
				
				if(h == 2 && m == 10) 
				{
					chk = true;
					break;
				}
				m++;
			}
			
			h++;
		}*/
		
		int h = 1;
		hhh:while(h <= 12) 
		{
			System.out.println(h + "��");
			
			int m = 0;
			mmm:while(m < 60)
			{
				System.out.println(h + " : " + m);
				
				if(h == 2 && m == 10) break hhh;
				
				m++;
			}
			
			h++;
		}
	}

}














































