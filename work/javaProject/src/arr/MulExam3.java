package arr;

public class MulExam3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1. 입력부
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
		
		String [] name = {"학생1", "학생2", "학생3", "학생4", "학생5", 
							"학생1-1", "학생2-1", "학생3-1", "학생4-1", "학생5-1"};
		
		String [][] index = {{"이름", "성별", "반", "국어", "수학", 
            "국사", "lol", "총점", "평균", "전체등수", "성별등수", "반별"}, 
			  new String[] {"여", "남"}};
		String line = "";
		
		int [][] res = new int [name.length][6];
		//0.성별, 1. 총점, 2. 평균, 3. 등수, 4. 성별등수
		
		//연산부
		int maxSub = 0;
		
		for (int i = 0; i < jum.length; i++) 
		{	
			if(maxSub < jum[i].length)
			{
				maxSub = jum[i].length;
			}
			
			for (int j = 1; j < jum[i].length; j++) 
			{
				res[i][1] += jum[i][j]; // 총점
			}
			res[i][2] = res[i][1] / (jum[i].length - 1); //평균
		}
		
		
		//성별
		for (int i = 0; i < res.length; i++) 
		{
			res[i][0] = jum[i].length / maxSub;
		}
		
		
		//등수
		for (int i = 0; i < res.length; i++) 
		{
			
			for (int j = 3; j < res[i].length; j++) 
			{
				res[i][j] = 1; //등수 초기화
			}
			
			for (int j = 0; j < res.length; j++) 
			{
				if(res[i][2] < res[j][2])
				{
					res[i][3]++;	// 등수올리기
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
		
		
		
		
		//출력부
		
		
		
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
