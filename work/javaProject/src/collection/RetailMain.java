package collection;

import java.util.ArrayList;
import java.util.List;

public class RetailMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*List topList = new ArrayList();
		
		topList.add("박재상");
		topList.add("박정권");
		topList.add("최정");
		topList.add("김광현");
		topList.add("엄정욱");
		topList.add("박희수");
		topList.add("이호준");
		
		List secondList = new ArrayList();
		
		secondList.add("이호준");
		secondList.add("엄정욱");
		secondList.add("박재홍");
		secondList.add("이신협");
		secondList.add("장동건");
		
		List thirdList = new ArrayList();
		
		thirdList.add("이병규");
		thirdList.add("이승엽");
		thirdList.add("박정권");
		thirdList.add("장동건");
		thirdList.add("박용택");
		thirdList.add("홍성흔");
		
		List rs = new ArrayList(topList);
		rs.addAll(secondList);
		
		System.out.println(topList);
		System.out.println("-----------------------------------------------------");
		System.out.println(secondList);
		System.out.println("-----------------------------------------------------");
		System.out.println(thirdList);
		System.out.println("-----------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("1군-----------------------------------------------------");
		topList.removeAll(secondList);
		topList.remove("박정권");
		System.out.println(topList);
		
		
		System.out.println("2군-----------------------------------------------------");
		secondList.removeAll(thirdList);
		System.out.println(secondList);
		
		
		System.out.println(rs);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("FA 가능-----------------------------------------------------");
		thirdList.removeAll(rs);
		System.out.println(thirdList);*/
		
		String [][] arr = {{"박재상", "박정권","최정","김광현","엄정욱","박희수","이호준"}, 
							{"이호준","엄정욱","박재홍","이신협","장동건"}, 
							{"이병규","이승엽","박정권","장동건","박용택","홍성흔"}};
		
		List total = new ArrayList();
		
		for (String[] strs : arr) 
		{
			List bb = new ArrayList();
			for (Object str : strs) 
			{
				bb.add(str);
			}
			total.add(bb);
		}
		
		/*for (Object obj : total) 
		{
			System.out.println(obj);
		}*/
		
		List t1 = (List)total.get(0);
		List t2 = (List)total.get(1);
		List fa = (List)total.get(2);
		List subfa = new ArrayList(fa);
		
		
		System.out.println("변경전 : ");
		System.out.println("team1 : " + t1);
		System.out.println("team2 : " + t2);
		System.out.println("FA : " + fa);
		
		subfa.removeAll(t1);
		subfa.removeAll(t2);
		t1.removeAll(t2);
		t1.removeAll(fa);
		t2.removeAll(fa);
		
		System.out.println("변경후 : ");
		System.out.println("team1 : " + t1);
		System.out.println("team2 : " + t2);
		System.out.println("FA : " + subfa);
		
	}

}















