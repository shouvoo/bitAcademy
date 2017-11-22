package text_p;

import java.text.DecimalFormat;

public class ExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="¿Âµø∞«";
		int [] jum= {77,89,91};
		
		int sum = 0;
		
		for (int i : jum) {
			sum+=i;
		}
		
		int avg = sum/jum.length;
		
		System.out.println(name);
		
		for (int i : jum) {
			System.out.println(i);
		}
		
		System.out.println(sum);
		
		DecimalFormat df = new DecimalFormat("°„#;°Â#");
		System.out.println(""+df.format(avg-80).charAt(0)+avg);
	}

}
