package util_p;

import java.util.Calendar;

public class Calendar2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		
		Calendar dd = Calendar.getInstance();
		
		//dd =now;
		
		dd.set(2017,7,1);
		
		print(now);
		print(dd);
		
		System.out.println(now.after(dd));
		System.out.println(now.before(dd));
		
		
		System.out.println(now.getTimeInMillis()>dd.getTimeInMillis());
		
		//dd.set(Calendar.MONTH, dd.get(Calendar.MONTH)+2);
		dd.add(Calendar.MONTH,-2);
		print(dd);
		
		dd.set(2017,8,0);
		print(dd);
		
		
		print(now);
		
		System.out.println(now.getActualMaximum(Calendar.DATE));
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
