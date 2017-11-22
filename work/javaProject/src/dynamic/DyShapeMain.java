package dynamic;

class DyShape
{
	String name;
	double area, border;
	
	public DyShape(String name) 
	{
		super();
		this.name = name;
	}
	
	void cal()
	{
		
	}
	void print()
	{
		cal();
		String res = name + "\t" + area + "\t" + border;
		System.out.println(res);
	}
}

class DyRec extends DyShape
{
	int x, y;

	public DyRec(int x, int y) 
	{
		super("사각형");
		this.x = x;
		this.y = y;
	}
	
	void cal()
	{
		area = x * y;
		border = (x + y) * 2;
	}

}

class DyCir extends DyShape
{
	int r;
	double pi = 3.144590;

	public DyCir(int r) 
	{
		super("원");
		this.r = r;
	}
	
	void cal()
	{
		area = pi * r * r;
		border = pi * r * 2;
	}

}

public class DyShapeMain 
{
	public static void main(String[] args) 
	{
		DyShape [] arr = { new DyRec(5, 6), new DyCir(5)};
		for (DyShape ds  : arr) 
		{
			ds.print();
		}
	}
}
