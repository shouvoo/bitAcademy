package test_20170914;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		
		return res;

	}
}

class TreeStud implements Comparable<TreeStud>
{
	int sum, avg;
	String name;
	int [] jum;
	public TreeStud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		
		cal();
	}
	
	@Override
	public int compareTo(TreeStud o) {
		// TODO Auto-generated method stub
		TreeStud o2 = o;
		
		return name.compareTo(o2.name);
	}
	
	void cal()
	{
		sum = 0; 
		for (int i : jum) 
		{
			sum += i;
		}
		
		avg = sum / jum.length;
	}
	
	public String toString() 
	{
		return name + ", " + Arrays.toString(jum) + ", " + sum + ", " + avg;
	}
	
	
}


public class ComparatorTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//TreeSet data = new TreeSet(new StudCom());
		TreeSet data = new TreeSet();
		
		
		data.add(new TreeStud("한차인", 88, 87, 86 ));
		data.add(new TreeStud("한나인", 88, 87, 86 ));
		data.add(new TreeStud("한사인", 78, 77, 76 ));
		data.add(new TreeStud("한파인", 98, 97, 96 ));
		data.add(new TreeStud("한다인", 78, 77, 76 ));
		
		
		System.out.println("------------------------------");
		
		for (Object obj : data) 
		{
			System.out.println(obj);
		}
	}

}
