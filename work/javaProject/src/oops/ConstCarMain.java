package oops;

class ConstCar
{
	String name, kind, goods = "";
	int [] jum;
	double [] rate;
	double total;
	
	ConstCar(String name, int speed, int eff)
	{
		kind = "스포츠카";
		this.name = name;
		jum = new int[] {speed, eff};
		rate = new double [] {0.6, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, int safe)
	{
		kind = "승합차";
		this.name = name;
		jum = new int[] {eff, cnt, safe};
		rate = new double [] {0.3, 0.3, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, String goods)
	{
		kind = "트럭";
		this.name = name;
		jum = new int[] {eff, cnt};
		this.goods = goods + "\t";
		rate = new double [] {0.5, 0.5};
		cal();
	}
	
	void cal()
	{
		total = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			total += rate[i] * jum[i];
		}
	}
	
	void print()
	{
		String res = kind + "\t" + name + "\t";
		
		for (int i : jum) 
		{
			res += i + "\t";
		}
		
		res += goods + total;
		System.out.println(res);
	}
}

public class ConstCarMain 
{
	public static void main(String[] args)
	{
		ConstCar [] cc = {new ConstCar("람보르기니", 50, 13), 
							new ConstCar("봉고", 90, 80, 40), 
							new ConstCar("10톤 트럭", 60, 50, "오토바이")};
		
		for (ConstCar constCar : cc) 
		{
			constCar.print();
		}
	}
}
