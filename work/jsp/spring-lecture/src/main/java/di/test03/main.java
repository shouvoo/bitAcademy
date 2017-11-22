package di.test03;

interface TV
{
	void powerOn();
	void powerOff();
}

class LgTV implements TV
{
	public void powerOn() { System.out.println("lg 전원켰다"); }
	public void powerOff() { System.out.println("lg 전원끄다"); }
}

class SonyTV implements TV
{
	public void powerOn() { System.out.println("sony 전원켰다"); }
	public void powerOff() { System.out.println("sony 전원끄다"); }
}

class SonySmartTV extends SonyTV
{
	public void internet() { System.out.println("SonySmartTV 인터넷 하기"); }
}

public class main 
{
	public static void setTV(TV tv)
	{
		tv.powerOn();
		tv.powerOff();
	}
	
	public main(String[] args) 
	{
		setTV(TVFactory.getBean("sony"));
		setTV(TVFactory.getBean("lg"));
	}
}