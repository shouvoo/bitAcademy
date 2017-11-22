package oops;
//자동차 성능 테스트 클래스를 구현하세요
//출력내용 : 차종, 차이름, 항목들, 점수

//차종 : 스포츠카   -- 속도  60, 연비 40
       //승합차 -- 연비 30, 탑승인원 30, 안정성 40
       //트럭    -- 연비 50, 적재량 50, 화물종류

//생성자를 이용하여 익명 클래스로  구현하세요
class ConstCar
{
	String name, kind, goods="";
	int [] jum;
	double [] rate;
	double total;
	
	ConstCar(String name,int speed, int eff)
	{
		kind = "스포츠카";
		this.name =name;
		jum = new int [] {speed, eff};
		rate = new double[] {0.6, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, int safe)
	{
		kind = "승합차";
		jum = new int [] {eff, cnt, safe};
		rate = new double[] {0.3, 0.3,0.4};
		this.name =name;
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, String goods)
	{
		kind = "트럭";
		jum = new int [] {eff, cnt};
		rate = new double[] {0.5,0.5};
		this.goods = goods+"\t";
		this.name =name;
		cal();
	}
	
	void cal()
	{
		total=0;
		for (int i = 0; i < jum.length; i++) {
			total+= rate[i]*jum[i];
		}
	}
	
	void print()
	{
		String res = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			res += i+"\t";
		}
		
		res+=goods+total;
		
		System.out.println(res);
	}
}
public class ConstCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstCar [] arr = {
				new ConstCar("포르쉐",88,76),
				new ConstCar("스타렉스",77,75,73),
				new ConstCar("타이탄",65,62,"잡석"),
				new ConstCar("람보르기니",77,72)
		};
		
		for (ConstCar constCar : arr) {
			constCar.print();
		}
	}

}
