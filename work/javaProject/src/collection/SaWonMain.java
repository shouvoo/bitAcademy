package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class SaWon implements Comparable
{
	String name, type;
	int code, rank = 0;
	public SaWon(String name, String type, int code) 
	{
		super();
		this.name = name;
		this.type = type;
		this.code = code;
	}
	
	@Override
	public int compareTo(Object o) 
	{
		System.out.println("!!! "+ o);
		Comparable c1 = (Comparable)rank;  
		Comparable c2 = (Comparable)((SaWon)o).rank;
		
		return c1.compareTo(c2);
	}

	@Override
	public String toString() {
		return "SaWon [name=" + name + ", type=" + type + ", code=" + code + ", rank=" + rank + "]";
	}
	
	
}



public class SaWonMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SaWon [] swArr = {	new SaWon("�귡��", "����", 3),
							new SaWon("�귡���", "����", 31),
							new SaWon("��Ʈ", "����", 2),
						    new SaWon("������ũ", "���", 6),
						    new SaWon("����", "���", 53),
						    new SaWon("��ũ", "���", 43),
						    new SaWon("�˸�", "�븮", 4),
						    new SaWon("Ÿ�̽�", "����", 5),
						    new SaWon("��", "����", 1) };
		
		Map totalMap = new TreeMap();
		int cnt = 0;
		int rank = 10000;
		for (SaWon sw : swArr) 
		{
			String type = sw.type;
			Map swMap = null;

			if(totalMap.containsKey(type))
			{
				
				swMap = (TreeMap)totalMap.get(type);
			} else
			{
				cnt = 0;
				swMap = new TreeMap();
				totalMap.put(type, swMap);
			}
			
			if(swMap.containsKey(type))
			{
				swMap.put(type + (cnt++), sw);
			}
			
			if(type == "����") sw.rank = 100;
			else if(type == "����") sw.rank  = 99;
			else if(type == "����") sw.rank  = 98;
			else if(type == "�븮") sw.rank  = 97;
			else if(type == "����") sw.rank  = 96;
			else if(type == "���") sw.rank  = 95;
			
			swMap.put(type, sw);
		}

		Iterator it = totalMap.keySet().iterator();
		while(it.hasNext())
		{
			Object key = it.next();			
			TreeMap swMap = (TreeMap)totalMap.get(key);
			
			Iterator sit = swMap.keySet().iterator();
			while(sit.hasNext())
			{
				Object key1 = sit.next();
				//System.out.println(key1 + " : " + swMap.get(key1));
				System.out.println(swMap.toString());
			}
			
		}
		
		
		
		
		
		
		
		/*Map swMap = new TreeMap();
		
		for (SaWon sw : swArr) 
		{
			swMap.put(sw.code, sw);
		}
		
		Iterator it = swMap.keySet().iterator();
		
		while(it.hasNext())
		{
			Object key = it.next();
			
			
			System.out.println(key + " : " + swMap.get(key));
		}*/
		
		
		

	}

}
