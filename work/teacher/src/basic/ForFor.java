package basic;

public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int h = 1; h <=12; h++) {
			System.out.println(h+" 시>>>>>>>>>>>");
			for (int m = 0; m < 60; m++) {
				System.out.println(h+":"+m);
			}
			//System.out.println(m);
		}
		
		System.out.println("줄을 바꾼다1");
		System.out.println("줄을 바꾼다2");
		System.out.print("줄이 바뀌지 않는다1");
		System.out.print("줄이 바뀌지 않는다2\n");
		System.out.print("줄이 바뀌지 않는다3");
		System.out.println();
		System.out.println("아기상어\t엄마상어\t아빠상어");
		System.out.println("아기상\t엄마상\t아빠상어");
		
		
		
		for (int h = 2; h <10; h++) {
			System.out.println(h+" 단>>>>>>>>>>>");
			for (int m = 1; m <10; m++) {
				System.out.println(h+" x "+m+" = "+h*m);
			}
		}
		
		System.out.println("---------------------------");
		
		for (int h = 1; h <10; h++) {
			for (int m = 2; m <10; m++) {
				
				//여기서 에러가 납니다. 
				// 출력 함수에 무슨 문제가 나는지 헷갈립니다.
				//System.out.print(m+" x "+h+" = "+h=m+"\t");
			}
			System.out.println();
		}
	}

}
