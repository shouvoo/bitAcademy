package lamda;

interface AAA{
	void print(int a);
}
public class LamdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a1 = new AAA() {
			
			@Override
			public void print(int a) {
				// TODO Auto-generated method stub
				System.out.println("생성시 재정의:"+a);
			}
		};
		
		AAA a2 = (a)->{System.out.println("람다식으로 재정의:"+a);};
		a1.print(10);
		a2.print(20);
	}

}
