package arr;

public class ArrayHome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/////1. �Էº�
		int[] kor = { 89, 97, 97, 77, 40 }; 						// �������� �Է�
		int[] eng = { 87, 57, 99, 87, 57 }; 						// �������� �Է�
		int[] mat = { 86, 66, 97, 77, 57 }; 						// �������� �Է�
		String[] name = { "�嵿��", "�峲��", "�弭��", "���߰�", "�ϵνŰ�" }; // �л��̸�

		int[] sum = new int[name.length]; 									// sum�迭 ũ�� �Ҵ�
		double[] avg = new double[name.length];	// avg�迭 ũ�� �Ҵ�
		int [] rank = new int[name.length];
		
		String[] grade = { "��", "��", "��", "��", "��", 				// ����Է�
							"��", "��", "��", "��", "��" }; 
		String[] total = new String[name.length]; 							// total�迭 ũ�� �Ҵ�

		
		/////2. �����
		///2.1 ��������
		for (int i = 0; i < name.length; i++) { 					// �л� �� ��ŭ ���� �ҷ�����

			sum[i] += kor[i] + eng[i] + mat[i]; 					// sum�迭�� �� �л��� ����, ����, ������ �� �ֱ�
			avg[i] = (double) sum[i] / 3; 							// avg�迭�� �� �л��� ��� �ֱ�
			avg[i] = (double) (int) (avg[i] * 100 + 0.5) / 100; 	// ����� �Ҽ� ���ڸ������� �ݿø� ǥ��						// total���
		}
		///2.2 �������
		for(int me =0; me<avg.length;me++)
		{
			rank[me]++;
			for(int you =0; you<avg.length;you++)
			{
				if (avg[me]<avg[you])
					rank[me]++;
			}
		}
		
		
		///3. ��º�
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���\t���");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < name.length; i++) { 					// �л� �� ��ŭ ���� �ҷ�����

			total[i] = name[i] + "\t" + 
						kor[i] + "\t" + 
						eng[i] + "\t" + 
						mat[i] + "\t" + 
						sum[i] + "\t" + 
						avg[i] + "\t" + 
						grade[(int) (avg[i] / 10)] + "\t" + 
						rank[i];	// total�� ��系�� �ֱ�
			
			System.out.println(total[i]); 								// total���
		}

	}

}
