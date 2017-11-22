package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Timer extends Thread{
	
	MunData md;
	
	public Timer(MunData md) {
		super();
		this.md = md;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; md.i >0; md.i--) {
			
			if(md.chk)
				break;
			System.out.println(md.i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("timer ����");
	}
}

class MunJe{
	
	String qq, ans;

	public MunJe(String qq, String ans) {
		super();
		this.qq = qq;
		this.ans = ans;
	}
	
	
}

class MunData{
	ArrayList<MunJe> qqs = new ArrayList<>();
	int i =100;
	boolean chk = false;
	public MunData() {
		// TODO Auto-generated constructor stub
		qqs.add(new MunJe("1+1", "2"));
		qqs.add(new MunJe("��������?", "�Ϳ�����"));
		/*qqs.add(new MunJe("��������?", "��ø"));
		qqs.add(new MunJe("�񼮾�", "������"));
		qqs.add(new MunJe("�����", "������"));*/
	}
	
}

public class ThreadExamMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MunData md =new MunData();
		
		Timer tt = new Timer(md);
		
		tt.start();
		
		for (MunJe mun : md.qqs) {
			if(md.i<=0)
				break;
			String input = JOptionPane.showInputDialog(mun.qq);
			
			if(md.i<=0)
				break;
			System.out.println(mun.qq+":"+input);
		}
		//tt.i=0;
		md.chk = true;
		
		System.out.println("��������");
		
		
		
	}

}
