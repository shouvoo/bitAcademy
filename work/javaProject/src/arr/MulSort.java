package arr;

public class MulSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [][] arr = {{85, 76, 78},
						{75, 76, 78},
						{95, 96, 98},
						{65, 46, 48},
						{45, 86, 88},
						{75, 66, 68}};
		
		int [] buf;
		int intBuf;
		String nameBuf;
		
		
		String [] nameArr = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5", "�л�6"};
		String [] index = {"�̸�", "����", "����", "����", "����", "���"};
		String line = "";
		int [] res = new int[arr.length];
		
		
		//�����
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
			line += "========";
		}
		
		System.out.println();
		
		//�Էº�
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				res[i] += arr[i][j];
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			for (int j = i; j < arr.length; j++) 
			{
				if(res[i] < res[j])
				{
					buf = arr[i]; 
					arr[i] = arr[j];
					arr[j] = buf;
					
					intBuf = res[i]; 
					res[i] = res[j];
					res[j] = intBuf;
					
					nameBuf = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = nameBuf;
				}
			}
		}
		
		
		
		
		
		
		
		//��º�
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(nameArr[i] + "\t");
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.print(res[i] + "\t");
			System.out.print(res[i] / arr[0].length);
			System.out.println();
		}
		
		
		
		
		
		/*for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}*/
		
		
		
		/*for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i; j < arr.length; j++) 
			{
				
				if(arr[i][0] < arr[j][0])
				{
					buf = arr[i];
					arr[i] = arr[j];
					arr[j] = buf;
				}
				
			}
			
		}
		
		for (int [] st : arr) 
		{
			
			for (int i : st) 
			{
				System.out.print(i + ", ");
			}
			System.out.println();
		}*/
		
		

	}

}
