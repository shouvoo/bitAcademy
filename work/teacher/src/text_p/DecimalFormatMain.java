package text_p;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] ppArr= {
				"#","0","#######","00000000",
				"#.##","####0000","#,##.00",".00000",
				"양수#;음수0,00.00"
		
		};
		Object [] ooArr = {123,-123,123456,-123456,123456.789012,-123456.789012,0};
		for (String pp : ppArr) {
			DecimalFormat df = new DecimalFormat(pp);
		
			System.out.print(pp+":");
			
			
			for (Object oo : ooArr) {
				
				System.out.print(df.format(oo)+", ");
				
			}
			System.out.println();
		}
		
		DecimalFormat df = new DecimalFormat("0,00.##");
		
		try {
			double dd = (double)df.parse("12,34,56.1234");
			System.out.println(dd+100);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
