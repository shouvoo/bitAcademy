package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class NumCom implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		int i1 = (int)o1;
		int i2 = (int)o2;
		return i2 - i1;
		//		return 1;
	}
}


public class LinkedHashSetMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Object [] arr = {10, 3, 15, 20, 10, 3, 21, 21, 123};
		
		Set s1 = new HashSet();
		Set s2 = new LinkedHashSet();
		TreeSet s3 = new TreeSet(new NumCom());
		
		for (Object obj : arr) 
		{
			s1.add(obj);
			s2.add(obj);
			s3.add(obj);
		}
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3.headSet(15));
		System.out.println(s3.tailSet(15));
		
	}

}
