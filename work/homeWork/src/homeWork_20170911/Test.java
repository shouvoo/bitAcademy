package homeWork_20170911;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ppArr = {	"M",
				"D", "w", "ww", "W", "WW"}; // F 는 이번달 들어서 몇번째 목요일 인가
		
		
		Date now = new Date();
		now.setYear(2017 - 1900);
		now.setMonth(0);
		now.setDate(12);
		
		
		
		System.out.println(now);
		
		for (String pp : ppArr) 
		{
		SimpleDateFormat sdf = new SimpleDateFormat(pp, new Locale("en"));
		System.out.println(pp + " : " + sdf.format(now));
		
		}

	}

}
