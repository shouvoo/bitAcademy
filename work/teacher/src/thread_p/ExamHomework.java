package thread_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.swing.JOptionPane;



class ExamMJ{
	
	String qq, ans;

	public ExamMJ(String qq, String ans) {
		super();
		this.qq = qq;
		this.ans = ans;
	}
	
	
}

class ExamTH extends Thread{

	ArrayList<ExamMJ> qqs = new ArrayList<>();
	int i =100;
	boolean chk = false;
	String title;
	public ExamTH(String title,ExamMJ[] qqs) {
		// TODO Auto-generated constructor stub
		this.title = title;
		for (ExamMJ examMJ : qqs) {
			this.qqs.add(examMJ );
		}
		
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		new ExamTimer().start();
		
		for (ExamMJ mun : qqs) {
			if(chk)
				break;
			String input = JOptionPane.showInputDialog(mun.qq);
			
			if(chk)
				break;
			System.out.println(mun.qq+":"+input);
		}
		
		chk = true;
		
		System.out.println("문제종료");
	}
	
	class ExamTimer extends Thread{
		
		
		
		public ExamTimer() {
			super();
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (; i >0; i--) {
				
				if(chk)
					break;
				System.out.println(title+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			chk = true;
			System.out.println("timer 종료");
		}
	}	
}

public class ExamHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedHashMap<String, ExamTH> map
		 = new LinkedHashMap<>();
		
		map.put("국어", new ExamTH("국어",new ExamMJ[] {
				
				new ExamMJ("선생님은?", "귀여워요"),
				new ExamMJ("윤현구는?", "간첩"),
				new ExamMJ("희석아", "공부해"),
				new ExamMJ("성희야", "같이해")
		} ));
		
		map.put("영어", new ExamTH("영어",new ExamMJ[] {
				
				new ExamMJ("patience","인내"),
		        new ExamMJ("discard","버리다"),
		        new ExamMJ("impose","부과하다"),
		        new ExamMJ("fraud","사기"),
		        new ExamMJ("emission","배출")
				
		} ));
		
		map.put("수학", new ExamTH("수학",new ExamMJ[] {
				
				 new ExamMJ("1+1","2"),
			        new ExamMJ("4*5","16"),
			        new ExamMJ("123+456","579"),
			        new ExamMJ("1+5-4*5","14"),
			        new ExamMJ("5*4/2+2","12")
				
		} ));
		
		
		
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			
			map.get(key).start();
			while(true) {
				try {
					Thread.sleep(10);
					if(map.get(key).chk)
						break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
