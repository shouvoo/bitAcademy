package arr;

public class HomeWork_20170731_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] nameArr = {"학생1", "학생2", "학생3", "학생4", "학생5"};
		String [] genderArr = {"남", "여", "남", "남", "여"};
		int [][] resArr = new int [nameArr.length][3]; //0. 총점, 1. 평균, 2. 등수
		int [][] scoreArr = new int[][]{{88, 66, 78},
										{95, 96, 99},
										{64, 84, 54},
										{87, 78, 60},
										{85, 82, 61}};
										
		String [] indexArr = {"이름", "성별", "국어", "수학", 
              				  	 "국사", "총점", "평균", "등수"};
		//연산부
		
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
		
		//출력부
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
				if(genderArr[i] == "여")
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
				if(genderArr[i] == "남")
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
