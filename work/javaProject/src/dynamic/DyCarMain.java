package dynamic;

class DyCar
{
	int [] jum;
	String kind, name;
	double res;
	int cnt;

	DyCar(String kind, String name, int[] jum) 
	{
		super();
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}
	
	void rank(DyCar [] dc)
	{
		cnt = 1;
		for (DyCar dyCar : dc) 
		{
			if(this.res < dyCar.res)
			{
				cnt++;
			}
		}
	}

	void print()
	{
		cal();
		String str = kind + "\t" + name + "\t" + res + "\t" + cnt;
		System.out.println(str);
	}
	
	void cal()
	{
		
	}
}

class DySport extends DyCar
{
	double [] rate = {0.5, 0.2, 0.3};

	DySport(String name, int speed, int eff, int design) 
	{
		super("������ī", name, new int [] {speed, eff, design});
		
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
	}

	/*void cal() 
	{
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
		
	}*/
	
}

class DyTruck extends DyCar
{
	double [] rate = {0.6, 0.4};

	DyTruck(String name, int eff, int cnt) 
	{
		super("Ʈ��", name, new int [] { eff, cnt});
		
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
	}

	/*void cal() 
	{
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
		
	}*/
	
}

class DyVans extends DyCar
{
	double [] rate = {0.15, 0.35, 0.5};

	DyVans(String name, int speed, int eff, int pass) 
	{
		super("������", name, new int [] {speed, eff, pass});
		
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
	}

	/*void cal() 
	{
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			res += rate[i] * jum[i];
		}
	}*/
	
}

public class DyCarMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DyCar [] arr = {new DySport("���������", 77, 88, 99), 
						new DyTruck("Ÿ��ź", 78, 89), 
						new DyVans("�̽�Ÿ��", 54, 65, 76)};
		
		for (DyCar dyCar : arr) 
		{
			dyCar.rank(arr);
		}
		
		for (DyCar dyCar : arr) 
		{
			dyCar.print();
		}
	}
}
