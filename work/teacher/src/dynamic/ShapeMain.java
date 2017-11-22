package dynamic;

class Shape{
	String name;
	double border, area;
	void print()
	{
		System.out.println(name+"의 넓이:"+area);
		System.out.println(name+"의 둘레:"+border);
	}
}

class Rec extends Shape{
	public Rec(int x, int y) {
		
		name ="사각형";
		area = x*y;
		border = (x+y)*2;
		print();
	}
}

class Cir extends Shape{
	public Cir(int r) {
		double pi = 3.141592;
		name ="원";
		area = pi*r*r;
		border = pi*r*2;
		print();
	}
}

class Tri extends Shape{
	public Tri(int x, int y, int z) {
		
		name ="삼각형";
		area = x*y/2;
		border = x+y+z;
		print();
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Rec(5,6);
		new Cir(5);
		new Tri(4,5,6);
	}

}
