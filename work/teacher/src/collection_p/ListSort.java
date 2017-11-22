package collection_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable{
	String name;
	
	int [] jum;
	
	int sum, avg, ban;
	
	@Override
	public int compareTo(Object o) {
		
		System.out.println(this+":"+o);
		
		Stud you = (Stud)o;
		// TODO Auto-generated method stub
		int res  = ban - you.ban;
		
		if(res==0)
			res  = you.avg-avg;
		
		if(res==0)
			res  = name.compareTo(you.name);
		
		return res;
	}

	public Stud(int ban,String name, int kor, int eng, int mat) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		cal();
	}
	
	void cal()
	{
		sum =0;
		
		for (int i : jum) {
			sum+=i;
		}
		avg = sum/jum.length;
	}

	@Override
	public String toString() {
		return ban+","+name + ", " + Arrays.toString(jum) + ", " + sum + ", " + avg;
	}
	
	
}


public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object [] arr = {10,2,50,2,4,100,97,65};
		List arr1 = new ArrayList();
		
		
		for (Object obj : arr) {
			arr1.add(obj);
		}
		
		System.out.println(arr1);
		
		Collections.sort(arr1);
		System.out.println(arr1);
		
		Collections.shuffle(arr1);
		System.out.println(arr1);
		
		Collections.swap(arr1,1,5);
		System.out.println(arr1);
		
		Collections.reverse(arr1);
		System.out.println(arr1);
		
		
		
		
		List arr2 = new ArrayList();
		
		arr2.add(new Stud(1,"쯔이", 77,78,75));
		arr2.add(new Stud(2,"모모", 67,68,65));
		arr2.add(new Stud(1,"나연", 87,88,85));
		arr2.add(new Stud(1,"정현", 77,78,75));
		arr2.add(new Stud(2,"사나", 97,98,95));
		
		print(arr2);
		System.out.println("-----------------------------");
		Collections.sort(arr2);
		
		print(arr2);
		
	}
	
	static void print(List list)
	{
		System.out.println("-----------------------------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}

}
