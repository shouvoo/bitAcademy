package arr;

public class MulExam2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1. �Էº�
		int [][] jum = {{88, 66, 78},
						{95, 96, 99, 98},
						{64, 84, 54},
						{87, 78, 60, 96},
						{85, 82, 61}};
		
		String [] name = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5"};
		
		int [][] res = new int [name.length][5];
		//0.����, 1. ����, 2. ���, 3. ���, 4. �������
		
		//�����
		int maxSub = 0;
		
		for (int i = 0; i < jum.length; i++) 
		{	
			if(maxSub < jum[i].length)
			{
				maxSub = jum[i].length;
			}
			
			for (int j = 0; j < jum[i].length; j++) 
			{
				res[i][1] += jum[i][j];
			}
			res[i][2] = res[i][1] / jum[i].length;
		}
		
		
		//����
		for (int i = 0; i < res.length; i++) 
		{
			res[i][0] = jum[i].length / maxSub;
		}
		
		
		//���
		for (int i = 0; i < res.length; i++) 
		{
			res[i][3] = 1;	
			
			for (int j = 3; j < res[i].length; j++) 
			{
				res[i][j] = 1; //��� �ʱ�ȭ
			}
			
			for (int j = 0; j < res.length; j++) 
			{
				if(res[i][2] < res[j][2])
				{
					res[i][3]++;	// ����ø���
					if(res[i][0] == res[j][0])
					{
						res[i][4]++;
					}
				}
			}
		}
		
		
		
		
		//��º�
		
		String [][] index = {{"�̸�", "����", "����", "����", 
				              "����", "lol", "����", "���", "��ü���", "�������"}, 
							  new String[] {"��", "��"}};
		String line = "";
		
		for (int i = 0; i < index[0].length; i++) 
		{
			System.out.print(index[0][i] + "\t");
			line += "========";
		}
		
		System.out.println("\n" + line);
		
		for (int i = 0; i < name.length; i++) 
		{
			System.out.print(name[i] + "\t");
			
			/*if(jum[i].length < 5) System.out.print("��" + "\t");
			else System.out.print("��" + "\t");*/
			
			System.out.print(index[1][res[i][0]] + "\t");
			
			for (int j = 0; j < jum[i].length; j++) 
			{
				System.out.print(jum[i][j] + "\t");
			}
			
			if(res[i][0] == 0) System.out.print("\t");
			
			
			for (int j = 1; j < res[i].length; j++) 
			{
				System.out.print(res[i][j] + "\t");
			}
			
			System.out.println();
		}

	}

}
