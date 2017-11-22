package arr;

import basic.forMain;

public class ClassRank 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*반을 넣고 반별, 번호별, 성별로 출력하세요
		각 카테고리별 등수 순서대로 출력하세요!
		출력방식
		1.전체등수 2.반별등수, 3.성별등수, 4.반,성별, 등수*/
		//1. 입력부
		int [][][] arr = {{{55, 76, 78},
							{75, 76, 78},
							{95, 96, 98},
							{35, 46, 88},
							{75, 96, 68}},
		
							{{95, 66, 78},
							{75, 66, 58},
							{65, 56, 98},
							{85, 76, 88},
							{65, 96, 68}}};

		String [][] genderArr = {{"남", "여", "남", "남", "여"},
								{"남", "여", "남", "남", "여"}};
		
		String [][] name = {{"현빈1", "골빈2", "이빈3", "오빈4", "여빈5"},
							{"현빈1-1", "골빈2-1", "이빈3-1", "오빈4-1", "여빈5-1"}};
		int [][][] res = new int[arr.length][5][2];
		int [][][] rank = new int[arr.length][5][1];
		
		//2연산부
		//2.1 총점, 평균
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				
				for(int k : arr[i][j]) 
				{
					res[i][j][0] += k;
				}
				res[i][j][1] = res[i][j][0] / arr[i][j].length;
			}
			
		}
		
		//2.2 등수(출력순서)
		String [] index = {"반", "이름", "성별", "국어", "영어", "수학", "총점", "평균", "등수"};
		
		String line = "";
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
			line += "========";
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < res[i].length; j++) 
			{
				rank[i][j][0] = 1;
				for (int[] you : res[i]) 
				{
					
					if(res[i][j][1] < you[1])
					{
						rank[i][j][0]++;
						//System.out.println(rank[i][j][0]);
					}
				}
			
			}
		
		}
		
		
		// 출력부
		
		for (int c = 0; c < arr.length; c++) 
		{
			for (int r = 1; r <= name[c].length; r++) 
			{
				
				for (int i = 0; i < name[c].length; i++) 
				{
					if(rank[c][i][0] == r)
					{
						System.out.print((c + 1) + "반" + '\t');
						System.out.print(name[c][i] + '\t');
						System.out.print(genderArr[c][i] + '\t');

						for (int j : arr[c][i]) 
						{
							System.out.print(j + "\t");
						}
						
						for (int j : res[c][i]) 
						{			
							System.out.print(j + "\t");
						}
						
						for (int j : rank[c][i]) 
						{			
							System.out.print(j + "\t");
						}
						
						/*for (int j : rank[i]) 
						{
							System.out.print(j + "\t");
						}*/
						
						System.out.println();
					}
				}
				
			}
			
			System.out.println();
		
		}
	}

}
