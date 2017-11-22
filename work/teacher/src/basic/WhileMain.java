package basic;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;			//초기값
		while(a<5)			//조건
		{
			System.out.println("아기 상어"+a);
			a++;			//증감
		}
		
		////1->100까지 홀수들의 합
		int i =1, sum=0;
		
		while(i<=10)
		{
			sum+=i;
			System.out.println(i+","+sum);
			i+=2;
		}
	}

}
