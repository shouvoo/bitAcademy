package dynamic;

class Car
{
	String kind, name;
	int [] jum;
	double res;
	double [] rate;
	
	Car(String kind, String name, int[] jum) 
	{
		super();
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}
	
	void cal()
	{
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
	}

	void print()
	{
		String str = kind + "\t" + name + "\t";
		for (int i : jum) 
		{
			str += i + "\t";
		}
		
		str += res + "\t";
		System.out.println(str);
	}
	
	
}

class Sports extends Car
{
	public Sports(String name, int speed, int eff) 
	{
		// TODO Auto-generated constructor stub
		super("½ºÆ÷Ã÷Ä«", name, new int [] {speed, eff});
		rate = new double [] {0.6, 0.4};
		cal();
		print();
	}
}

class Van extends Car
{
	public Van(String name, int eff, int cnt, int safe) 
	{
		// TODO Auto-generated constructor stub
		super("½ÂÇÕÂ÷", name, new int [] {eff, cnt, safe});
		rate = new double [] {0.3, 0.3, 0.4};
		cal();
		print();
	}
}

class Truck2 extends Car
{
	public Truck2(String name, int eff, int cnt, String  goods) 
	{
		// TODO Auto-generated constructor stub
		super("Æ®·°", name, new int [] {eff, cnt});
		rate = new double [] {0.5, 0.5};
		cal();
		print(goods);
	}
	
	void print(String etc)
	{
		String str = kind + "\t" + name + "\t";
		for (int i : jum) 
		{
			str += i + "\t";
		}
		
		str += res + "\t" + etc;
		System.out.println(str);
	}
}

public class CarMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Sports("¶÷º¸¸£±â´Ï" + "\t", 87, 76);
		new Van("ºÀ°í", 87, 76, 50);
		new Truck2("Å¸ÀÌÅº", 87, 76, "½Ã¸àÆ®");
	}

}
