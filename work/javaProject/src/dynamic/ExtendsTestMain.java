package dynamic;

import java.util.Iterator;

class ExtendsTest
{
	
	String carType, carName;
	String cargoType = "";
	int [] items;
	double [] compare;
	double [] scoreArr;
	int score;
	String [] compareType;
	
	void main()
	{
		scoreArr = new double[items.length];
		cal();
		print();
	}
	
	void print()
	{
		System.out.print("\t" + "\t");
		for (String ct : compareType) 
		{
			System.out.print(ct + "\t");
		}
		
		System.out.println();
		
		String res = carType + "\t" + carName + "\t";
		
		for (double i : scoreArr) 
		{
			res += i + "\t";
		};
		
		res += cargoType;
		System.out.println(res);
		System.out.println();
	}
	
	void cal()
	{
		for (int i = 0; i < items.length; i++) 
		{
			scoreArr[i] = items[i] * compare[i];
		}
	}
	
}

class SprotsCar extends ExtendsTest
{
	public SprotsCar(String cn, String ct, int [] arr, double [] ca)
	{
		compareType = new String [] {"속도", "연비"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		main();
	}
}

class Vans extends ExtendsTest
{
	public Vans(String cn, String ct, int [] arr, double [] ca)
	{
		compareType = new String [] {"연비", "탑승인원", "안정성"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		main();
	}
}

class Truck extends ExtendsTest
{
	public Truck(String cn, String ct, String cargo, int [] arr, double [] ca)
	{
		compareType = new String [] {"연비", "적재량", "화물종류"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		cargoType = cargo;
		main();
	}
}

public class ExtendsTestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*부모클래스 : 자동차 - 차종, 차이름, 항목들, 점수
		
		자식클래스 : 스포츠카 - 속도 60, 연비 40
					승합차 - 연비 30, 탑승인원 30, 안정성 40
					트럭 - 연비 50, 적재량, 50 화물종류*/
		new SprotsCar("스포츠카", "람보르기니",new int [] {90, 50}, new double [] {0.6, 0.4});
		new Vans("승합차", "버스",new int [] {70, 90, 60}, new double [] {0.3, 0.3, 0.4});
		new Truck("트럭", "볼보트럭", "오토바이", new int [] {20, 100}, new double [] {0.5, 0.5});

	}
	
	

}
