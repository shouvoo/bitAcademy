package homeWork_20170911;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class HomeWork_20170911_2 
{
	static String dayStr(Calendar day)
	{
		int mm = (day.get(Calendar.MONTH)+1);
		int dd = day.get(Calendar.DATE);
		
		String mmStr = "";
		String ddStr = "";
		
		if(mm<10) mmStr="0";
		if(dd<10) ddStr="0";
		
		return mmStr+mm+"/"+ddStr+dd;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String holy="01/01_½ÅÁ¤,03/20_Åº½ÅÀÏ,05/05_¾î¸°ÀÌ³¯,12/25_¼ºÅºÀý,08/18_¿åÀÏ,";
		SimpleDateFormat sdf = new SimpleDateFormat("DD");
		int yy = 2017;
		Date nowDate = new Date(2017 - 1900, 1, 1);
		Calendar now = Calendar.getInstance();
		
		String nowStr = (nowDate.getMonth() + 1) +"/"+ nowDate.getDate();

		int [][][] pp = new int [12][6][7];
		String [][][] hopp = new String [12][6][7];
		
		for (int i = 0; i <365; i++) {
			System.out.println(now.get(Calendar.DAY_OF_WEEK)-1);
			pp[now.get(Calendar.MONTH)][now.get(Calendar.WEEK_OF_MONTH)-1][now.get(Calendar.DAY_OF_WEEK)-1] 
					= now.get(Calendar.DATE);
			
			String chkHH = dayStr(now);
			
			int pos =holy.indexOf(chkHH);
			if(pos>=0)
			{
				
				String ccc = holy.substring(holy.indexOf("_",pos)+1,holy.indexOf(",",pos));
				
				int ssh = 4-ccc.length();
				
				
				for (int j = 0; j < ssh; j++) {
					ccc+=" ";
				}
				
				hopp[now.get(Calendar.MONTH)][now.get(Calendar.WEEK_OF_MONTH)-1][now.get(Calendar.DAY_OF_WEEK)-1] 
						=" "+ccc+" " ;
			}
			
			now.add(Calendar.DATE, 1);
			nowDate.setDate(1);
		}
		
		for (int i = 0; i < pp.length; i+=3) {
			System.out.println((i+1)+"¿ù");
			
			for (int j =0 ; j<6; j++) {
				
				for (int m = i; m < i+3; m++) {
					for (int d : pp[m][j]) {
						
						String currStr = m+"/"+d;
						
						String pre="  ", sur="  ";
						
						if(nowStr.equals(currStr))
						{
							pre=" [";
							sur="] ";
						}
						
						if(d<10) pre+=" ";
						String str = pre+d+sur;
						
						if(d==0)
							str = pre+" "+sur;
						
						System.out.print(str);
					}
					System.out.print("\t");
				}
				
				
				System.out.println();
				
				for (int m = i; m < i+3; m++) {
					for (String d : hopp[m][j]) {
						
						if (d==null) d="______";
						System.out.print(d);
					}
					System.out.print("\t");
				}
				
				
				
				
				System.out.println();
			}
			System.out.println();
		}
	}

}
