package thread_p;

import java.util.ArrayList;

class MovieTimer extends Thread
{
	ArrayList<EditScript> scriptList;
	public MovieTimer(ArrayList<EditScript> scriptList) 
	{
		
		this.scriptList = scriptList;
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//stack 뒤로 돌리기 방법1
		//scriptList.listIterator();뒤로 돌리기 방법2 
		for (int i = 0; i < scriptList.size(); i++)
		{
			EditScript ex = scriptList.get(i);
			System.out.println("노래 제목  :  " + ex.trackName);
			for (int j = 0; j < ex.scriptArr.length; j++) 
			{
				try 
				{
					sleep(2000);
					System.out.println(ex.scriptArr[j]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("====  " + ex.trackName + " 노래 끝" + "  ====");
			
			
		}
	}
	
	public void moviePause() throws InterruptedException
	{
		print("잠시 멈추");
		this.sleep(3000);
		this.suspend();
	}
	
	public void movieResume() throws InterruptedException
	{
		print("재 시작");
		this.sleep(3000);
		this.resume();
	}
	
	public void print(String str)
	{
		System.out.println(str);
	}
}

class EditScript
{
	String[] scriptArr;
	String trackName;
	
	public EditScript(String trackName, String scrpti) 
	{
		this.trackName = trackName;
		this.scriptArr = scrpti.split(",");
	}
}

public class MoviePlayerMain
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		/*동영상 플레이어를 구현하세요
		뒤로재생, 재생(정지 취소), 일시정지, 정지(mp3 아웃)
		재생중 - 자막출력*/
		
		ArrayList<EditScript> scriptList = new ArrayList<>();
		scriptList.add(new EditScript("1절", "동해물과 백두산이 마르고 닳도록,하느님이 보우하사 우리나라 만세,무궁화 삼천리 화려강산,대한 사람,대한으로 길이 보전하세"));
		scriptList.add(new EditScript("2절", "남산 위에 저 소나무 철갑을 두른 듯,바람서리 불변함은 우리 기상일세,무궁화 삼천리 화려강산,대한 사람,대한으로 길이 보전하세"));
		scriptList.add(new EditScript("3절", "가을 하늘 공활한데 높고 구름 없이,밝은 달은 우리 가슴 일편단심일세,무궁화 삼천리 화려강산,대한 사람, 대한으로 길이 보전하세"));
		scriptList.add(new EditScript("4절", "이 기상과 이 맘으로 충성을 다하여,괴로우나 즐거우나 나라 사랑하세,무궁화 삼천리 화려강산,대한 사람, 대한으로 길이 보전하세"));

		MovieTimer mt = new MovieTimer(scriptList);
		mt.start();
		
		
		mt.moviePause();
		mt.movieResume();
		
	}

}
