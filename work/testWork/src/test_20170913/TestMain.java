package test_20170913;

import java.util.ArrayList;

class Test
{
	int a = 10;
	int b = 20;
}

public class TestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Test> te = new ArrayList<>();
		te.add(new Test());
		System.out.println(te.get(0).a);
		
		ArrayList<ArrayList<Test>> b = new ArrayList<>();
		b.add(te);
		
		System.out.println(b.get(0).get(0).b);
 	}

}
