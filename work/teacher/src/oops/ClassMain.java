package oops;

class AAA{			///1. ����
	int a = 10;
	
	void meth()
	{
		System.out.println("AAA meth()");
	}
}

class HandPhone{
	String camera="�Ϲ�ī�޶�", ear="�Ϲ��̾���";
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a1  =  new AAA();	
		//2. ����	3. ����
		AAA a2;
		a2 = new AAA();
		
		a1.a = 20;
		
		System.out.println(a1);  //4. ȣ��
		System.out.println(a2);  //4. ȣ��
		
		System.out.println(a1.a);  //4. ȣ��
		System.out.println(a2.a);  //4. ȣ��
		
		a1.meth();
		a2.meth();
		
		System.out.println("------------------------");
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone();
		
		hp1.camera="����ī�޶�";
		hp2.ear="������� �̾���";
		
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
		hp1.ear = "����";
		for (HandPhone hp : arr) {
			System.out.println(
					hp.camera+","+hp.ear);
		}
		
		
	}

}
