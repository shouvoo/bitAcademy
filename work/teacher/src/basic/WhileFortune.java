package basic;

import java.io.IOException;

public class WhileFortune {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		mmm:while(true) {
			System.out.println("������ �!!!");
			System.out.println("1~3.�, 0.����");
			System.out.print("�Է�:");
			
			int num= System.in.read()-'0';
			System.in.read();	//������ '\r'
			System.in.read();	//������ '\n'
			
			String res;
			switch(num)
			{
				case 0:
					break mmm;
				case 1:
					res="������ � ���� ¯";
					break;
				case 2:
					res="�׳� �׷� ����";
					break;
				case 3:
					res="�����";
					break;
				default:
					res="�ùٸ� ��ȣ ���";
					break;
			}
	
			System.out.println(res);	
		}
				
		System.out.println("���α׷� ����");
		
		
		
		//while scanner �� �̿��Ͽ� ��ȭ���� ���α׷��� �����ϼ���

		
	}

}
