package basic;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2항연산자");
		System.out.println("2_1 산술 연산자-----------");
		// param  숫자형 or 문자열
	    // return 숫자형 or 문자열
		
		int x = 15, y = 7;
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x+" * "+y+" = "+x*y);
		System.out.println(x+" / "+y+" = "+x/y);
		System.out.println(x+" % "+y+" = "+x%y);
		
		String str1 = "아기상어", str2="뚜루루 뚜루";
		System.out.println(str1+str2);
		System.out.println(str1+10);
		/*System.out.println(str1-str2);
		System.out.println(str1*str2);
		System.out.println(str1/str2);
		System.out.println(str1%str2);
		*/
		
		System.out.println("2_2 비교 연산자-----------");
		//param  숫자형  or 문자열
	    //return boolean (true,false)
		int z = 15;
		System.out.println(x +" >  "+z + " = "+ (x>z));
		System.out.println(x +" >=  "+z + " = "+ (x>=z));
		System.out.println(x +" <=  "+z + " = "+ (x<=z));
		System.out.println(x +" <  "+z + " = "+ (x<z));
		System.out.println(x +" ==  "+z + " = "+ (x==z));
		System.out.println(x +" !=  "+z + " = "+ (x!=z));
		
		
		System.out.println(str1==str2);
		System.out.println(str1!=str2);
		
		//System.out.println(str1==x);
		//System.out.println(str1>x);
		
		System.out.println("2_3 논리 연산자-----------");
		//param  boolean형
	    //return boolean (true,false)
		boolean bo1 =false, bo2 = false;
		
		System.out.println(bo1 && bo2);
		System.out.println(bo1 || bo2);
		System.out.println(bo1 ^ bo2);
		
		
		double kk = 189.6;
		int mm = 1300;
		
		/*boolean kkChk = kk >=185;
		boolean mmChk = mm >=1000;*/
		
		System.out.println("And :"+(kk >=185 && mm >=1000));
		System.out.println("Or :"+(kk >=185 || mm >=1000));
		System.out.println("Xor :"+(kk >=185 ^ mm >=1000));
		
		
		System.out.println("2_4 shift 연산자-----------");
		//param  숫자형
	    //return 숫자
		
		System.out.println(-5<<2);
		// 0101 + 00  ==>    01 0100   
		//                   16+ 4
		System.out.println(-5>>2);
		System.out.println(5>>2);
		// 0101  ==>  0001  / 01
		System.out.println(-5>>>2);
		System.out.println(5>>>2);
		
		
		
		System.out.println("2_5 bit 연산자-----------");
		//param  숫자형
	    //return 숫자
		
		System.out.println(12 & 5);
		//1100
		//0101
		//0100
		System.out.println(12 | 5);
		//1101
		System.out.println(12 ^ 5);
		//1001
		
		System.out.println("2_6 대입 연산자-----------");
		//param  숫자형, 문자
	    //return 숫자, 문자
		
		x = 100;
		x = x+1;
		
		x += 5;
		//x = x*2;
		x *=2;
		System.out.println(x);
		
		//str1 = str1+"엄마 상어";
		str1+="엄마 상어";
		System.out.println(str1);
		
		
		
		System.out.println("1항연산자");
		int q = 20;
		boolean bbb = true;
		System.out.println(-q);
		System.out.println(!bbb);
		
		//q +=1;
		
		//q++;
		
		//System.out.println(q);
		//System.out.println(q++);
		System.out.println(++q);
		System.out.println(q);
		
		
		int a=5, b = 6, c = 10, d;
		 //   6    5       11
		 //   5
		 //   6
		
		d = a++ + ++c - b-- * --a + a++;
		//   5  +  11  -  6 *  5  + 5
		//   5  +  11  -    30   + 5
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		
		
		System.out.println("3항연산자");
		
		System.out.println(false ? "난 참이여" : "거짓이여");
		
		
		
		System.out.println("And :"+(kk >=185 && mm >=1000  ? "결혼가능" : "결혼불가능"));
		System.out.println("Or :"+(kk >=185 || mm >=1000));
		System.out.println("Xor :"+(kk >=185 ^ mm >=1000));
		
		
	}

}
