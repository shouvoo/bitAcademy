package arr;

public class Car2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String [] carArr = {"������", "Ʈ��", "����"};
		
		int [][] scoreArr = {{90, 60, 60}, 
					  		{60, 75, 80}, 
					  		{90, 64, 90}};
		
		double [][] average = {{50, 30, 20}, 
								{20, 80, 20}, 
								{30, 40, 30}};
		
		double [][] result = new double[carArr.length][2];
		//1. ����, 2. ���
		
		String [] index = {"����", "�ӵ�", "����", "������", "����", "���"};
		
		
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				result[i][0] += scoreArr[i][j] * (average[i][j] / 100);
			}
			
		}
		
		for (int i = 0; i < result.length; i++) 
		{
			result[i][1] += 1;
			for (int j = 0; j < result.length; j++) 
			{
				if(result[i][0] < result[j][0])
				{
					result[i][1]++;
				}
			}
			
		}

		
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
		}
		
		System.out.println();
		
		for (int c = 1; c <= scoreArr.length; c++) 
		{
			for (int i = 0; i < scoreArr.length; i++) 
			{
				if((int)result[i][1] == c)
				{
					System.out.print(carArr[i] + "\t");
					for (int j = 0; j < scoreArr[i].length; j++) 
					{
						System.out.print(scoreArr[i][j] + "\t");				
					}
					
					System.out.print(result[i][0] + "\t");
					System.out.print((int)result[i][1] + "\t");
					
					System.out.println();
				}
			}
		}
	}

}





