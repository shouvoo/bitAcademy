package homeWork_20170911;

import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String holy="01/01_신정,03/20_탄신일,05/05_어린이날,12/25_성탄절,08/18_욕일,";
		int yy = 2017;
		Calendar now = Calendar.getInstance();
		
		String nowStr = now.get(Calendar.MONTH)+"/"+now.get(Calendar.DATE);
		Date date = new Date(2017 - 1900, 0, 1);
		
		int [][][] pp = new int [12][6][7];
		String [][][] hopp = new String [12][6][7];
		
		for (int i = 0; i <356; i++) {
			date.setDate(i + 1);
			pp[now.get(Calendar.MONTH)][now.get(Calendar.WEEK_OF_MONTH)-1][now.get(Calendar.DAY_OF_WEEK)-1] 
					= now.get(Calendar.DATE);
			
			System.out.println(date.getMonth() + " : " + date.getDate());
			
			
			
		}

	}

}
