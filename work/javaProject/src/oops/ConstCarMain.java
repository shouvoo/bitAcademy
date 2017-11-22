package oops;

class ConstCar
{
	String name, kind, goods = "";
	int [] jum;
	double [] rate;
	double total;
	
	ConstCar(String name, int speed, int eff)
	{
		kind = "������ī";
		this.name = name;
		jum = new int[] {speed, eff};
		rate = new double [] {0.6, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, int safe)
	{
		kind = "������";
		this.name = name;
		jum = new int[] {eff, cnt, safe};
		rate = new double [] {0.3, 0.3, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, String goods)
	{
		kind = "Ʈ��";
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
		ConstCar [] cc = {new ConstCar("���������", 50, 13), 
							new ConstCar("����", 90, 80, 40), 
							new ConstCar("10�� Ʈ��", 60, 50, "�������")};
		
		for (ConstCar constCar : cc) 
		{
			constCar.print();
		}
	}
}
