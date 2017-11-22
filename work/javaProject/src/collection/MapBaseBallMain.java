package collection;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class MapBaseBallMain
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] hit = {3, 4, 6, 8, 1, 3, 7, 8, 1, 3, 4, 7, 3, 6};
		Map mm = new TreeMap();
		for (int i : hit) 
		{
			int vv = 1;
			if(mm.containsKey(i))
				vv = (int)mm.get(i) + 1;
			mm.put(i , vv);
		}
		
		Iterator it = mm.keySet().iterator();
		
		while(it.hasNext())
		{
			Object key = it.next();
			System.out.println(key + " : " + mm.get(key));
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		String [] anta = {"h3", "h4", "a6", "a8", "a1", "h3", "a7", "a8", "h1", "h3", "a4", "a7", "h3", "a6"}; 
		Map homeTeam = new TreeMap();
		Map awayTeam = new TreeMap();
		
		for (String str : anta) 
		{
			int cnt = 1;
			if(str.indexOf("h") != -1) 
			{
				if(homeTeam.containsKey(str)) cnt++;
				homeTeam.put(str, cnt);
			}
			else 
			{
				if(awayTeam.containsKey(str)) cnt++;
				awayTeam.put(str, cnt++);
			}
		}
		
		Iterator hi = homeTeam.keySet().iterator();
		while(hi.hasNext())
		{
			Object key = hi.next();
			System.out.println(key + " : " + homeTeam.get(key));
		}
		System.out.println("-------------------------------");
		Iterator ai = awayTeam.keySet().iterator();
		while(ai.hasNext())
		{
			Object key = ai.next();
			System.out.println(key + " : " + awayTeam.get(key));
		}

		
		System.out.println("-------------------------------");

		
	}

}

















