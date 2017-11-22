package di.test03;

public class TVFactory 
{
	public static TV getBean(String name)
	{
		switch(name)
		{
			case "sony" :
				return new SonySmartTV();
			case "lg" :
				return new LgTV();
		}
		
		return null;
	}
}