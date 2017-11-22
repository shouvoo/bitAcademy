package net.json;

import java.util.ArrayList;
import java.util.List;

public class Member 
{
	private String name;
	private int age;
	private String id;
	private String pass;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	private List<String> hobbys;


	public List<String> getHobbys() 
	{
		return hobbys;
	}
	public void setHobbys(List<String> hobbys)
	{
		this.hobbys = hobbys;
	}
	
	private Address addr;


	public Address getAddr() 
	{
		return addr;
	}
	
	public void setAddr(Address addr) 
	{
		this.addr = addr;
	}
	
	
	
	
}
