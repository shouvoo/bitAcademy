package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Timer extends Thread
{
	
	int i;
	//boolean timeBln = false;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for (i = 100; i > 0; i--) 
		{
			//if(timeBln) break;
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("timer ����");
	}
}

class MunJe
{
	String qq, ans;

	public MunJe(String qq, String ans) {
		super();
		this.qq = qq;
		this.ans = ans;
	}
	
}

public class ThreadExamMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<MunJe> qqs = new ArrayList<>();
		qqs.add(new MunJe("1 + 1", "2"));
		qqs.add(new MunJe("��������?", "�Ϳ�����"));
		qqs.add(new MunJe("��������?", "��ø"));
		qqs.add(new MunJe("�񼮾�", "������"));
		qqs.add(new MunJe("�����", "������"));
		
		Timer tt = new Timer();
		tt.start();
		
		for (MunJe mun : qqs) 
		{
			if(tt.i <= 0) break;
			String input = JOptionPane.showInputDialog(mun.qq);
			
			if(tt.i <= 0) break;
			System.out.println(mun.qq + " : " + input);
			
		}
		
		//tt.timeBln = true;
	
	}

}






