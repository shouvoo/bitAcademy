package text_p;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] ppArr = {"#", "0", "######", "00000000", "#.##", "####0000", "#,##.00", ".00000",
				"¾ç¼ö#;À½¼ö0,00.00"};
		Object [] ooArr = {123, -123, 123456, -123456, -123456.789012, 0};
		for (String pp : ppArr) 
		{
			DecimalFormat df = new DecimalFormat(pp);
			System.out.print(pp + " : ");
			for (Object oo : ooArr) 
			{
				System.out.print(df.format(oo) + ", ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------");
		
		String [] patternArr = {"¡ã#;¡å#"};
		Object [][] jumArr = {{"±è¿µÈñ", 56, 76, 87},
							  {"¹Ú¿µÈñ", 89, 84, 86},
							  {"½Å¿µÈñ", 90, 24, 34},
							  {"¼Õ¿µÈñ", 54, 78, 64},
							  {"¿À¿µÈñ", 31, 97, 37}};
		int avg = 0;
		
		for (int k = 0; k < patternArr.length; k++) 
		{
			DecimalFormat df = new DecimalFormat(patternArr[k]);
		
		
			for (int i = 0; i < jumArr.length; i++) 
			{
				avg = 0;
				for (int j = 1; j < jumArr[i].length; j++) 
				{
					avg += (int)jumArr[i][j];
				}
				System.out.println(df.format((avg / 3) - 80).charAt(0) + " : " + df.format((avg / 3) - 80));
				System.out.println(avg / 3 + "  :  " + df.format((avg / 3) - 80).charAt(0) + (avg / 3));

			}
		
		}
		
		DecimalFormat df = new DecimalFormat("0,00.##");
		try {
			double dd = (double)df.parse("12,34,56.1234");
			System.out.println(dd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
