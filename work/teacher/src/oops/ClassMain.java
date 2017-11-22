package oops;

class AAA{			///1. 정의
	int a = 10;
	
	void meth()
	{
		System.out.println("AAA meth()");
	}
}

class HandPhone{
	String camera="일반카메라", ear="일반이어폰";
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a1  =  new AAA();	
		//2. 선언	3. 생성
		AAA a2;
		a2 = new AAA();
		
		a1.a = 20;
		
		System.out.println(a1);  //4. 호출
		System.out.println(a2);  //4. 호출
		
		System.out.println(a1.a);  //4. 호출
		System.out.println(a2.a);  //4. 호출
		
		a1.meth();
		a2.meth();
		
		System.out.println("------------------------");
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone();
		
		hp1.camera="광학카메라";
		hp2.ear="블루투스 이어폰";
		
		/*System.out.println(hp1.camera+","+hp1.ear);
		System.out.println(hp2.camera+","+hp2.ear);*/
		
		HandPhone hh;
		System.out.println(hp1);
		System.out.println(hp2);
		//System.out.println(hh);
		
		hh = hp1;
		System.out.println(hh.camera+","+hh.ear);
		hh = hp2;
		System.out.println(hh.camera+","+hh.ear);
		
		System.out.println("------------------------");
		
		HandPhone [] arr = {hp1, hp2};
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(
					arr[i].camera+","+arr[i].ear);
		}*/
		hp1.ear = "헤드셋";
		for (HandPhone hp : arr) {
			System.out.println(
					hp.camera+","+hp.ear);
		}
		
		
	}

}
