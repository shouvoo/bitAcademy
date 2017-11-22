package homeWork_20170814;

interface Attack
{
	void attack(String target1, String target2);
}

interface Boarding
{
	void boarding(String value1, String value2);
}

interface Work
{
	void work(String target, String workType, int value);
}

interface Repair
{
	void repair(String target, int value);
}

interface Move
{
	void move(String value);
}

interface Damage
{
	void damage(String target);
}

interface Build
{
	void build(String value);
}

interface UnitBaseInterface extends Attack, Damage, Move, Boarding
{
}


interface ScvInterface extends Work, Repair, Build
{	
}


class AttackInterface implements UnitBaseInterface
{	
	public void attack(String target1, String target2)
	{
		System.out.println("#############################################");
		System.out.println(target1 + "  " + target2 + " 을(를)  공격합니다");
		System.out.println("#############################################");
	}
	
	public void damage(String target)
	{
		System.out.println("#############################################");
		System.out.println(target + " 공격 받았습니다");
		System.out.println("#############################################");
	}
	
	public void move(String value)
	{
		System.out.println("#############################################");
		System.out.println(value + " 이동합니다");
		System.out.println("#############################################");
	}
	
	public void boarding(String value1, String value2)
	{
		System.out.println("#############################################");
		System.out.println(value1 + "  " + value2 + "  에 탑승합니다");
		System.out.println("#############################################");
	}
}

class WorkInterface extends AttackInterface implements ScvInterface
{
	public void work(String target, String workType, int value) 
	{
		System.out.println(target + " : " + workType + " : " + value + " 캡니다");
	}
	
	public void repair(String target, int value) 
	{
		System.out.println("#############################################");
		System.out.println(target + " 을 " + value +  "%  수리합니다");
		System.out.println("#############################################");
	}

	public void build(String value) 
	{
		System.out.println("#############################################");
		System.out.println(value);
		System.out.println("#############################################");
	}
}

class Tank extends AttackInterface
{	
}

class Zerg extends Tank
{
	
}

class Scv extends WorkInterface
{
	private String name;
	private int mineral = 0;
	
	public Scv(int value) 
	{
		this.name = "scv" + value + "호기";
		// TODO Auto-generated constructor stub
	}

	public int getMineral() 
	{
		return mineral;
	}

	public void setMineral(int mineral) 
	{
		this.mineral += mineral;
	}
	
	public String getName() 
	{
		return name;
	}

	void print()
	{
		System.out.println(name + " 누적미네랄 : " + mineral);
	}
		
}

class CommentCenter
{
	private String name;
	private int mineral = 0;
	public CommentCenter(String name) 
	{
		this.name = name;
	}
	public int getMineral() 
	{
		return mineral;
	}
	public void setMineral(int mineral) 
	{
		this.mineral += mineral;
	}
	public String getName() 
	{
		return name;
	}	
	
	public void print()
	{
		System.out.println(name + "  총 미네랄 :  " + mineral);
	}
}

class Gas
{	
	private String name = "가스기지";
	private int gas = 0;
	public Gas() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("#############################################");
		System.out.println("############### 가스 생성 ######");
		System.out.println("#############################################");
	}
	
	public int getGas() 
	{
		return gas;
	}

	public void setGas(int gas)
	{
		this.gas += gas;
	}

	public void print()
	{
		System.out.println(name + "  총 가스 :  " + gas);
	}
}

interface StarPort
{
	void makeStarPort();
}

interface Factory
{
	void makeFactory();
}

class BuildingMaker implements StarPort, Factory
{
	public BuildingMaker() 
	{
		// TODO Auto-generated constructor stub
	}

	public void makeFactory()
	{
		System.out.println("#############################################");
		System.out.println("###############  팩토리를 생성합니다");
		System.out.println("#############################################");
	}

	public void makeStarPort() 
	{
		System.out.println("#############################################");
		System.out.println("###############  스타포트를 생성합니다");
		System.out.println("#############################################");
	}
}

class GamePlay
{
	private Scv [] scvArr;
	private CommentCenter [] cc = new CommentCenter[1];
	private Gas gas;
	private int scvControl = 0;
	private Zerg [] zerg;
	
	private boolean gasBuildBln = false; 
	private boolean starportBln = false; 
	private boolean factoryBln = false; 
	private int commendCnt = 0;
	
	
	public GamePlay() 
	{
		scvArr = new Scv [] {new Scv(1), new Scv(2), new Scv(3), new Scv(4)}; 
		cc[0] = new CommentCenter("본진 커멘트 센터");
		loopPlay(0);
	}
	
	private void loopPlay(int cnt)
	{
		workScv();
		makeGas();
		makeComment();
		if(!starportBln) makeStarPort();
		if(!factoryBln) makeFactory();
		
		
		
		if(cnt > 80) 
		{
			for (int i = 0; i < scvArr.length - 1; i++) 
			{
				scvArr[i].boarding(scvArr[i].getName(), "탱크");
			}
			makeZerg();
			scvArr[3].repair("탱크1", 80);
			scvArr[3].repair("탱크2", 100);
			return;		
		}
		loopPlay(++cnt);
	}
	
	private void makeGas()
	{
		if(cc[0].getMineral() > 100 && !gasBuildBln)
		{
			scvControl = 1;
			scvArr[0].build(scvArr[0].getName() + "  가스기지를 짓습니다!!");
			gasBuildBln = true;
			gas = new Gas();
			cc[0].setMineral(-100);
		}
	}
	
	private void makeComment()
	{
		if(cc[0].getMineral() > 500 && commendCnt != 2)
		{
			System.out.println("#############################################");
			scvArr[commendCnt].move("##################  " + scvArr[commendCnt].getName() + "   앞마당으로 이동");
			scvArr[commendCnt].build("##################  " + scvArr[commendCnt].getName() + "  커맨트센터를 짓습니다!!");
			System.out.println("#############################################");
			cc[0].setMineral(-500);		
			commendCnt++;
		}
	}
	
	private void makeStarPort()
	{
		if(cc[0].getMineral() > 150 && gas.getGas() > 100 && commendCnt == 2)
		{
			starportBln = true;
			BuildingMaker bm = new BuildingMaker();
			StarPort sp = bm;
			sp.makeStarPort();
			cc[0].setMineral(-150);
			gas.setGas(-100);
			scvArr[0].repair("스타포트", 50);
		}
	}
	
	private void makeFactory()
	{
		if(cc[0].getMineral() > 200 && gas.getGas() > 100 && commendCnt == 2)
		{
			factoryBln = true;
			BuildingMaker bm = new BuildingMaker();
			Factory ft = bm;
			ft.makeFactory();
			cc[0].setMineral(-200);
			gas.setGas(-100);
		}
	}
	
	private void makeZerg()
	{
		zerg = new Zerg[5];
		for (int i = 0; i < zerg.length; i++) 
		{
			zerg[i] = new Zerg();
			zerg[i].attack("저글링이" + (i + 1), "탱크");
		}
		
	}
	
	private void workScv()
	{
		for (int i = 0; i < scvArr.length; i++) 
		{
			if(gasBuildBln && i < scvControl)
			{
				scvArr[i].work(scvArr[i].getName(), "가스", 8);
				gas.setGas(8);
				gas.print();
			} else 
			{
				scvArr[i].work(scvArr[i].getName(), "미네랄", 8);
				scvArr[i].setMineral(8);
				scvArr[i].print();
				cc[0].setMineral(8);
				cc[0].print();
			}
		}
	}
}



public class StartCraft 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GamePlay gp = new GamePlay();
	}

}
