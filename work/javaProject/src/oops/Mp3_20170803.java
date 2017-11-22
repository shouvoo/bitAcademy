package oops;

class Mp3Class
{
	String [] twiceArr;
	String [] MultiSinger;
	String singleSinger;
	
	void listenRadio()
	{
		twiceArr = new String [] {"노래1","노래2","노래3","노래4","노래5","노래6"};
	}
	
	void print()
	{
		for (int i = 0; i < twiceArr.length; i++) 
		{
			System.out.println((i + 1) + "번 노래를 플레이 합니다!!");
			System.out.println("음악제목 : " + twiceArr[i]);
			System.out.println((i + 1) + "번 노래를 종료 합니다!!");
			System.out.println();
			System.out.println("---------------------------");
			System.out.println();
		}
		
		System.out.println(twiceArr.length + "곡의 노래를 모두 진행했습니다");
	}
}

public class Mp3_20170803 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mp3Class mp3Class = new Mp3Class();
		mp3Class.listenRadio();
		mp3Class.print();
	}

}
