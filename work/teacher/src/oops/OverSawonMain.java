package oops;
//총무부 - 사원명, 사원번호, 연봉
//웹부 - 사원명, 사원번호,연봉, 특기
//영업부 - 사원명, 사원번호, 실적건수
class OverSawon{
	String busae, name, sabun, spec;
	String etc="";
	double money;
	int cnt;
	
	void sawon(String name, String sabun)
	{
		this.name = name;
		this.sabun = sabun;
	}
	
	void sawon(String name, String sabun, double money)
	{
		sawon(name, sabun);
		this.busae = "총무부";
		this.money = money;
		etc=""+money;
	}
	
	void sawon(String name, String sabun, String spec)
	{
		sawon(name, sabun);
		this.busae = "웹부";
		this.spec = spec;
		etc=spec;
	}
	
	void sawon(String name, String sabun, int cnt)
	{
		sawon(name, sabun);
		this.busae = "영업부";
		this.cnt = cnt;
		etc=""+cnt;
	}
	
	
	void print()
	{
		String res = busae+"\t"+
					name+"\t"+
					sabun+"\t"+
					etc;
		System.out.println(res);
	}
	
}

class Sawons
{
	OverSawon sw(String name, String sabun, double money)
	{
		OverSawon res = new OverSawon();
		res.sawon(name, sabun, money);
		return res;
	}
	
	OverSawon sw(String name, String sabun, String spec)
	{
		OverSawon res = new OverSawon();
		res.sawon(name, sabun, spec);
		return res;
	}
	
	OverSawon sw(String name, String sabun, int cnt)
	{
		OverSawon res = new OverSawon();
		res.sawon(name, sabun, cnt);
		return res;
	}
	
	
}
public class OverSawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*OverSawon os = new OverSawon();
		
		os.sawon("강백호", "bs10", 2.4);
		os.print();
		os.sawon("채치수", "bs04", 10);
		os.print();*/
		
		Sawons sss = new Sawons();
		
/*		OverSawon os1 = sss.sw("강백호", "bs10", 2.4);
		OverSawon os2 = sss.sw("채치수", "bs04", 10);
		
		os1.print();
		os2.print();*/
		
		OverSawon [] arr = {
				sss.sw("강백호", "bs10", 2.4),
				sss.sw("채치수", "bs04", 10)
				};
		
		for (OverSawon os : arr) {
			os.print();
		}
	}

}
