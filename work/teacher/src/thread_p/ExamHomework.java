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
		
		System.out.println("��������");
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
			System.out.println("timer ����");
		}
	}	
}

public class ExamHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedHashMap<String, ExamTH> map
		 = new LinkedHashMap<>();
		
		map.put("����", new ExamTH("����",new ExamMJ[] {
				
				new ExamMJ("��������?", "�Ϳ�����"),
				new ExamMJ("��������?", "��ø"),
				new ExamMJ("�񼮾�", "������"),
				new ExamMJ("�����", "������")
		} ));
		
		map.put("����", new ExamTH("����",new ExamMJ[] {
				
				new ExamMJ("patience","�γ�"),
		        new ExamMJ("discard","������"),
		        new ExamMJ("impose","�ΰ��ϴ�"),
		        new ExamMJ("fraud","���"),
		        new ExamMJ("emission","����")
				
		} ));
		
		map.put("����", new ExamTH("����",new ExamMJ[] {
				
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
