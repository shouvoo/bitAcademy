package arr;

public class HomeWork_20170731_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] nameArr = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5"};
		String [] genderArr = {"��", "��", "��", "��", "��"};
		int [][] resArr = new int [nameArr.length][3]; //0. ����, 1. ���, 2. ���
		int [][] scoreArr = new int[][]{{88, 66, 78},
										{95, 96, 99},
										{64, 84, 54},
										{87, 78, 60},
										{85, 82, 61}};
										
		String [] indexArr = {"�̸�", "����", "����", "����", 
              				  	 "����", "����", "���", "���"};
		//�����
		
		for (int i = 0; i < scoreArr.length; i++) 
		{	
			
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				resArr[i][0] += scoreArr[i][j];
			}
			resArr[i][1] = resArr[i][0] / scoreArr[i].length;
		}
		
		for (int i = 0; i < resArr.length; i++) 
		{
			resArr[i][2] = 1;			
			
			for (int j = 0; j < resArr.length; j++) 
			{
				if(resArr[i][1] < resArr[j][1])
				{
					resArr[i][2]++;	
				}
			}
		}
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//��º�
		String line = "";
		
		for (int i = 0; i < indexArr.length; i++) 
		{
			System.out.print(indexArr[i] + "\t");
			line += "========";
		}
		
		System.out.println("\n" + line);
		
		int woGrade = 0;
		for(int c = 0; c < 5; c++)
		{
			for (int i = 0; i < 5; i++) 
			{
				if(genderArr[i] == "��")
				{
					if(resArr[i][2] == c + 1)
					{
						System.out.print(nameArr[i] + "\t");
						System.out.print(genderArr[i] + "\t");
						
						for (int j = 0; j < scoreArr[i].length; j++) 
						{
							System.out.print(scoreArr[i][j] + "\t");
						}
						
						for (int j = 0; j < resArr[i].length - 1; j++) 
						{
							System.out.print(resArr[i][j] + "\t");
						}
						
						System.out.print(++woGrade + "\t");
						System.out.println();
		
					}
				} 
			}
		}	
		
		int manGrade = 0;
		for(int c = 0; c < 5; c++)
		{
			for (int i = 0; i < 5; i++) 
			{
				if(genderArr[i] == "��")
				{
					if(resArr[i][2] == c + 1)
					{
						System.out.print(nameArr[i] + "\t");
						System.out.print(genderArr[i] + "\t");
						
						for (int j = 0; j < scoreArr[i].length; j++) 
						{
							System.out.print(scoreArr[i][j] + "\t");
						}
						
						for (int j = 0; j < resArr[i].length - 1; j++) 
						{
							System.out.print(resArr[i][j] + "\t");
						}
						
						System.out.print(++manGrade + "\t");
						System.out.println();
		
					}
				} 
			}
		}		
		
		/*for(int c = 0; c < 5; c++)
		{
			for (int i = 0; i < 5; i++) 
			{
				if(resArr[i][2] == c + 1)
				{
					System.out.print(nameArr[i] + "\t");
					System.out.print(genderArr[i] + "\t");
					
					for (int j = 0; j < scoreArr[i].length; j++) 
					{
						System.out.print(scoreArr[i][j] + "\t");
					}
					
					for (int j = 0; j < resArr[i].length; j++) 
					{
						System.out.print(resArr[i][j] + "\t");
					}
					
					System.out.println();
	
				}
			}
		}		*/
	}

}
