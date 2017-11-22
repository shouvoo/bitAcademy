package homeWork_20170906;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

/*1. TreeMap 에서의 Comparable 은 자동실행이 안되는건가요? (혹 리스트 형태일때만 실행이 되는건가요?)
2. Comparator 에서 V 값으로 비교해서 정렬을 할수는 없는건가요?*/

/*class Unit implements Comparable<Unit>*/
class Unit
{
	String character;
	int level, value, frequency;
	public Unit(String character, int level, int value, int frequency) 
	{
		super();
		this.character = character;
		this.level = level;
		this.value = value;
		this.frequency = frequency;
	}
	@Override
	public String toString() 
	{
		return "캐릭터 : \t" + character + "\t 등급 : " + level + " "
				+ "\t가치 : " + value + " " + "\t 빈도 : " + frequency;
	}
	
	public void print()
	{
		System.out.println("캐릭터 : \t" + character + "\t 등급 : " + level + " "+ "\t가치 : " + value + " " + "\t 빈도 : " + frequency);
	}
	
	/*@Override
	public int compareTo(Unit unit) 
	{
		// TODO Auto-generated method stub
		System.out.println(unit);
		Unit you = unit;
		int res = you.level-level;		
		return res;
	}*/

}

//class UnitCom implements Comparator<Unit>
class UnitCom implements Comparator<String>
{

	/*@Override
	public Unit compare(Unit o1, Unit o2) 
	{
		받을수 없음 에러
	}*/
	
	@Override
	public int compare(String o1, String o2) 
	{
		return o1.compareTo(o2);
	}	
}

class KeyClass
{
	String character;
	int level, value, frequency;
}

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Unit [] unitArr = {	new Unit("드라군", 60, 70, 90),
							new Unit("질럿", 55, 45, 95),
							new Unit("저글링", 30, 30, 80),
							new Unit("메딕", 1, 60, 70),
							new Unit("탬플러", 100, 90, 40),
							new Unit("럴커", 100, 70, 45)};
		
		
		
		TreeMap<String, Unit>unitMap = new TreeMap<String, Unit>(new UnitCom());
		
		for (Unit unit : unitArr) 
		{
			unitMap.put(unit.character, unit);
		}
		
		Iterator<String> unitIt = unitMap.keySet().iterator();
		
		while(unitIt.hasNext())
		{
			String key = unitIt.next();
			/*
			 * Unit unit = (Unit)unitMap.get(key);
			 *	unit.compareTo(unit);
			 *	Collections.sort(list); 데이터 타입이 리스트일때만
			*	compareTo 외부 실행은 의미가 없음
			*/
			
			
			System.out.println(unitMap.get(key));
		}		

	}

}

