package collection_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;



class CharCom implements Comparator<Characters>
{
	int cnt=3;
	
	public CharCom(String key) {
		// TODO Auto-generated constructor stub
		HashMap<String, Integer>map = new HashMap<>();
		
		map.put("����" ,0);
        map.put("��ġ", 1);
        map.put("��",2);
        
        if(map.containsKey(key))
        	cnt = map.get(key);
	}
	
	@Override
	public int compare(Characters o1, Characters o2) {
		// TODO Auto-generated method stub
		int res;
		if(cnt==3)
			res = (int)(o2.jj-o1.jj);
		else
			res = o2.jum[cnt]-o1.jum[cnt];
    	
    	if(res==0)
    		res = o1.name.compareTo(o2.name);
    	return res;
	}
}

class Characters //implements Comparable<Characters>
{
    String tribe;
    String name;
    int level, value, frequency;
    int []jum;
    double jj;
    
    HashMap<String, double[]> rate;
    
    public Characters(String tribe,String name, int level, int value, int frequency) {
        super();
        this.tribe = tribe;
        this.name = name;
        jum = new int[]{level, value, frequency};
        
        rate = new HashMap<>();
        
        rate.put("�޸�" ,new double[] {0.5,0.3,0.2});
        rate.put("������", new double[] {0.2,0.7,0.1});
        rate.put("�����̾�",new double[] {0.4,0.35,0.25});
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
    
    /*@Override
    public int compareTo(Characters o) {
    	// TODO Auto-generated method stub
    	
    	int res = (int)(o.jj-jj);
    	
    	if(res==0)
    		res = name.compareTo(o.name);
    	return res;
    }*/
    
    
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
		String key ="";
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
			TreeSet<Characters> now;
			
			if(map.containsKey(ch.tribe))
				now = map.get(ch.tribe);
			else {
				now = new TreeSet<>(new CharCom(key));
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
