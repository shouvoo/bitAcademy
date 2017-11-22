package dynamic;

class DyShape{

	public DyShape(String name) {
		super();
		this.name = name;
	}
	String name;
	double area, border;
	
	void cal() {}
	void print() {
		cal();
		String res = name+"\t"+area+"\t"+border;
		
		System.out.println(res);
	}
}

class DyRec extends DyShape{
	
	int x, y;

	public DyRec(int x, int y) {
		super("사각형");
		this.x = x;
		this.y = y;
	}
	
	void cal() {
		
		area = x*y;
		border = (x+y)*2;
	}	
}

class DyCir extends DyShape{
	
	int r;
	double pi = 3.141592;
	
	
	public DyCir( int r) {
		super("원");
		this.r = r;
	}



	void cal() {
		
		area = pi*r*r;
		border = pi*r*2;
	}	
}


public class DyShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DyShape [] arr = {
				new DyRec(5, 6),
				new DyCir(5)
		};
		
		for (DyShape  ds : arr) {
			ds.print();
		}
		
	}

}
