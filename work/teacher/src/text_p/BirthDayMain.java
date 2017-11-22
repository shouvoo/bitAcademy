package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class BirthDayMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String jumin ="130714-3234567";
		
		String birth = ((jumin.charAt(7)-'0')-1)%4/2+19+jumin.substring(0, 6);
		
		Date myBirth = new SimpleDateFormat("yyyyMMdd").parse(birth); 
		Date now = new Date();
		print("»ı³â¿ùÀÏ",myBirth);
		
		int age = now.getYear()-myBirth.getYear();
		System.out.println("ÇÑ±¹³ªÀÌ:"+(age+1));
		
		myBirth.setYear(now.getYear());
		print("¿ÃÇØ»ıÀÏ",myBirth);
		if(myBirth.getTime()>now.getTime()) { 
			age--;
		}else {
			myBirth.setYear(now.getYear()+1);
		}
		
		System.out.println("¹Ì±¹³ªÀÌ:"+age);
		print("´Ù°¡¿Ã»ıÀÏ",myBirth);
		
		
		if(myBirth.getDay()==6)
		{
			myBirth.setDate(myBirth.getDate()-1);
		}else if(myBirth.getDay()==0)
		{
			myBirth.setDate(myBirth.getDate()-2);
		}
		
		System.out.println("D-Day:"+(myBirth.getTime()-now.getTime())/(1000*60*60*24));
		
	}
	
	
	
	static void print(String index,Date dd)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (");
		
		
		String str = sdf.format(dd)+"ìíêÅûıâ©ÙÊĞİ÷Ï".charAt(dd.getDay())+")";
		
		System.out.println(index+":"+str);
		
		
		
	}

}
