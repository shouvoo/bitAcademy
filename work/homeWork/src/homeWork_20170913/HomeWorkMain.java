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
			print("=====  " + (n) + "번 곡은 리스트에 없습니다   =====");
			print("=====  들으시던 음악을 플레이 합니다    =====");
		} else 
		{
			print("=====  " + (n) + "번 곡으로 이동  =====");
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
		scriptList.add(new EditScript("애국가 1절", "동해물과 백두산이 마르고 닳도록,하느님이 보우하사 우리나라 만세,무궁화 삼천리 화려강산,대한 사람,대한으로 길이 보전하세"));
		scriptList.add(new EditScript("애국가 2절", "남산 위에 저 소나무 철갑을 두른 듯,바람서리 불변함은 우리 기상일세,무궁화 삼천리 화려강산,대한 사람,대한으로 길이 보전하세"));
		scriptList.add(new EditScript("애국가 3절", "가을 하늘 공활한데 높고 구름 없이,밝은 달은 우리 가슴 일편단심일세,무궁화 삼천리 화려강산,대한 사람, 대한으로 길이 보전하세"));
		scriptList.add(new EditScript("애국가 4절", "이 기상과 이 맘으로 충성을 다하여,괴로우나 즐거우나 나라 사랑하세,무궁화 삼천리 화려강산,대한 사람, 대한으로 길이 보전하세"));
		
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
