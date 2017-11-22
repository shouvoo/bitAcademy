package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class StudCom implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		/*TreeStud me = (TreeStud)o1;
		TreeStud you = (TreeStud)o2;
		int res = you.avg - me.avg;
		if(res == 0) res = me.name.compareTo(you.name);*/
		
		int res = 1;
		TreeStud me = null;
		TreeStud you = null;
		
		if(o1 instanceof String)
			me = new TreeStud((String)o1, 100, 100, 100);
			
		if(o2 instanceof String)
			you = new TreeStud((String)o2, 100, 100, 100);
		
		if(o1 instanceof TreeStud)
			me = (TreeStud)o1;
		
		if(o2 instanceof TreeStud)
			you = (TreeStud)o2;

		res = you.avg - me.avg; 
		
		if(res==0)
			res = me.name.compareTo(you.name);
	
	
	/*else
		{
			me = (TreeStud)o1;
			you = (TreeStud)o2;
			res = you.avg - me.avg;
		}*/
		
		return res;
		
		
		/*String s1 = ((TreeStud)o1).name;
		String s2 = ((TreeStud)o2).name;
		
		int i1 = ((TreeStud)o1).avg;
		int i2 = ((TreeStud)o2).avg;
		
		int res = (i2 != i1) ? i2 - i1 : (s1 == s2) ? 1 : s1.compareTo(s2);
		return res;*/	
		
		
		//return s1.compareTo(s2);
	}
}



/*class TreeStud implements Comparable*/
class TreeStud
{
	int sum, avg;
	String name;
	int [] jum;
	public TreeStud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		
		cal();
		System.out.println(toString());
	}
	
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	void cal()
	{
		sum = 0; 
		for (int i : jum) 
		{
			sum += i;
		}
		
		avg = sum / jum.length;
	}
	
	@Override
	public String toString() 
	{
		return name + ", " + Arrays.toString(jum) + ", " + sum + ", " + avg;
	}
	
	
}

public class TreeStudMain 
{

	public static void main(String[] args)
	{
		//1평균, 2이름
		TreeSet data = new TreeSet(new StudCom());
		
		
		data.add(new TreeStud("한차인", 88, 87, 86 ));
		data.add(new TreeStud("한나인", 88, 87, 86 ));
		data.add(new TreeStud("한사인", 78, 77, 76 ));
		data.add("1반");
		data.add(new TreeStud("한파인", 98, 97, 96 ));
		data.add("2반");
		data.add(new TreeStud("한다인", 78, 77, 76 ));
		
		System.out.println("------------------------------");
		
		for (Object obj : data) 
		{
			System.out.println(obj);
		}
	}
	
}
