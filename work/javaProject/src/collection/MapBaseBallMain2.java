package collection;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

public class MapBaseBallMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] hit = {3,4,6,8,1,3,7,8,1,3,4,7,3,6};
		String [] arr = {"h22","h23","h11","a3","a7","a22","h23","a11","h5","a3","h8","a11","h22"};
		
		Map<Character, TreeMap> mm = new TreeMap(); 
		
		/*for (int i : hit) {
			int vv =1;
			if(mm.containsKey(i))
				vv = (int)mm.get(i)+1; 
			mm.put(i, vv);
		}*/
		
		
		for (String str : arr) {
			
			char ch = str.charAt(0);
			
			TreeMap<Integer, Integer> map;
			if(mm.containsKey(ch))
				map = mm.get(ch);
			else
			{
				map = new TreeMap();
				mm.put(ch, map);
			}
			
			int i = Integer.parseInt(str.substring(1));
			int vv =1;
			if(map.containsKey(i))
				vv = map.get(i)+1; 
			
			map.put(i, vv);
			
		}
		
		
		Iterator<Character> it = mm.keySet().iterator();
		
		while(it.hasNext())
		{
			Character key = it.next();
			System.out.println(key+" ÆÀ");
			TreeMap<Integer, Integer> vMap = mm.get(key);
			Iterator<Integer> vit = vMap.keySet().iterator();
			while(vit.hasNext())
			{
				Integer kk = vit.next();
				System.out.println(kk+":"+vMap.get(kk));
			}
			
		}
	
	}

}
