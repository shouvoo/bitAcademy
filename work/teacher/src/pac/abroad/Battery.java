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
		return name+"�� "+bomb+" ��ŭ ������";
	}
	
	public String str()
	{
		return name+"["+bomb+"]";
	}
}
