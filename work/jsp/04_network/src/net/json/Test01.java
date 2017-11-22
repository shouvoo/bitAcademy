package net.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test01 
{
	public static void main(String[] args) 
	{
		//test01(); // json 직접 만들어보기
		//test02(); // json 활용
		//test03(); // json list 활용 
		//test04(); // json class 활용 
		//test04(); // json class 활용 
		
		//json 문자열 -> 객체
		//test05();
	}

	public static void test05() 
	{
		String msg = "{\"name\":\"홍길동\",\"age\":33,\"hobbys\":[\"야구보기\",\"공차기\",\"영화보기\"],\"addr\":{\"postNo\":\"12345\",\"basic\":\"서울시 강남구\",\"detail\":\"한빛 교육센터\"}}";
		Member m = new Gson().fromJson(msg, Member.class);
		
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getHobbys());
	}
	
	public static void test04() 
	{
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(33);
		
		List<String> hobbys = new ArrayList<>();
		hobbys.add("야구보기");
		hobbys.add("공차기");
		hobbys.add("영화보기");
		m.setHobbys(hobbys);
		
		Address addr = new Address();
		addr.setPostNo("12345");
		addr.setBasic("서울시 강남구");
		addr.setDetail("한빛 교육센터");
		m.setAddr(addr);
		
		System.out.println(new Gson().toJson(m));
		
	}
	
	public static void test03() 
	{
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(33);
		
		List<String> hobbys = new ArrayList<>();
		hobbys.add("야구보기");
		hobbys.add("공차기");
		hobbys.add("영화보기");
		m.setHobbys(hobbys);
		
		System.out.println(new Gson().toJson(m));
		
	}
	
	public static void test02() 
	{
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(33);
		
		// 클래스의 데이터를 json 형태로 표시
		
		Gson gson = new Gson();
		String result = gson.toJson(m);
		
		/*String reslut = new Gson().toJson(m);
		 * 한줄로 줄이기*/
		
		/*System.out.println(new Gson().toJson(m));
		 * 확인만 한다면*/
		
	}
	
	public static void test01() 
	{
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(33);
		
		// 클래스의 데이터를 json 형태로 표시
		String result = "{\"name\": \"" + m.getName() + "\", \"age\":" +  m.getAge() + "}";
		System.out.println(result);
	}
}
