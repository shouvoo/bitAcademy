package util_p;

import java.util.Calendar;

public class DiaryMain 
{
	/*숙제
	 * 1월 2월 3월
	 * 4월 5월 6월
	 * 7월 8월 9월
	 * 
	 * 완료후
	 * 
	 * 오늘 일에  [] 해주기
	 * 
	 * 완료후 
	 * 
	 * 달력 날짜 밑에 공휴일 표시
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		now.set(Calendar.DATE, 1);
		
		for (int j = 1; j < now.get(Calendar.DAY_OF_WEEK); j++) 
		{
			System.out.print("   ");
		}
		
		for (int i = 1; i <= now.getActualMaximum(Calendar.DATE); i++) 
		{
			String pre = "";
			if(i < 10) pre = " ";
			System.out.print(pre + i + " ");
			now.set(Calendar.DATE, i);
			if(now.get(Calendar.DAY_OF_WEEK) == 7)
			{
				System.out.println();
			}
		}

	}

}
