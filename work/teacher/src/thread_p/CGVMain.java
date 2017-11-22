package thread_p;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

class CGV extends Thread{
	
	TreeMap<Integer, String> map = new TreeMap<>();
	
	People [] ppp;
	
	synchronized boolean reserChk(TreeSet<Integer> seat)
	{
		boolean res = false;
	
		try {
	
		
			Thread.sleep(500);
		
			
			for (Integer i : seat) {
				if(map.containsKey(i))
				{
					res = true;
				}
			}

		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
		
		return res;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			boolean chk = true;
			
			for (People pe : ppp) {
				if(pe.isAlive())
					chk = false;
			}
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(chk)
				break;
		}
		
		
		System.out.println("cgv 예매결과:"+map);
	}
}

class People extends Thread{
	
	CGV cgv;
	ArrayList<TreeSet<Integer>> arr = new ArrayList<>();
	
	public People(String name,CGV cgv) {
		// TODO Auto-generated constructor stub
		super(name);
		this.cgv = cgv;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(cgv.map.size()<30)
		{
			TreeSet<Integer> seat = new TreeSet<>();
			
			int cnt =(int)(Math.random()*3+1);
			while(true)
			{
				seat.add((int)(Math.random()*30+1));
				if(seat.size()==cnt)
					break;
			}
			
			//System.out.println(getName()+":"+seat+"입력전");
			if(!cgv.reserChk(seat))
			{
				
				for (Integer i : seat) {
					cgv.map.put(i,getName());
				}
				arr.add(seat);
				
				System.out.println(getName()+":"+seat+" ->"+cgv.map.size());
				//System.out.println("cgv:"+cgv.map);
			}	
		}
		
		
		System.out.println(getName()+"예매결과>>>>");
		
		for (TreeSet<Integer> treeSet : arr) {
			System.out.println(treeSet);
		}
	}
}
public class CGVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CGV cgv = new CGV();
		People [] ppp = {
				new People("p1", cgv),
				new People("p2", cgv),
				new People("p3", cgv),
				new People("p4", cgv),
				new People("p5", cgv)
		};
		
		for (People people : ppp) {
			people.start();
		}
		
		cgv.ppp=ppp;
		cgv.start();
	}

}
