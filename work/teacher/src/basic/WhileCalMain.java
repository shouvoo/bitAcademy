package basic;

import java.io.IOException;

//��1 :
//���� (+, - , *, / ,% , c(�ٽ��ϱ�),  g(����)):  ---> �߸��� ���ڰ� ������ "���� �Ұ��Դϴ�." �޼��� ó��
//��2:
public class WhileCalMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		tot:while(true) {
			int su1=0;
			System.out.print("��1:");
			while(true) {
				int i = System.in.read();
				if (i==13)
					break;
				
				su1*=10;
				su1 += i-'0';
			}
			System.out.println(su1);
			
			System.in.read();
			
			int su2=0;
			System.out.print("��2:");
			while(true) {
				int i = System.in.read();
				if (i==13)
					break;
				
				su2*=10;
				su2 += i-'0';
			}
			System.out.println(su2);
			
			
			System.in.read();
			
			char code;
			System.out.print("���� (+, - , *, / ,% , c(�ٽ��ϱ�),  g(����)): ");
			int res =0;
			code = (char)System.in.read();
			switch(code)
			{
				case 'g':
					break tot;
					
				case '+':
					res = su1 + su2;
					break;
				case '-':
					res = su1 - su2;
					break;
				case '*':
					res = su1 * su2;
					break;
				case '/':
					res = su1 / su2;
					break;
				case '%':
					res = su1 % su2;
					break;
				case 'c':
					System.in.read();
					System.in.read();
					continue;
			}
			
			System.out.println(""+su1+code+su2+"= "+res);
			break;
			
		}
		System.out.println("���α׷� ����");
	}

}
