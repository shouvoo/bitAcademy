package basic;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;			//�ʱⰪ
		while(a<5)			//����
		{
			System.out.println("�Ʊ� ���"+a);
			a++;			//����
		}
		
		////1->100���� Ȧ������ ��
		int i =1, sum=0;
		
		while(i<=10)
		{
			sum+=i;
			System.out.println(i+","+sum);
			i+=2;
		}
	}

}
