package arr;

import java.io.IOException;

public class HomeWork_20170731 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub		
		String typeStr = "";
		int caseNum;
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
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		//연산부
		String [][] editArr = new String[nameArr.length][indexArr.length];
		
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
		
		homeWork:while(true) // 종료시 사용될 while
		{
			
			System.out.println("1. 성별별 등수, 2.반별 등수, 3.반별 성별 등수, 4.총반의 등수");
			caseNum = 0;			
			
			inputClass:while(true)
			{
				int input = System.in.read();
				
				if(input == 13) 
				{
					System.in.read();
					break inputClass;
				}
				caseNum *= 10;
				caseNum += input - '0';				
			}

			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
			gradeClass:while(true)
			{
				switch(caseNum)
				{
					case 1 :
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
						break gradeClass;
					case 2 :
						typeStr = "반을 추가해서 등수";
						//System.out.println(typeStr);
						break gradeClass;
					case 3 :
						typeStr = "반 -> 성별 등수";
						//System.out.println(typeStr);
						break gradeClass;
					case 4 :
						typeStr = "등수 순서대로 출력";
						//System.out.println(typeStr);
						break gradeClass;
					default : 
						break;
				}
				
			}	
			
			
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
			System.out.println("r. 다시하기, c.종료");
			
			
			endClass:while(true)
			{
				int input = System.in.read();				
				switch(input)
				{
					case 10 :
						continue homeWork;
					case 99 :
						break homeWork;
					default : 
						break;
				}
			}
			
		}
		
		System.out.println("종료하기");

	}

}
