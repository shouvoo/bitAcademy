package arr;
class ReturnRectangle{
	
	String name="»ç°¢Çü";
	int area, border;
	
	void init(int x, int y)
	{
		area = area(x,y);
		border = border(x,y);
		print();
	}
	
	
	int area(int x, int y)
	{
		return x*y;
	}
	
	int border(int x, int y)
	{
		return (x+y)*2;
	}
	
	void print()
	{
		System.out.println(name+" ³ÐÀÌ:"+area);
		System.out.println(name+" µÑ·¹:"+border);
	}
}

class ReturnCircle{
	
	String name="¿ø";
	double pi = 3.141592;
	double area(int r)
	{
		return pi*r*r;
	}
	
	double border(int r)
	{
		return pi*r*2;
	}
}

class ReturnTri{
	String name="»ï°¢Çü";
	int area, border, rank;
	
	void init(int x, int y, int z)
	{
		area = x*y/2;
		border = x+y+z;
		//print();
	}
	
	void print()
	{
		System.out.println(name+" ³ÐÀÌ:"+area);
		System.out.println(name+" µÑ·¹:"+border);
	}
}

class ReturnShape{
	
	String name;
	
	ReturnRectangle makeRec(int xx, int yy)
	{
		ReturnRectangle res = new ReturnRectangle();
		res.init(xx, yy);
		return res;
	}
	
	ReturnTri makeTri(int xx, int yy, int zz)
	{
		ReturnTri res = new ReturnTri();
		res.init(xx, yy, zz);
		return res;
	}
	
	ReturnTri oneArea(ReturnTri [] ar)
	{
//		ReturnTri res = new ReturnTri();
//		res.init(0, 0, 0);
		ReturnTri res = ar[0];
		
		for (ReturnTri you : ar) {
			if(res.area < you.area)
				res = you;
		}
		
		return res;
	}
}


public class ReturnShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnRectangle rr = new ReturnRectangle();
		ReturnCircle rc = new ReturnCircle();
		/*System.out.println(rr.area(5,6));
		System.out.println(rr.border(5,6));*/
		
		rr.init(5,6);
		
		
		
		System.out.println(rc.area(5));
		System.out.println(rc.border(5));
		
		
		ReturnShape rs = new ReturnShape();
		
		rr = rs.makeRec(7,8);
		rr.print();
		
		System.out.println("---------------------");
		
		ReturnRectangle [] arr = {
				rs.makeRec(17,18),
				rs.makeRec(27,28),
				rs.makeRec(37,38),
				rs.makeRec(47,48)
		};
		System.out.println("---------------------");
		ReturnTri tr = rs.makeTri(3,4,5);
		tr.print();
		System.out.println("---------------------");
		
		ReturnTri [] arr2 = {
				rs.makeTri(13,14,15),
				rs.makeTri(33,34,35),
				rs.makeTri(43,44,45),
				rs.makeTri(23,24,25)
		};
		System.out.println("---------------------");
		for (ReturnTri me : arr2) {
			me.rank=1;
			for (ReturnTri you : arr2) {
				if(me.area<you.area)
					me.rank++;
			}
			
			if(me.rank==1)
				me.print();
		}
		
		
		
		System.out.println("---------------------");
		
		ReturnTri trArea= rs.oneArea(arr2);
		trArea.print();
	}

}
