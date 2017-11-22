package pac.abroad;

public class Battery {

	String name;
	int bomb;
	
	public Battery(String name, int bomb) {
		super();
		this.name = name;
		this.bomb = bomb;
	}

	public String bombing()
	{
		return name+"은 "+bomb+" 만큼 터져요";
	}
	
	public String str()
	{
		return name+"["+bomb+"]";
	}
}
