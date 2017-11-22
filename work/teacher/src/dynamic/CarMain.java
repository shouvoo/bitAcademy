package dynamic;
/*부모클래스 : 자동차 - 차종, 차이름, 항목들, 점수

자식클래스 : 
스포츠카   -- 속도  60, 연비 40
        승합차 -- 연비 30, 탑승인원 30, 안정성 40
        트럭    -- 연비 50, 적재량 50, 화물종류*/
class Air{
	
}

class Car{
	String kind, name;
	int [] jum;
	double [] rate;
	double res;
	
	
	
	
	public Car(String kind, String name, int[] jum) {
		
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}


	void cal()
	{
		res=0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}
	}

	void print() {
		String str = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			str+=i+"\t";
		}
		str+=res+"\t";
		
		System.out.println(str);
	}
}

class Sports extends Car{
	
	public Sports(String name,int speed, int eff) {
		// TODO Auto-generated constructor stub
		super("스포츠카", name, new int [] {speed, eff});
		rate = new double[] {0.6,0.4};
		cal();
		print();
	}
}

class Van extends Car{
	
	public Van(String name,int eff, int cnt, int safe) {
		// TODO Auto-generated constructor stub
		super("승합차", name, new int [] {eff, cnt, safe});
		rate = new double[] {0.3,0.3,0.4};
		cal();
		print();
	}
}

class Truck extends Car{
	
	public Truck(String name, int eff, int cnt ,String goods) {
		// TODO Auto-generated constructor stub
		super("트럭", name, new int [] { eff, cnt});
		rate = new double[] {0.5,0.5};
		cal();
		print(goods);
	}
	
	void print(String etc) {
		String str = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			str+=i+"\t";
		}
		str+=res+"\t"+etc;
		
		System.out.println(str);
	}
}


public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Sports("람보르기니", 87,76);
		new Van("스타렉스",77,66,55);
		new Truck("타이탄",78,75,"시멘트");
	}

}
