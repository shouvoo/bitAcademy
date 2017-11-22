package homeWork_20170913;

import java.util.ArrayList;
import java.util.ListIterator;

class Timer extends Thread
{
	ArrayList<EditScript> scriptList;
	ArrayList<EditScript> editList;
	
	boolean reverseBln = false;
	boolean directionBln = false;
	boolean stopBln = false;
	
	int sleepTime = 3000;
	int skipCount = 0;
	
	
	public Timer(int skipCount, ArrayList<EditScript> scriptList) 
	{
		this.skipCount = skipCount;
		this.scriptList = scriptList;
		editList();
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		EditScript es;
		ArrayList<String> sl;
		ListIterator<String> lit;
		
		ListIterator<EditScript> mLit = this.editList.listIterator();

		timeWhile0:while(directionBln = (reverseBln) ? mLit.hasPrevious() : mLit.hasNext())
		{
			
			if(stopBln) break timeWhile0;
			
			es = (reverseBln) ? mLit.previous() : mLit.next();
			sl = es.scriptList;
			lit = sl.listIterator();

			print("=====  " + es.trackName + "  =====");

			timeWhile1:while(directionBln = (reverseBln) ? lit.hasPrevious() : lit.hasNext())
			{
				try 
				{
					if(stopBln) break timeWhile1;
					String str = (reverseBln) ? lit.previous() : lit.next();
					sleep(1000);
					if(stopBln) break timeWhile1;
					print(str);
				} catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			this.skipCount++;
			
		}

	}
	
	Timer skip(int n)
	{
		this.stopBln = true;
		this.run();
		
		if((n) > this.scriptList.size() - 1)
		{
			print("=====  " + (n) + "�� ���� ����Ʈ�� �����ϴ�   =====");
			print("=====  �����ô� ������ �÷��� �մϴ�    =====");
		} else 
		{
			print("=====  " + (n) + "�� ������ �̵�  =====");
			this.skipCount = n - 1;
		}
		
		
		Timer mt = new Timer(this.skipCount, this.scriptList);
		return mt;
	}
	
	public void editList()
	{
		editList = new ArrayList<>();
		
		for (int i = this.skipCount; i < this.scriptList.size(); i++) 
		{
			editList.add(this.scriptList.get(i));
		}
	}
	
	public void setReverse(boolean bln)
	{
		this.reverseBln = bln;
	}
	
	public void allStop()
	{
		print("*****  ALL STOP  *****");
		this.stopBln = true;
	}
	
	public void timerPause() throws InterruptedException
	{
		print("*****  PAUSE  *****");
		this.suspend();
	}
	
	public void timerResume() throws InterruptedException
	{
		print("*****  PLAY  *****");
		this.resume();
	}
	
	public void setSleep(int time) throws InterruptedException
	{
		this.sleep(time);
	}
	
	public void print(String str)
	{
		System.out.println(str);
		System.out.println();
	}
}

class EditScript
{
	ArrayList<String> scriptList;
	String[] scriptArr;
	String trackName;
	
	public EditScript(String trackName, String scrptit) 
	{
		scriptList = new ArrayList<>();
		this.trackName = trackName;
		this.scriptArr = scrptit.split(",");
		
		for (String arr : scriptArr) 
		{
			scriptList.add(arr);
		}
	}
}

public class HomeWorkMain {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ArrayList<EditScript> scriptList = new ArrayList<>();
		scriptList.add(new EditScript("�ֱ��� 1��", "���ع��� ��λ��� ������ �⵵��,�ϴ����� �����ϻ� �츮���� ����,����ȭ ��õ�� ȭ������,���� ���,�������� ���� �����ϼ�"));
		scriptList.add(new EditScript("�ֱ��� 2��", "���� ���� �� �ҳ��� ö���� �θ� ��,�ٶ����� �Һ����� �츮 ����ϼ�,����ȭ ��õ�� ȭ������,���� ���,�������� ���� �����ϼ�"));
		scriptList.add(new EditScript("�ֱ��� 3��", "���� �ϴ� ��Ȱ�ѵ� ���� ���� ����,���� ���� �츮 ���� ����ܽ��ϼ�,����ȭ ��õ�� ȭ������,���� ���, �������� ���� �����ϼ�"));
		scriptList.add(new EditScript("�ֱ��� 4��", "�� ���� �� ������ �漺�� ���Ͽ�,���ο쳪 ��ſ쳪 ���� ����ϼ�,����ȭ ��õ�� ȭ������,���� ���, �������� ���� �����ϼ�"));
		
		Timer skipMt;
		Timer mt = new Timer(0, scriptList);
		mt.start();
		
		mt.setSleep(mt.sleepTime);
		mt.timerPause();
		
		mt.setSleep(mt.sleepTime);
		mt.timerResume();
		mt.setReverse(true);
		
		mt.setSleep(mt.sleepTime);
		skipMt = mt.skip(3);
		skipMt.start();
		
		skipMt.setSleep(7000);
		skipMt.allStop();

	}

}
