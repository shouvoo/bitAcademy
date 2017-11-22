package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat pp = new SimpleDateFormat("yyyyMMdd"); 
		int year = 2017;

		Date now = new Date();
		String nowStr = pp.format(now);
		
		int last = 365-28+new Date(year-1900,2,0).getDate();
		
		String [][][] ppp = new String [12][6][7];
		
		for (String[][] strings : ppp) {
			for (String[] strings2 : strings) {
				for (int i = 0; i < strings2.length; i++) {
					strings2[i]="      ";
				}
			}
		}
		
		for (int i = 1; i <=last; i++) {
			now = new Date(year-1900,0,i);
			String pre=" ";
			String sur=" ";
			
			if(pp.format(now).equals(nowStr))
			{
				pre+="[";
				sur="] ";
			}else {
				pre+=" ";
				sur+=" ";
			}
			
			if(now.getDate()<10) pre+=" ";
			ppp[now.getMonth()]
			[Integer.parseInt(new SimpleDateFormat("W").format(now))-1]
					[now.getDay()]=pre+now.getDate()+sur;
			
		}
		
		
		for (int i = 0; i < ppp.length; i+=3) {
			
			for (int j = i; j <i+3; j++) {
				System.out.print("          ======== "+(j+1)+"¿ù ========          \t");
			}
			System.out.println();
			
			for (int w = 0; w < 6; w++) {
				for (int m = i; m <i+3; m++) {
					
				
					for (int d = 0; d <7; d++) {
						System.out.print(ppp[m][w][d]);
					}
					
					System.out.print("\t");
				}
				
				System.out.println();
			}
			System.out.println();
		}
			
	}
}
