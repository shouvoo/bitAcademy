package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Object [] arr = {10, 3, 15, 20, 10, 3, 21, 21, '3', "3", 123};
		Set s1 = new HashSet();
		
		for (Object obj : arr) 
		{
			s1.add(obj);
		}
		System.out.println(s1);
		
		for (Object object : s1) 
		{
			System.out.println(object);
		}
		
		System.out.println(s1.size());
		System.out.println(s1.contains(3));
		s1.remove('3');
		System.out.println(s1);
		
		System.out.println("-----------------------------------------------------");
		List lotto1 = new ArrayList();
		Set lotto2 = new HashSet();
		
		while(true)
		{
			lotto1.add((int)(Math.random() * 45) + 1);
			
			if(lotto1.size() == 7) break;
		}
		
		while(true)
		{
			lotto2.add((int)(Math.random() * 45) + 1);
			
			if(lotto2.size() == 7) break;
		}
		Collections.sort(lotto1);
		//Collections.sort(lotto2);
		System.out.println(lotto1);
		System.out.println(lotto2);
		
		
		
		
		
		Set bingo = new HashSet();
		
		
		while(true)
		{
			bingo.add((int)(Math.random() * 100) + 1);
			
			if(bingo.size() == 25)
			{
				break;
			}
		}
		
		Iterator it = bingo.iterator();		
		
		int i = 0;
		while(it.hasNext())
		{
			System.out.print(it.next() + "\t");
			i++;
			if(i % 5 == 0)
			{
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
