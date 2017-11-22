package lang_p;

public class JuminMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jumin = "890320-0234567";
		//1234567890
		//12345678-1-1
		int kind = jumin.charAt(7)-'0';
		String gender = "여남".charAt(kind%2)+"자";
		String local = "내외내".charAt((kind-1)/4)+"국인";
		
		String dd = "년월일";
		int subKind = kind%9-1;
		String birth=""+(19+( subKind<0 ?-1:(subKind)%4/2));
		for (int i = 0; i < dd.length(); i++) {
			birth+=jumin.substring(i*2, i*2+2)+dd.charAt(i);
		}
		
		System.out.println(gender);
		System.out.println(local);
		System.out.println(birth);
		
		
		String sss = "785.4231";
		
		System.out.println(sss+100);
		
		double bbb =0;
		
		boolean chk = true;
		
		double dou =1;
		for (int i = 0; i < sss.length(); i++) {
			
			char ch = sss.charAt(i);
			if (ch=='.')
				chk = false;
			else {
				if (chk) {
					bbb*=10;
					System.out.println(bbb);
					bbb +=ch-'0';
				}else {
					dou*=10;
					bbb += (ch-'0')/dou;
				}
			}
			System.out.println(bbb);
			System.out.println("------------------");
			
		}
		
		System.out.println(bbb+100);
		
		
	}

}

