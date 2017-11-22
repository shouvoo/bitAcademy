package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

class Characters implements Comparable<Characters>
{
    String tribe, sortKey;
    String name;
    int level, value, frequency;
    int []jum;
    double jj;
    
    HashMap<String, double[]> rate;
    HashMap<String, Integer>sortMap = new HashMap<>();
    
    public Characters(String tribe,String name, int level, int value, int frequency) {
        super();
        this.tribe = tribe;
        this.name = name;
        jum = new int[]{level, value, frequency};
        
        this.level = level;
        this.value = value;
        this.frequency = frequency;
        
        rate = new HashMap<>();
        
        rate.put("�޸�" ,new double[] {0.5,0.3,0.2});
        rate.put("������", new double[] {0.2,0.7,0.1});
        rate.put("�����̾�",new double[] {0.4,0.35,0.25});
        
        sortMap.put("level" , level);
        sortMap.put("value", value);
        sortMap.put("frequency",frequency);
        
        cal();
    }
    
    void cal()
    {
    	jj=0;
    	for (int i = 0; i < jum.length; i++) {
    		
    		jj+= rate.get(tribe)[i]*jum[i];
			
		}
    }
 
    @Override
    public String toString() {
        return tribe+"\t"+
                name+"\t"+
                Arrays.toString(jum)+"\t"+jj;
    };
    
    @Override
    public int compareTo(Characters o) {
    	// TODO Auto-generated method stub
    	int res = 0;
    	/*if(sortKey == "total") res = (int)(o.jj-jj);
    	else if(sortKey == "level") res = (int)(o.level - level);
    	else if(sortKey == "value") res = (int)(o.value - value);
    	else if(sortKey == "frequency") res = (int)(o.frequency - frequency);
    	else System.out.println("else");
    		
    	if(res==0)
    		res = name.compareTo(o.name);*/
    	
    	res = o.sortMap.get(sortKey) - sortMap.get(sortKey);
    	if(res == 0) res = res  +1;
    	return res;
    }
}


class GameCom implements Comparator<String>{
	
	HashMap<String, Integer>map = new HashMap<>();
	
	public GameCom() {
		// TODO Auto-generated constructor stub
		map.put("�޸�" ,1);
        map.put("������", 2);
        map.put("�����̾�",3);
	}
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return map.get(o1)-map.get(o2);
	}
}

public class GameCharator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Characters []chArr = {
                new Characters("�����̾�", "����", 55, 78 ,68),
                new Characters("������", "���̳�", 67,89, 89),
                new Characters("�޸�", "����Ʋ��", 77, 98, 78),
                new Characters("�����̾�", "����", 89, 78, 98),
                new Characters("������", "�����Ƴ�", 78, 99, 89),
                new Characters("�޸�", "�����", 98, 99, 99),
                new Characters("�����̾�", "����", 89, 77, 65),
                new Characters("������", "�ŵ��", 88, 89, 88),
                new Characters("�޸�", "�߽���", 99, 10, 99)
        };
		
		TreeMap<String, TreeSet<Characters>> map = new TreeMap<>(new GameCom());
		
		for (Characters ch : chArr) {
			ch.sortKey = "frequency";
			TreeSet<Characters> now;
			if(map.containsKey(ch.tribe))
				now = map.get(ch.tribe);
			else {
				now = new TreeSet<>();
				map.put(ch.tribe, now);
			}
			
			now.add(ch);
			
		}
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			String tribe = it.next();
			
			System.out.println(tribe+">>>>>>>>>>>");
			
			TreeSet<Characters> ts = map.get(tribe);
			
			for (Characters ch : ts) {
				System.out.println(ch);
			}
			
		}
		
		
	}

}
