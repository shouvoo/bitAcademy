package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map mm = new HashMap();
		mm.put("aa", "123");
		mm.put(1, "123");
		mm.put("2", 200);
		mm.put(456, 1234);
		mm.put("1", 100);
		mm.put("aa", 1234);
		System.out.println(mm);
		System.out.println(mm.containsValue(1357));
		System.out.println(mm.containsValue("dfsdfs"));
		
		System.out.println(mm.get("aa"));
		System.out.println(mm.get(0));
		
		mm.remove("1");
		System.out.println(mm);
		System.out.println(mm.size());


		System.out.println(mm.keySet());
		System.out.println(mm.entrySet());
		System.out.println(mm.values());
		
		for ( Object oo : mm.keySet()) 
		{
			System.out.println(oo + " : " + mm.get(oo));
		}
		
		System.out.println();
		for ( Object oo : mm.entrySet()) 
		{
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		System.out.println("--------------------------------------------------------");
		Iterator ir = mm.keySet().iterator();
		
		while(ir.hasNext())
		{
			Object key = ir.next();
			System.out.println(key + " : " + mm.get(key));
		}
		
		System.out.println("--------------------------------------------------------");
		Iterator ir2 = mm.entrySet().iterator();
		
		while(ir.hasNext())
		{
			Map.Entry me = (Map.Entry)ir2.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		
	}

}















































