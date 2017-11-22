package oops;

class DragonMoney
{
	static int total = 100;
	int myMoney = 0;
	String name;
	
	public DragonMoney(String name) 
	{
		this.name = name;
	}

	void showMeTheMoney(int money)
	{
		if(name == "아빠") 
		{
			System.out.println("꺼져");
			return;
		}
		total -= money;
		myMoney += money;
		
		System.out.println(name + " : " + money + "(" + myMoney + ")");
		System.out.println("\t잔액" + total);
	}
	
	void missionComplete(int money)
	{
		if(name != "아빠") 
		{
			System.out.println("건강하게만 자라다오");
			return;
		}
		total += money;
		myMoney += money;
		
		System.out.println(name + " : " + money + "(" + myMoney + ")");
		System.out.println("\t잔액" + total);
	}
	
}

public class DragonMoneyMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DragonMoney son = new DragonMoney("아들");
		DragonMoney dau = new DragonMoney("딸");
		DragonMoney scv = new DragonMoney("아빠");
		son.showMeTheMoney(20);
		dau.showMeTheMoney(16);
		scv.showMeTheMoney(15);
		scv.missionComplete(50);
		dau.showMeTheMoney(17);
		son.showMeTheMoney(11);
		son.missionComplete(11);
		
		
	}

}
