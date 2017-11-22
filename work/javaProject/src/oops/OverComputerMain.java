package oops;

class ComMain
{
	String name;
	int price;
	
	void init(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name + " : " + price;
	}
}

class Mouse
{
	String name;
	int price;
	
	void init(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name + " : " + price;
	}
}


class Keyboard
{
	String name;
	int price;
	
	void init(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name + " : " + price;
	}
}


class OverComputer
{
	String kind, ppStr;
	ComMain bon;
	Mouse mm;
	Keyboard kb;
	
	void zorip(ComMain bon)
	{
		kind = "태블릿";
		this.bon = bon;
		
		ppStr = bon.ppp();
	}
	
	void zorip(ComMain bon, Mouse mm)
	{
		kind = "노트북";
		this.bon = bon;
		this.mm = mm;
		
		ppStr = bon.ppp() + "" + mm.ppp();
	}
	
	void zorip(ComMain bon, Mouse mm, Keyboard kb)
	{
		kind = "데스크탑";
		this.bon = bon;
		this.mm = mm;
		this.kb = kb;
		
		ppStr = bon.ppp() + "" + mm.ppp() + "\t" + kb.ppp();
	}
	
	void print()
	{
		System.out.println(kind + "\t" + ppStr);
	}
}

class YongSan
{
	ComMain bonBuy(String name, int price)
	{
		ComMain res = new ComMain();
		res.init(name, price);
		return res;
	}
	
	Mouse mmBuy(String name, int price)
	{
		Mouse res = new Mouse();
		res.init(name, price);
		return res;
	}
	
	Keyboard kbBuy(String name, int price)
	{
		Keyboard res = new Keyboard();
		res.init(name, price);
		return res;
	}
	
	OverComputer comBuy(ComMain bon)
	{
		OverComputer res = new OverComputer();
		res.zorip(bon);
		return res;
	}
	
	OverComputer comBuy(ComMain bon, Mouse mm)
	{
		OverComputer res = new OverComputer();
		res.zorip(bon, mm);
		return res;
	}
	
	OverComputer comBuy(ComMain bon, Mouse mm, Keyboard kb)
	{
		OverComputer res = new OverComputer();
		res.zorip(bon, mm, kb);
		return res;
	}
}

public class OverComputerMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		YongSan ys = new YongSan();
		OverComputer [] arr = {ys.comBuy(ys.bonBuy("아이패드", 890000)),
				ys.comBuy(ys.bonBuy("lg152", 70), ys.mmBuy("로지택", 5)),
				ys.comBuy(ys.bonBuy("아이패드", 890000), ys.mmBuy("로지택", 5), ys.kbBuy("삼성", 3))};
		
		for (OverComputer oc : arr) 
		{
			oc.print();
		}
	}

}
