package di.test06;

public class Menu 
{
	public Menu()
	{
		System.out.println("Menu 기본 생성자");
	}
	
	private String desc;
	public void setDesc(String desc)
	{
		this.desc = desc;
		System.out.println("setDesc 문자열 생성자  : " + desc);
	}
	
	public void printDesc()
	{
		System.out.println("desc : " + desc);
	}
	
	private ISand sand;
	public void setSand(ISand sand)
	{
		this.sand = sand;
		System.out.println("setSand");
	}
	
	public void printInfo()
	{
		sand.info();
	}
	
}
