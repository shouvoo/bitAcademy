package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Object [] arr = {11,22,33,44,11,33,77,66,5,66};
		
		List ls = new ArrayList();
		Set s1 = new HashSet();
		
		for (Object obj : arr) 
		{
			ls.add(obj);
			s1.add(obj);
		}
		
		System.out.println(ls);
		System.out.println(s1);
		
		
		Iterator it = s1.iterator();
		
		int i = 0;
		while(it.hasNext())
		{
			if(i == 3)
			{
				break;
			}
			System.out.println(it.next());
			i++;
		}
		
		System.out.println("---------------------------------------");
		
		ListIterator lit = ls.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println();
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
