package pac.abroad;

public class Mic {

	String name;
	String func;
	
	public Mic(String name, String func) {
		super();
		this.name = name;
		this.func = func;
	}

	public String call(String target)
	{
		return name+"."+func+"���� "+target+"�� ��ȭ�ؿ�";
	}
	
	public String str()
	{
		return name+"["+func+"]";
	}
}
