package arr;

public class MulExam3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1. �Էº�
		int [][] jum = {{1, 88, 66, 78},
						{3, 95, 96, 99, 98},
						{3, 64, 84, 54},
						{2, 87, 78, 60, 96},
						{1, 85, 82, 61},
						{2, 88, 66, 78},
						{3, 95, 96, 99, 98},
						{1, 64, 84, 54},
						{2, 87, 78, 60, 96},
						{1, 85, 82, 61}};
		
		String [] name = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5", 
							"�л�1-1", "�л�2-1", "�л�3-1", "�л�4-1", "�л�5-1"};
		
		String [][] index = {{"�̸�", "����", "��", "����", "����", 
            "����", "lol", "����", "���", "��ü���", "�������", "�ݺ�"}, 
			  new String[] {"��", "��"}};
		String line = "";
		
		int [][] res = new int [name.length][6];
		//0.����, 1. ����, 2. ���, 3. ���, 4. �������
		
		//�����
		int maxSub = 0;
		
		for (int i = 0; i < jum.length; i++) 
		{	
			if(maxSub < jum[i].length)
			{
				maxSub = jum[i].length;
			}
			
			for (int j = 1; j < jum[i].length; j++) 
			{
				res[i][1] += jum[i][j]; // ����
			}
			res[i][2] = res[i][1] / (jum[i].length - 1); //���
		}
		
		
		//����
		for (int i = 0; i < res.length; i++) 
		{
			res[i][0] = jum[i].length / maxSub;
		}
		
		
		//���
		for (int i = 0; i < res.length; i++) 
		{
			
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
					
					if(jum[i][0] == jum[j][0])
					{
						res[i][5]++;
					}
				}
			}
		}
		
		
		
		
		//��º�
		
		
		
		for (int i = 0; i < index[0].length; i++) 
		{
			System.out.print(index[0][i] + "\t");
			line += "========";
		}
		
		System.out.println("\n" + line);
		
		for (int i = 0; i < name.length; i++) 
		{
			System.out.print(name[i] + "\t");
			
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
