package basic;

import java.io.IOException;

public class HomeWork_20170727_2 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		System.out.println("��ȭ����");
		System.out.println("1. �׼�  2. ��׼�  3. �Ⱦ׼�  4. �ٽÿ���  0. ����" );
		
		String typeStr = "";
		firstWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					typeStr = "����";
					break firstWhile;
				case 1 :
					typeStr = "�׼�";
					break firstWhile;
				case 2 :
					typeStr = "��׼�";
					break firstWhile;
				case 3 :
					typeStr = "�Ⱦ׼�";
					break firstWhile;
				case 4 :
					typeStr = "�ٽÿ���";
					break;
				default : 
					break;
			}
		}
		
		System.in.read();
		System.out.println("** " + typeStr + "����  **");
		
		System.out.println("-------------------------------------------------------");
		
		System.out.print("�����ο�");
		System.out.print("1. ����  2. �л�  3. ���  4. ���ܸ�  5. �ٽ��ϱ�  0. ����" );
		
		String reservationType = "";
		secondWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					reservationType = "����";
					break secondWhile;
				case 1 :
					reservationType = "����";
					break secondWhile;
				case 2 :
					reservationType = "�л�";
					break secondWhile;
				case 3 :
					reservationType = "���";
					break secondWhile;
				case 4 :
					reservationType = "���ܸ�";
					break secondWhile;
				case 5 :
					reservationType = "�ٽ��ϱ�";
					break;
				default : 
					break;
			}
		}
		
		System.in.read();
		System.out.println("** " + reservationType + "����  **");
		
		System.out.println("-------------------------------------------------------");
		
		System.out.print("�����ο�");
		System.out.print("1. 8��  0. ����" );
		
		String reservationNumber = "";
		thirdWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					reservationNumber = "����";
					break thirdWhile;
				case 1 :
					reservationNumber = "8��";
					break thirdWhile;
				default : 
					break;
			}
		}
		
		System.in.read();
		
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("*************************");
		
		System.out.println("��ȭ����  :  " + typeStr);
		System.out.println("�׼Ǽ���  :  " + reservationType);
		System.out.println("�����ο�  :  " + reservationNumber);
		System.out.println("** ������ �Ϸ�Ǿ����ϴ� **");
		

	}

}
