package di.quiz;

public class Animal 
{
	private String msg;
	
	public Animal()
	{
		System.out.println("Animal 생성자");
		
	}
	
	public void info()
	{
		System.out.println(msg);
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
