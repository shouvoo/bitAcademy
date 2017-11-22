package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable
{
	String name;
	int [] jum;
	int sum, avg, ban;
	
	@Override
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		Stud you = (Stud)o;
		
		//System.out.println(ban +"  :  "+ you.ban);
		
		/*int res = ban - you.ban;
		if(res == 0) res = you.avg  - avg;*/
		int nameRank = name.compareTo(you.name);//반대 정열을 원할때는 곱하기-1 //(int)(char)you.name.charAt(0) - (int)(char)name.charAt(0);
		int rank = (ban == you.ban) ? you.avg - avg : (ban == you.ban) ? nameRank : ban - you.ban;
		return rank;
	}
	
	
	public Stud(String name, int kor, int eng, int mat, int ban) 
	{
		super();
		this.name = name;
		this.ban = ban;
		this.jum = new int [] {kor, eng, mat};
		cal();
	}
	
	void cal()
	{
		sum = 0;
		for (int i : jum) 
		{
			sum += i;
		}
		avg = sum / jum.length;
		String str = "";
	}
	
	@Override
	public String toString() {
		return name + "=" + Arrays.toString(jum) + ", sum=" + sum + ", avg=" + avg + ", ban=" + ban;
	}
	
	
}

public class ListSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Object [] arr = {10, 2, 50, 2, 4, 100, 97, 65};
		List arr1 = new ArrayList();
		
		
		for (Object obj : arr) 
		{
			arr1.add(obj);
		}
		
		System.out.println(arr1);
		Collections.sort(arr1);
		System.out.println(arr1);
		
		Collections.shuffle(arr1);
		System.out.println(arr1);
		
		Collections.swap(arr1, 1, 5);
		System.out.println(arr1);
		
		Collections.reverse(arr1);
		System.out.println(arr1);
		
		System.out.println("---------------------------------------------------------");
		List arr2 = new ArrayList();
		
		arr2.add(new Stud("모모", 73, 83, 53, 2));
		arr2.add(new Stud("나연", 90, 90, 51, 2));
		arr2.add(new Stud("정현", 90, 89, 40, 3));
		arr2.add(new Stud("사나", 70, 88, 80, 1));
		arr2.add(new Stud("쯔이", 70, 88, 80, 1));
		
		print(arr2);
		Collections.sort(arr2);
		print(arr2);
	}
	
	static void print(List list)
	{
		System.out.println("-----------------------------------------");
		for (Object obj : list) 
		{
			System.out.println(obj);
		}
	}

}

























