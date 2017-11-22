package oops;
/// 컴퓨터를 조립하세요
// 태블릿 - 본체(이름,가격)
// 노트북 - 본체(이름,가격), 마우스(이름,가격)
// 데스크탑 - 본체(이름,가격), 마우스(이름,가격), 키보드(이름,가격)
///  컴퓨터 - 제품명, 가격 , 부품 등에 대한 정보가 보일 것
class ComMain
{
	String name;
	int price;
	
	void init(String name,	int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name+":"+price;
	}
}

class Mouse
{
	String name;
	int price;
	
	void init(String name,	int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name+":"+price;
	}
}

class Keyboard
{
	String name;
	int price;
	
	void init(String name,	int price)
	{
		this.name = name;
		this.price = price;
	}
	
	String ppp()
	{
		return name+":"+price;
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
		
		ppStr=bon.ppp();
	}
	
	void zorip(ComMain bon, Mouse mm)
	{
		kind = "노트북";
		this.bon = bon;
		this.mm = mm;
		ppStr=bon.ppp()+"\t"+mm.ppp();
	}
	
	
	void zorip(ComMain bon, Mouse mm, Keyboard kb)
	{
		kind = "데스크탑";
		this.bon = bon;
		this.mm = mm;
		this.kb = kb;
		ppStr=bon.ppp()+"\t"+mm.ppp()+"\t"+kb.ppp();
	}
	
	void print()
	{
		System.out.println(kind+"\t"+ppStr);
	}
	
}

class YongSan{
	ComMain bonBuy(String name,	int price)
	{
		ComMain res = new ComMain();
		res.init(name, price);
		return res;
	}
	
	Mouse mmBuy(String name,	int price)
	{
		Mouse res = new Mouse();
		res.init(name, price);
		return res;
	}
	
	Keyboard kbBuy(String name,	int price)
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
		res.zorip(bon,mm);
		
		return res;
	}
	
	
	OverComputer comBuy(ComMain bon, Mouse mm, Keyboard kb)
	{
		OverComputer res = new OverComputer();
		res.zorip(bon,mm,kb);
		
		return res;
	}
}

public class OverComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YongSan ys = new YongSan();
		OverComputer [] arr = {
				ys.comBuy(ys.bonBuy("아이패드", 89)),
				ys.comBuy(ys.bonBuy("lg152", 70), 
						ys.mmBuy("로지텍", 0)),
				ys.comBuy(ys.bonBuy("용산조립", 80),
						ys.mmBuy("로지텍", 4),
						ys.kbBuy("제닉스", 7)
						)
				
		};
		
		for (OverComputer oc : arr) {
			oc.print();
		}
		
	}

}
