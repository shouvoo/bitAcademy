package anno;

@MyRuntime(id="hong", msg="annotion") // runtime
@MyClass("class test")					// class
public class Apply 
{
	@MyRuntime(id="hong", msg="annotion") // runtime
	@MyClass2(value = "class test")					// class
	public void info()
	{
		
	}
	
	public void call()
	{
		
	}
}
