package basic;

public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int h = 1; h <=12; h++) {
			System.out.println(h+" ��>>>>>>>>>>>");
			for (int m = 0; m < 60; m++) {
				System.out.println(h+":"+m);
			}
			//System.out.println(m);
		}
		
		System.out.println("���� �ٲ۴�1");
		System.out.println("���� �ٲ۴�2");
		System.out.print("���� �ٲ��� �ʴ´�1");
		System.out.print("���� �ٲ��� �ʴ´�2\n");
		System.out.print("���� �ٲ��� �ʴ´�3");
		System.out.println();
		System.out.println("�Ʊ���\t�������\t�ƺ����");
		System.out.println("�Ʊ��\t������\t�ƺ����");
		
		
		
		for (int h = 2; h <10; h++) {
			System.out.println(h+" ��>>>>>>>>>>>");
			for (int m = 1; m <10; m++) {
				System.out.println(h+" x "+m+" = "+h*m);
			}
		}
		
		System.out.println("---------------------------");
		
		for (int h = 1; h <10; h++) {
			for (int m = 2; m <10; m++) {
				
				//���⼭ ������ ���ϴ�. 
				// ��� �Լ��� ���� ������ ������ �򰥸��ϴ�.
				//System.out.print(m+" x "+h+" = "+h=m+"\t");
			}
			System.out.println();
		}
	}

}
