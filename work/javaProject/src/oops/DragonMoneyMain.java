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
		if(name == "�ƺ�") 
		{
			System.out.println("����");
			return;
		}
		total -= money;
		myMoney += money;
		
		System.out.println(name + " : " + money + "(" + myMoney + ")");
		System.out.println("\t�ܾ�" + total);
	}
	
	void missionComplete(int money)
	{
		if(name != "�ƺ�") 
		{
			System.out.println("�ǰ��ϰԸ� �ڶ�ٿ�");
			return;
		}
		total += money;
		myMoney += money;
		
		System.out.println(name + " : " + money + "(" + myMoney + ")");
		System.out.println("\t�ܾ�" + total);
	}
	
}

public class DragonMoneyMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DragonMoney son = new DragonMoney("�Ƶ�");
		DragonMoney dau = new DragonMoney("��");
		DragonMoney scv = new DragonMoney("�ƺ�");
		son.showMeTheMoney(20);
		dau.showMeTheMoney(16);
		scv.showMeTheMoney(15);
		scv.missionComplete(50);
		dau.showMeTheMoney(17);
		son.showMeTheMoney(11);
		son.missionComplete(11);
		
		
	}

}
