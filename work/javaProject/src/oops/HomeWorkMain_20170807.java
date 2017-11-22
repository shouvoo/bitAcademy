package oops;

class HomeWork_20170807
{
	/*String [] parts;
	String [] finished = {"태블릿", "노트북", "데스크탑"};
	
	void init(String [] res)
	{
		this.parts = res;
	}
	
	void print()
	{
		String res = finished[this.parts.length - 1];
		System.out.println(res);
	}*/
	
	String [] finished = {"태블릿", "노트북", "데스크탑"};
	String [][] parts;
	
	void init(String [][] res)
	{
		this.parts = res;
	}
	
	void print()
	{
		String res = finished[this.parts.length - 1] + "\t";
		
		for (String [] parts : this.parts) 
		{
			for (String p : parts) 
			{
				res += p + "\t";
			}
		}
		
		System.out.println(res);
	}
}

class HomeWorks_20170807
{	
	/*HomeWork_20170807 init(String [] res)
	{
		HomeWork_20170807 hw = new HomeWork_20170807();
		hw.parts = res;
		return hw;
	}*/
	
	HomeWork_20170807 init(String [][] res)
	{
		HomeWork_20170807 hw = new HomeWork_20170807();
		hw.parts = res;
		return hw;
	}
}

public class HomeWorkMain_20170807 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub.
		/*컴퓨터를 조립하세요

		태블릿 - 본체
		노트북 - 본체, 마우스
		데스크탑 - 본체, 마우스, 키보드

		컴퓨터를 조립하세요
		태블릿 - 본체(이름, 가격)
		노트북 - 본체(이름, 가격), 마우스(이름, 가격)
		데스크탑 - 본체(이름, 가격), 마우스(이름, 가격), 키보드(이름, 가격)
		컴퓨터 - 제품명, 가격, 부품 등에 대한정보가 보일것
*/
		/*HomeWorks_20170807 hws = new HomeWorks_20170807();
		HomeWork_20170807 [] hw = {hws.init(new String [] {"본체"}),
									 hws.init(new String [] {"본체", "마우스"}),
									 hws.init(new String [] {"본체", "마우스", "키보드"})};
		
		for (HomeWork_20170807 homeWork : hw) 
		{
			homeWork.print();
		}*/
		
		String [][][] parts = {{{"iPad", "980,000"}},
								{{"lgNodteBook", "1,870,000"},{"iRock", "13,000"}}, 
								{{"tower", "1,300,000"}, {"samsungMouse", "6,000"}, {"iRock", "13,000"}}};
		HomeWorks_20170807 hws = new HomeWorks_20170807();
		HomeWork_20170807 [] hw = {hws.init(parts[0]),
									 hws.init(parts[1]),
									 hws.init(parts[2])};
		
		for (HomeWork_20170807 homeWork : hw) 
		{
			homeWork.print();
		}
	}

}
