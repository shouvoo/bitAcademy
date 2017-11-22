package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;


class StudCom2 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		int res = 1;
		TreeStud2 me =null;
		TreeStud2 you =null;
		
		if(o1 instanceof String)
			me = new TreeStud2((String)o1, 100,100,100);
		if(o2 instanceof String)
			you = new TreeStud2((String)o2, 100,100,100);
		
		if(o1 instanceof TreeStud2)
			 me = (TreeStud2)o1;
		if(o2 instanceof TreeStud2)
			you = (TreeStud2)o2;
			
		res = you.avg-me.avg;
		
		if(res==0)
			res = me.name.compareTo(you.name);
		
		return res;
	}
}


//class TreeStud2 implements Comparable{

class TreeStud2{
	
	String name;
	int [] jum;
	int sum, avg;
	public TreeStud2(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.jum = new int[] {kor, eng, mat};
		
		cal();
	}
	
	
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	void cal()
	{
		
		sum =0;
		for (int i : jum) {
			sum += i;
		}
		avg = sum/jum.length;
	}

	@Override
	public String toString() {
		return  name + ", " + Arrays.toString(jum) + ", " + sum + ", " + avg;
	}
	
	
}
public class ExamTreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet data = new TreeSet(new  StudCom2());
		
		
		data.add(new TreeStud2("한차인",88,87,86));
		data.add(new TreeStud2("한나인",88,87,86));
		data.add("1반");
		data.add(new TreeStud2("한사인",78,77,76));
		data.add(new TreeStud2("한파인",98,97,96));
		data.add("2반");
		data.add(new TreeStud2("한다인",78,77,76));
		
		for (Object obj : data) {
			System.out.println(obj);
		}
		
		
	}

}

