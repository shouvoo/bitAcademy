package basic;

import java.io.IOException;

public class HomeWork_20170727_2 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		System.out.println("영화종류");
		System.out.println("1. 액션  2. 비액션  3. 안액션  4. 다시예매  0. 종료" );
		
		String typeStr = "";
		firstWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					typeStr = "종료";
					break firstWhile;
				case 1 :
					typeStr = "액션";
					break firstWhile;
				case 2 :
					typeStr = "비액션";
					break firstWhile;
				case 3 :
					typeStr = "안액션";
					break firstWhile;
				case 4 :
					typeStr = "다시예매";
					break;
				default : 
					break;
			}
		}
		
		System.in.read();
		System.out.println("** " + typeStr + "선택  **");
		
		System.out.println("-------------------------------------------------------");
		
		System.out.print("예약인원");
		System.out.print("1. 성인  2. 학생  3. 어린이  4. 아줌마  5. 다시하기  0. 종료" );
		
		String reservationType = "";
		secondWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					reservationType = "종료";
					break secondWhile;
				case 1 :
					reservationType = "성인";
					break secondWhile;
				case 2 :
					reservationType = "학생";
					break secondWhile;
				case 3 :
					reservationType = "어린이";
					break secondWhile;
				case 4 :
					reservationType = "아줌마";
					break secondWhile;
				case 5 :
					reservationType = "다시하기";
					break;
				default : 
					break;
			}
		}
		
		System.in.read();
		System.out.println("** " + reservationType + "선택  **");
		
		System.out.println("-------------------------------------------------------");
		
		System.out.print("예약인원");
		System.out.print("1. 8명  0. 종료" );
		
		String reservationNumber = "";
		thirdWhile:while(true)
		{
			int input = System.in.read() - '0';
			
			switch(input)
			{
				case 0 :
					reservationNumber = "종료";
					break thirdWhile;
				case 1 :
					reservationNumber = "8명";
					break thirdWhile;
				default : 
					break;
			}
		}
		
		System.in.read();
		
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("*************************");
		
		System.out.println("영화종료  :  " + typeStr);
		System.out.println("액션선택  :  " + reservationType);
		System.out.println("예약인원  :  " + reservationNumber);
		System.out.println("** 예약이 완료되었습니다 **");
		

	}

}
