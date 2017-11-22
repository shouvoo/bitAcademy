package collection_p;

import java.util.ArrayList;
import java.util.List;

public class StoveLeague {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] arr= {
				{"박재상","박정권","최정","김광현","엄정욱","박희수","이호준"},
				{"이호준","엄정욱","박재홍","이신협","장동건"},
				{"이병규","이승엽","박정권","장동건","박용택","홍성흔"}
			};
		
		List total = new ArrayList();
		
		for (String [] strs : arr) {
			List bb = new ArrayList();
			for (String str: strs) {
				bb.add(str);
			}
			total.add(bb);
			
		}
		
		/*for (Object obj : total) {
			System.out.println(obj);
		}*/
		
		List t1 = (List)total.get(0);
		List t2 = (List)total.get(1);
		List fa = (List)total.get(2);
		List subfa = new ArrayList(fa);
		
		System.out.println("변경전:");
		System.out.println("team1:"+t1);
		System.out.println("team2:"+t2);
		System.out.println("FA:"+fa);
		
		
		subfa.removeAll(t1);
		subfa.removeAll(t2);
		t1.removeAll(t2);
		t1.removeAll(fa);
		t2.removeAll(fa);
		
		System.out.println("변경후:");
		System.out.println("team1:"+t1);
		System.out.println("team2:"+t2);
		System.out.println("FA:"+subfa);
		
		
	}

}
