package adder;

public class Dog 
{
	public static String msg = "클래스 변수";
	static 
	{
		System.out.println("클래스 정보 로딩...");
	}
	
	public Dog()
	{
		System.out.println("생성자 호출!!");
	}
}
