package test_20170915;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

class TestCom implements Comparable<TestCom>
{
	String str;
	public TestCom(String str) 
	{
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	
	@Override
	public int compareTo(TestCom o) 
	{
		// TODO Auto-generated method stub
		System.out.println("aaa");
		return str.compareTo(o.str);
	}
}

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//LinkedHashSet<TestCom> ts = new LinkedHashSet<>();
		TreeSet<TestCom> ts = new TreeSet<>();
		ts.add(new TestCom("�϶�"));
		ts.add(new TestCom("����"));
		ts.add(new TestCom("�ٶ�"));
		ts.add(new TestCom("�Ķ�"));
		ts.add(new TestCom("���"));

		Iterator<TestCom> it = ts.iterator();
		
		while(it.hasNext())
		{
			TestCom s = it.next();
			System.out.println(s.str);
		}

	}

}
