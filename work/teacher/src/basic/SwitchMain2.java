package basic;

public class SwitchMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int avg =48;
		
		switch(avg/10)
		{
			case 10:
			case 9:
				System.out.println("수");
				break;
			case 8:
				System.out.println("우");
				break;
			case 7:
				System.out.println("미");
				break;
			case 6:
				System.out.println("양");
				break;
			default:
				System.out.println("가");
				break;
		}
		
		
		double pp = 3.8;
		String str;
		switch((int)(pp*2))
		{
			case 9:
				str="A+";
				break;
			case 8:
				str="A";
				break;
			case 7:
				str="B+";
				break;
			case 6:
				str="B";
				break;
			case 5:
				str="C+";
				break;
			case 4:
				str="C";
				break;
			case 3:
				str="D+";
				break;
			case 2:
				str="D";
				break;
			default:
				str="F";
				break;
		}
		System.out.println(pp+":"+str);
		
		String ch = ""+(char)('A'+4-(int)pp);
		
		switch((int)(pp%1/0.5))
		{
			case 1:
				ch+="+";
				
		}
		
		System.out.println(ch);
		
		
	}

}
