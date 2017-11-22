package homeWork_20170906;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

/*1. TreeMap ������ Comparable �� �ڵ������� �ȵǴ°ǰ���? (Ȥ ����Ʈ �����϶��� ������ �Ǵ°ǰ���?)
2. Comparator ���� V ������ ���ؼ� ������ �Ҽ��� ���°ǰ���?*/

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
		return "ĳ���� : \t" + character + "\t ��� : " + level + " "
				+ "\t��ġ : " + value + " " + "\t �� : " + frequency;
	}
	
	public void print()
	{
		System.out.println("ĳ���� : \t" + character + "\t ��� : " + level + " "+ "\t��ġ : " + value + " " + "\t �� : " + frequency);
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
		������ ���� ����
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
		Unit [] unitArr = {	new Unit("���", 60, 70, 90),
							new Unit("����", 55, 45, 95),
							new Unit("���۸�", 30, 30, 80),
							new Unit("�޵�", 1, 60, 70),
							new Unit("���÷�", 100, 90, 40),
							new Unit("��Ŀ", 100, 70, 45)};
		
		
		
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
			 *	Collections.sort(list); ������ Ÿ���� ����Ʈ�϶���
			*	compareTo �ܺ� ������ �ǹ̰� ����
			*/
			
			
			System.out.println(unitMap.get(key));
		}		

	}

}

