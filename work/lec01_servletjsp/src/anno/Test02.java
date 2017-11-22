package anno;

public class Test02 
{
	@MySingle(value="a")
	@MySingle2(name="b")
	public void call()
	{
		
	}
	
	//속성명을 입력하지 않으면 value 속성에 설정
	@MySingle("a")
	//@MySingle2("b") // name 속성은 자동 찾지 못한다
	public void call2()
	{
		
	}
	
	
	@MySingle // 속성명이 default 설정되어있다면 가로생략
	@MySingle2(name="b")
	public void call3()
	{
		
	}
}
