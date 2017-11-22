package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TreeMap;

public class SimpleDateFormatMain_ME 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] ppArr = {"y", "yy", "yyyy",
							"M", "MM", "MMM", "MMMM",
							"d", "dd", "E", "EEEE", "F", "z", "Z",
							"a", "H", "HH",
							"m", "mm",
							"D", "DD", "w", "ww", "W", "WW", //w 는 올해들어 몇번째 주, W 는 이번달 들어 몇번재 주
							"s", "ss",
							"S", "SSS"}; // F 는 이번달 들어서 몇번째 목요일 인가
		Date now = new Date();
		now.setYear(1989 - 1900);
		now.setMonth(10);
		now.setDate(28);
		now.setHours(05);
		now.setMinutes(07);
		now.setSeconds(30);
		
		
		
		
		
		for (String pp : ppArr) 
		{
			SimpleDateFormat sdf = new SimpleDateFormat(pp, new Locale("en"));
			SimpleDateFormat sdf1 = new SimpleDateFormat(pp, new Locale("ko"));
			SimpleDateFormat sdf2 = new SimpleDateFormat(pp, new Locale("zh"));
			System.out.println(pp + " : " + sdf.format(now)+ " : " + sdf1.format(now)+ " : " + sdf2.format(now));
			
		}
		
		String [] ymd = {"yy年   ", "MMM ", "dd ", "(E) ", "hh:", "mm:", "ss"};
		String [] c = {"ko", "en", "ko", "ja", "ko", "ko", "ko"};
		
		for (int i = 0; i < ymd.length; i++) 
			
		{
			SimpleDateFormat sdf = new SimpleDateFormat(ymd[i], new Locale(c[i]));
			System.out.print(sdf.format(now));	
		}
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("yy年  MMM dd일 (", new Locale("en"));
		String str = "'" + sdf.format(now);
		sdf = new SimpleDateFormat("E) hh:mm:ss", new Locale("ko"));
		str += sdf.format(now);
		sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		try {
			now = sdf.parse("1989-03-20 15:23:35");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
		
		String jumin = "890111 - 1234567";
		/*int yy = Integer.parseInt(jumin.substring(0, 2));
		int mm = Integer.parseInt(jumin.substring(2, 4));
		int dd = Integer.parseInt(jumin.substring(4, 6));
		Date juminDate = new Date(yy, mm - 1, dd);
		
		SimpleDateFormat juminSDF = new SimpleDateFormat("yy년  MMM dd일 ");
		System.out.println(juminSDF.format(juminDate));*/
		
		
		try {
			String birthStr = ((jumin.charAt(7) - '0') - 1) % 4 / 2 + 19 + jumin.substring(0,  6);
			now = sdf.parse(birthStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(now);
		
	}

}
