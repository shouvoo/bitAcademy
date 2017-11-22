package oops;

class ConstShape
{
	String name;
	double area, border;
	
	ConstShape(int x, int y)
	{
		name = "사각형";
		area = x * y;
		border = (x + y) * 2;
	}
	
	ConstShape(int r)
	{
		double pi = 3.141590;
		name = "원";
		area = pi * r * r;
		border = pi * r * 2;
		//print();
	}
	
	ConstShape(int x, int y, int z)
	{
		name = "삼각형";
		area = x * y / 2;
		border = x + y + z;
	}
	
	void print()
	{
		System.out.println(name + " 의 넓이 : " + area );
		System.out.println(name + " 의 둘레 : " + border);
	}
}

public class ConstructorShapeMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*ConstShape cs1 = new ConstShape(5, 5);
		ConstShape cs2 = new ConstShape(5, 5, 5);
		ConstShape cs3 = new ConstShape(10);*/
		
		/*cs1.print();
		cs2.print();
		cs3.print();*/
		ConstShape [] arr = {new ConstShape(5),
							new ConstShape(5, 6),
							new ConstShape(4, 5, 6),
							new ConstShape(10),
							new ConstShape(7, 8)};
		
		for (ConstShape cs : arr) 
		{
			cs.print();
		}
	}

}
