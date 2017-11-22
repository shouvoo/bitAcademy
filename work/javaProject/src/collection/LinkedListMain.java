package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain 
{

	static void add1(String name, List list)
	{
		long tt = System.currentTimeMillis();
		for (int i = 0; i < 2000000; i++) 
		{
			list.add(i);
		}
		
		System.out.println(name + " 순차추가 : " + (System.currentTimeMillis() - tt) );
	}
	
	static void add2(String name, List list)
	{
		long tt = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) 
		{
			list.add(500, i);
		}
		
		System.out.println(name + " 비순차추가 : " + (System.currentTimeMillis() - tt) );
	}
	
	static void remove1(String name, List list)
	{
		long tt = System.currentTimeMillis();
		
		for (int i = list.size() - 1; i >= 0 ; i--) 
		{
			list.remove(i);
		}
		
		System.out.println(name + " 순차삭제 : " + (System.currentTimeMillis() - tt) );
	}
	
	static void remove2(String name, List list)
	{
		long tt = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) 
		{
			list.remove(500);
		}
		
		System.out.println(name + " 비순차삭제 : " + (System.currentTimeMillis() - tt) );
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List ar = new ArrayList();
		List lk = new LinkedList();
		
		add1("ar", ar);
		add1("lk", lk);
		
		add2("ar", ar);
		add2("lk", lk);
		
		remove2("ar", ar);
		remove2("lk", lk);
		
		remove1("ar", ar);
		remove1("lk", lk);		
	}

}
