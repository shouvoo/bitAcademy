package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] ppArr = {
		"y","yy","yyyy",
		"M","MM","MMM","MMMM",
		"d","dd","D","DD",
		"w","ww","W","W",
		"E","EEEE","F","z","Z",
		
		"a","H","HH",
		"m","mm",
		"s","ss",
		"S","SSS"
		
		};
		
		Date now = new Date();
		
		for (String pp : ppArr) {
			SimpleDateFormat sdf1 = 
				new SimpleDateFormat(pp, new Locale("en"));
			SimpleDateFormat sdf2 = 
					new SimpleDateFormat(pp, new Locale("ko"));
			System.out.println(pp+":"
					+sdf1.format(now)+","
					+sdf2.format(now));
			
			
		}
		
		
		  //// '89年  nov 28일 (화) 05:07:30 
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yy年  MMM dd일 (", new Locale("en"));
		String str = "'"+sdf.format(now);
		
		sdf = 
				new SimpleDateFormat("E) hh:mm:ss", new Locale("ko"));
		str+=sdf.format(now);
		
		System.out.println(str);
		
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try {
			now = sdf.parse("1989-03-20 15:23:35");
			
			System.out.println(now);
			
			
			sdf = new SimpleDateFormat("yyyyMMdd");
			
			String jumin = "131011-3234567";
			
			
			now = sdf.parse(((jumin.charAt(7)-'0')-1)%4/2+19+jumin.substring(0, 6));
			
			System.out.println(now);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*올해생일 언제
		다가오는 생일
		d - day
		생일 파티가 토, 일이면 그주 금요일*/

		
	}

}
