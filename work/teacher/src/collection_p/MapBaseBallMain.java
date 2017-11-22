package collection_p;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapBaseBallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr = {"h22","h23","h11","a3","a7","a22","h23","a11","h5","a3","h8","a11","h22"};
		
		Map <Character, TreeMap>mm = new TreeMap(); 
		
		
		
		for (String str : arr) {
			
			char ch = str.charAt(0);
			
			TreeMap <Integer, Integer> map;
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
