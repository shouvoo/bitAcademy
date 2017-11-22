package util_p;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day ="일월화수목금토";
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.println(day.charAt(now.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("--------------------------------");
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		
		//2017-8-29 (화) 15:51:43.123
		
		print(now);
		
		now.set(Calendar.YEAR, 1989);
		now.set(Calendar.MONTH, 3-1);
		print(now);
		now.set(Calendar.DAY_OF_WEEK, 1);
		now.set(Calendar.DATE, 1);
		
		print(now);
		now.set(2002,5,2);
		print(now);
		now.set(2013,9,11,15,20,35);
		print(now);
		
		now.set(2013,20,50,15,20,35);
		print(now);
		
		System.out.println(now.getTimeInMillis());
		now.setTimeInMillis(0);
		print(now);
		now.setTimeInMillis(1000*60*60*12);
		print(now);
		
	}
	
	static void print(Calendar ddd)
	{
		String str=
		ddd.get(Calendar.YEAR)+"-";
		
		if(ddd.get(Calendar.MONTH)<9)
			str+=0;
		
		str+=
		(ddd.get(Calendar.MONTH)+1)+"-"+
		ddd.get(Calendar.DATE)+" ("+
		"일월화수목금토".charAt(ddd.get(Calendar.DAY_OF_WEEK)-1)+") "+
		ddd.get(Calendar.HOUR_OF_DAY)+":"+
		ddd.get(Calendar.MINUTE)+":"+
		ddd.get(Calendar.SECOND)+"."+
		ddd.get(Calendar.MILLISECOND);
		
		System.out.println(str);
	}

}

