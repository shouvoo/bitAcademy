package di.test07;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu 
{
	public Menu()
	{
		System.out.println("Menu 기본 생성자");
	}
	
	private List<ISand> sandList;
	public void setSandList(List<ISand> sandList)
	{
		this.sandList = sandList;
	}
	
	public void printList()
	{
		for(ISand sand : sandList)
		{
			sand.info();
		}
	}
	
	private Set<ISand> sandSet;
	public void setSandSet(Set<ISand> sandSet)
	{
		this.sandSet = sandSet;
	}
	
	public void printSet()
	{
		for(ISand sand : sandSet)
		{
			sand.info();
		}
	}
	
	private Map<String, ISand> sandMap;
	public void setSandMap(Map<String, ISand> sandMap)
	{
		this.sandMap = sandMap;
	}
	
	public void printMap()
	{
		for(String key : sandMap.keySet())
		{
			sandMap.get(key).info();
		}
	}
	
	private Properties sandProp;
	public void setSandProp(Properties sandProp)
	{
		this.sandProp = sandProp;
	}
	
	public void printProp()
	{
		for(Object key : sandProp.keySet())
		{
			System.out.println(sandProp.get(key));
		}
	}
}
