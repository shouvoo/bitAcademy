package util_p;

import java.util.Calendar;

public class DiaryHomework {

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

		String holy="01/01_����,03/20_ź����,05/05_��̳�,12/25_��ź��,08/18_����,";
		int yy = 2017;
		Calendar now = Calendar.getInstance();
		
		String nowStr = now.get(Calendar.MONTH)+"/"+now.get(Calendar.DATE);
		
		now.set(yy, 0,1);
		
		int [][][] pp = new int [12][6][7];
		String [][][] hopp = new String [12][6][7];
		
		for (int i = 0; i <now.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			
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
			
		}
		
		for (int i = 0; i < pp.length; i+=3) {
			System.out.println((i+1)+"��");
			
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
