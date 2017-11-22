package anno;

public class Test03 
{
	//@MyDouble(type="a", name="b", value="c")
	//@MyDouble(type="a", name="b", "c") // 에러발생
	//@MyDouble
	@MyDouble("abc")
	public void call()
	{
		
	}
}
