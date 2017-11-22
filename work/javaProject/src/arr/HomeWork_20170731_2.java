package arr;

public class HomeWork_20170731_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1. 입력부
		int [][][] scoreArr = {
						{{88, 66, 20},
						{95, 96, 99},
						{64, 84, 54},
						{87, 78, 30},
						{85, 82, 61}}, 
				
						{{88, 66, 78},
						{95, 96, 99},
						{64, 84, 54},
						{87, 78, 60},
						{85, 82, 62}}
						};
		
		String [][] nameArr = {{"학생1", "학생2", "학생3", "학생4", "학생5"},
								{"학생1", "학생2", "학생3", "학생4", "학생5"}};
		String [][] genderArr = {{"남", "여", "남", "남", "여"},
								{"남", "여", "남", "남", "여"}};
		
		String [] index = {"이름", "성별", "국어", "수학", 
	              "국사", "총점", "평균", "등수"};
		
		int [][] resultArr = new int [nameArr[0].length][3];
		//1. 총점, 2. 평균, 3. 등수
		
		//연산부
		
		for(int c = 0; c < scoreArr.length; c++)
		{
			resultArr = new int [nameArr[0].length][3];
			System.out.println("==================" + (c + 1) + "반==================");
			for (int i = 0; i < scoreArr[c].length; i++) 
			{	
				for (int j = 0; j < scoreArr[c][i].length; j++) 
				{
					//System.out.println(scoreArr[c][i][j]);
					resultArr[i][0] += scoreArr[c][i][j];
				}
				resultArr[i][1] = resultArr[i][0] / scoreArr[c][i].length;
			}
			
			for (int i = 0; i < resultArr.length; i++) 
			{
				resultArr[i][2] = 1;			
				
				for (int j = 0; j < resultArr.length; j++) 
				{
					if(resultArr[i][1] < resultArr[j][1])
					{
						resultArr[i][2]++;	
					}
				}
			}
		
		//출력부
		
			
			String line = "";
			
			for (int i = 0; i < index.length; i++) 
			{
				System.out.print(index[i] + "\t");
				line += "========";
			}
			
			System.out.println("\n" + line);
			
			for (int i = 0; i < nameArr[c].length; i++) 
			{
				System.out.print(nameArr[c][i] + "\t");
				System.out.print(genderArr[c][i] + "\t");
				
				for (int j = 0; j < scoreArr[c][i].length; j++) 
				{
					System.out.print(scoreArr[c][i][j] + "\t");
				}
				
				if(resultArr[i][0] == 0) System.out.print("\t");
				
				
				for (int j = 0; j < resultArr[i].length; j++) 
				{
					System.out.print(resultArr[i][j] + "\t");
				}
				
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
		
		}

	}

}
