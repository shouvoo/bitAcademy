package oops;

class ReturnRectangle
{
	String name = "사각형";
	int area, border;
	
	void init(int x, int y)
	{
		area = area(x, y);
		border = border(x, y);
		//print();
	}
	
	int area(int x, int y)
	{
		return x * y;
	}
	
	int border(int x, int y)
	{
		return (x + y) * 2;
	}
	
	void print()
	{
		System.out.println(name + " 넓이  : " + area);
		System.out.println(name + " 둘레  : " + border);
	}
}

class ReturnTriangle
{
	String name = "삼각형";
	double area, border;
	int widthRank;
	int bandRank;
	double topWidth;
	double topBand;
	
	void init(double x, double y, double c)
	{
		area = this.area(x, y, c);
		border = this.border(x, y, c);
	}
	
	double area(double x, double y, double c)
	{
		return x * y * c; //삼각형의 넓이 구하는공식
		
	}
	
	double border(double x, double y, double c)
	{
		double hypotenuse = (x * 2) + (y * 2); //빗변구하는 공식
		return x + y  + hypotenuse;
	}
	
	void rankCal(ReturnTriangle [] arr)
	{
		widthRank = 0;
		bandRank = 0;
		for (ReturnTriangle you : arr) 
		{
			if(area <= you.area)
			{
				widthRank++;
				topWidth = area;
			}
			
			if(border <= you.border)
			{
				bandRank++;
				topBand = border;
			}
			
		}
		
		//if(widthRank == 1 || bandRank == 1) print();
		//print();
	}
	
	
	
	void print()
	{
		/*System.out.println(name + " 넓이  : " + area);
		System.out.println(name + " 둘레  : " + border);*/
		
		/*System.out.println(name + " 넓이순위  : " + widthRank);
		System.out.println(name + " 넓이최고  : " + topWidth);
		//System.out.println();
		System.out.println(name + " 둘레순위  : " + bandRank);
		System.out.println(name + " 둘레최고  : " + topBand);*/
		
		System.out.println(name + " 넓이순위  : " + widthRank);
		System.out.println(name + " 넓이최고  : " + topWidth);
		//System.out.println();
		System.out.println(name + " 둘레순위  : " + bandRank);
		System.out.println(name + " 둘레최고  : " + topBand);
	}
}

class ReturnTri
{
	String name = "삼각형";
	int area, border;
	int rank;
	
	void init(int x, int y, int c)
	{
		area = x * y / 2;
		border = (x + y) * 2;
		//print();
	}
	
	void print()
	{
		System.out.println(name + " 넓이  : " + area);
		System.out.println(name + " 둘레  : " + border);
	}
}

class ReturnCircle
{
	String name = "원";
	
	double pi = 3.141592;
	
	double circle(double r)
	{
		return (pi * r * r);
	}
	
	double border(double r)
	{
		return (pi* r * 2);
	}
}

class ReturnShape
{
	ReturnRectangle makeRec(int xx, int yy)
	{
		ReturnRectangle res = new ReturnRectangle();
		res.init(xx, yy);
		return res;
	}
	
	ReturnTriangle makeTriangle(double xx, double yy, double cc)
	{
		ReturnTriangle rt = new ReturnTriangle();
		rt.init(xx, yy, cc);
		return rt;
	}
	
	ReturnTri makeTri(int xx, int yy, int cc)
	{
		ReturnTri rt2 = new ReturnTri();
		rt2.init(xx, yy, cc);
		return rt2;
	}
	
	ReturnTri oneArea(ReturnTri [] rtArr)
	{
		/*ReturnTri rt2 = new ReturnTri();
		rt2.init(0, 0, 0);*/
		ReturnTri rt2 = rtArr[0];
		
		for (ReturnTri you : rtArr) 
		{
			if(rt2.area < you.area)
			{
				rt2 = you;
			}
		}
		
		return rt2;
	}
}

public class ReturnShapeMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReturnRectangle rr = new ReturnRectangle();
		/*System.out.println(rr.area(5, 6));
		System.out.println(rr.border(5, 6));*/
		//rr.init(5, 6);
		//rr.print();
		
		ReturnCircle rc = new ReturnCircle();
		//System.out.println(rc.circle(10));
		//System.out.println(rc.border(10));
		
		ReturnShape rs = new ReturnShape();
		//System.out.println(rs);
		
		//rr = rs.makeRec(7, 8);
		//rr.print();
		
		System.out.println("--------------------------------------");
		
		ReturnRectangle [] arr = { 	rs.makeRec(7, 8),
									rs.makeRec(8, 9),
									rs.makeRec(5, 9),
									rs.makeRec(9, 10),
									rs.makeRec(10, 11)};
		
		
		System.out.println("--------------------------------------");
		
		//ReturnTriangle rt = new ReturnTriangle();
		ReturnShape rs2 = new ReturnShape();
		ReturnTriangle [] rtArr = {	
									rs2.makeTriangle(12, 7, .5), 
									rs2.makeTriangle(14, 9, .5), 
									rs2.makeTriangle(16, 11, .5), 
									rs2.makeTriangle(18, 50, .5),
									rs2.makeTriangle(25, 60, .5)};
		
		for (ReturnTriangle me : rtArr) 
		{
			me.rankCal(rtArr);
		}
		
		System.out.println("--------------------------------------");
		
		ReturnShape rs3 = new ReturnShape();
		ReturnTri [] rtArr2 = {	
				rs3.makeTri(12, 7, 5), 
				rs3.makeTri(14, 9, 5), 
				rs3.makeTri(16, 11, 5), 
				rs3.makeTri(18, 50, 5),
				rs3.makeTri(25, 60, 5)};
		
		for (ReturnTri me : rtArr2) 
		{
			me.rank = 1;
			for (ReturnTri you : rtArr2) 
			{
				if(me.area < you.area)
				{
					me.rank++;
				}
			}
			
			if(me.rank == 1)
			{
				me.print();
			}
		}
		
		ReturnTri trArea = rs3.oneArea(rtArr2);
		trArea.print();
		
		
	}

}




























