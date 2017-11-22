package basic;

import java.io.IOException;

public class WhileFortune {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		mmm:while(true) {
			System.out.println("오늘의 운세!!!");
			System.out.println("1~3.운세, 0.종료");
			System.out.print("입력:");
			
			int num= System.in.read()-'0';
			System.in.read();	//엔터의 '\r'
			System.in.read();	//엔터의 '\n'
			
			String res;
			switch(num)
			{
				case 0:
					break mmm;
				case 1:
					res="오늘의 운세 완전 짱";
					break;
				case 2:
					res="그냥 그런 저런";
					break;
				case 3:
					res="헤어져";
					break;
				default:
					res="올바른 번호 요망";
					break;
			}
	
			System.out.println(res);	
		}
				
		System.out.println("프로그램 종료");
		
		
		
		//while scanner 을 이용하여 영화예약 프로그램을 생성하세요

		
	}

}
