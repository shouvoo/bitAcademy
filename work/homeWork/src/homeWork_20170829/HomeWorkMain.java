package homeWork_20170829;

import java.util.Calendar;

public class HomeWorkMain 
{

	/*숙제
	 * 1월 2월 3월
	 * 4월 5월 6월
	 * 7월 8월 9월
	 * 완료후
	 * 오늘 일에  [] 해주기
	 * 완료후 
	 * 달력 날짜 밑에 공휴일 표시
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar makeCal = Calendar.getInstance();
		
		/*int count = 7;
		
		for (int c = 0; c < 4; c++) 
		{
			for (int i = 0; i < 5; i++) 
			{			
				for (int m = 0; m < 3; m++) 
				{
					for (int k = 1; k <= 7; k++) 
					{
						String pre = "";
						if( k + (i * 7) < 10) pre = " ";
						System.out.print(pre + (k + (i * 7)) + " ");
						makeCal.set(Calendar.DATE, k + (i * 7));
						count++;
						if(k == 7)
						{
							System.out.print("\t");
						}
					}
					
				}
				System.out.println();
			}
			System.out.println();
		}*/
		
		int [][][] dayArr = new int [12][6][7];
		int count = 0;
		int oldDay = 0;
		int [] startGap = new int[12];
		String [] space = new String [12];
		
		for (int i = 0; i < 12; i++) 
		{
			count = 0;
			oldDay = 0;
			
			makeCal.set(2017, i, 1);
			startGap[i] = makeCal.get(Calendar.DAY_OF_WEEK);
			space[i] = "";
			for (int j = 1; j < startGap[i]; j++) 
			{
				space[i] += "   ";
				
			}
			for (int k = 1; k <= makeCal.getActualMaximum(Calendar.DATE); k++) 
			{
				makeCal.set(Calendar.DATE, k);
				int dayCount = (makeCal.get(Calendar.DAY_OF_WEEK));
				dayArr[i][count][(dayCount - 1)] 
				= (k > oldDay) ? k : 0;
				if(makeCal.get(Calendar.DAY_OF_WEEK) == 7)
				{
					count++;
				}
				oldDay = k;
			}
		}
		
		/*for (int i = 0; i < dayArr.length; i++) 
		{
			for (int j = 0; j < dayArr[i].length; j++) 
			{
				for (int k = 0; k < dayArr[j].length + 1; k++) 
				{
					if(dayArr[i][j][k] > 0) 
					{
						String pre = "";
						if(dayArr[i][j][k] < 10) pre = " ";
						System.out.print(pre + dayArr[i][j][k] + " ");
					}
				}
				System.out.println();
				
			}
			
		}*/
		
		/*for (int i = 0; i < dayArr.length; i++) 
		{
			
			for (int j = 0; j < dayArr.length; j++) 
			{
				for (int k = 0; k < dayArr[j].length; k++) 
				{
					for (int l = 0; l < dayArr[k].length + 1; l++) 
					{
						if(dayArr[j][k][l] > 0) 
						{
							String pre = "";
							if(dayArr[j][k][l] < 10) pre = " ";
							System.out.print(pre + dayArr[j][k][l] + " ");
						}
						
						
					}

				}
	
			}
			
		}*/
		
		int cnt = 0;
		for (int j = 0; j < 4; j++) 
		{
			for (int i = 0; i < 6; i++) 
			{
				
				for (int m = cnt; m < 3 + cnt; m++) 
				{
					if(i == 0) System.out.print(space[m]);

					for (int k = 0; k < 7; k++) 
					{
						if(dayArr[m][i][k] > 0) 
						{
							String pre = "";
							if(dayArr[m][i][k] < 10) pre = " ";							
							System.out.print(pre + dayArr[m][i][k] + " ");
						}
					}
					
					System.out.print("\t");
					
				}
				
				System.out.println();
			}
			cnt += 3;
		}

		
		/*int [][] dayArr = new int [6][7];
		int count = 0;
		int oldDay = 0;
		int startGap = 0;
		
		for (int i = 0; i < 1; i++) 
		{
			makeCal.set(2017, i, 1);
			startGap = makeCal.get(Calendar.DAY_OF_WEEK);

			for (int j = 1; j < startGap; j++) 
			{
				System.out.println(j);
				dayArr[0][j] = 0;
			}
			
			for (int k = 1; k <= makeCal.getActualMaximum(Calendar.DATE); k++) 
			{
				makeCal.set(Calendar.DATE, k);
				dayArr[count][(startGap - 1) + (makeCal.get(Calendar.DAY_OF_WEEK)  - 1)] = (k > oldDay) ? k : 0;
				
				if(makeCal.get(Calendar.DAY_OF_WEEK) == 7)
				{
					count++;
				}
				oldDay = k;
			}
		}
		
		for (int i = 0; i < dayArr.length; i++) 
		{
			for (int j = 0; j < dayArr[i].length; j++) 
			{
				if(dayArr[i][j] > 0) 
				{
					String pre = "";
					if(dayArr[i][j] < 10) pre = " ";
					System.out.print(pre + dayArr[i][j] + " ");
				}
			}
			System.out.println();
		}*/
		
		
		/*for (int i = 0; i < 12; i++) 
		{
			makeCal.set(2017, i, 1);

			for (int j = 1; j < makeCal.get(Calendar.DAY_OF_WEEK); j++) 
			{
				System.out.print("   ");
			}
			
			for (int k = 1; k <= makeCal.getActualMaximum(Calendar.DATE); k++) 
			{
				
				String pre = "";
				if(k < 10) pre = " ";
				System.out.print(pre + k + " ");
				makeCal.set(Calendar.DATE, k);
				if(makeCal.get(Calendar.DAY_OF_WEEK) == 7)
				{
					System.out.println();
					System.out.println();
				}
			}
			System.out.println();
		}*/

	}

}
