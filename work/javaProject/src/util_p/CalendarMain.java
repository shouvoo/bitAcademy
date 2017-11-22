package util_p;

import java.util.Calendar;

class Singletone
{
	static Singletone singletone = null;
	private Singletone() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static Singletone getInstance()
	{
		if(singletone == null)
		{
			singletone = new Singletone();
		}
		
		return singletone;
	}
	
	String getDateInfo(Calendar now)
	{
		String day = "�Ͽ�ȭ�������";
		String res = "";
		res = "" + now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + 
				now.get(Calendar.DATE) + " (" + day.charAt(now.get(Calendar.DAY_OF_WEEK) - 1) + ") " +
				now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + 
				now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND); 
		return res;
	}
}

public class CalendarMain 
{
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String day = "�Ͽ�ȭ�������";
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.println(day.charAt(now.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("------------------------------------------------");
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.HOUR) + "��");
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "��");
		System.out.println(now.get(Calendar.MINUTE) + "��");
		System.out.println(now.get(Calendar.SECOND) + "��");
		System.out.println(now.get(Calendar.MILLISECOND) + "�и� ��");
		
		
		
		
		//2017-08-29 (ȭ) 15:51:43.123
		
		
		
		
		Singletone st = Singletone.getInstance();
		System.out.println(st.getDateInfo(now));
		
		now.set(Calendar.YEAR, 1979);
		now.set(Calendar.MONTH, 7-1);
		now.set(Calendar.DATE, 23);
		
		now.set(1979, 7-1, 23);
		now.set(2017, 7-1, 23, 22, 34, 23);
		print(now);
		
		now.set(2017, 7-1, 1, 22, 34, 23);
		print(now);
		
		System.out.println(now.getTimeInMillis());
		
		now.setTimeInMillis(0);
		print(now);
		now.setTimeInMillis(1000 * 60 * 60 * 12);
		print(now);
		
	}
	
	static void print(Calendar ddd)
	{
		String str = "" + ddd.get(Calendar.YEAR) + "-";
		
		if(ddd.get(Calendar.MONTH) < 9) str += 0;
		
		str += (ddd.get(Calendar.MONTH) + 1) + "-" + 
				ddd.get(Calendar.DATE) + " (" + "�Ͽ�ȭ�������".charAt(ddd.get(Calendar.DAY_OF_WEEK) - 1) + ") " +
				ddd.get(Calendar.HOUR_OF_DAY) + ":" + ddd.get(Calendar.MINUTE) + ":" + 
				ddd.get(Calendar.SECOND) + "." + ddd.get(Calendar.MILLISECOND); 
		System.out.println(str);
	}

}
