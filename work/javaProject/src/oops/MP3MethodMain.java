package oops;

class MP3Method
{
	String title;
	String [] song;
	int now;
	
	void play()
	{
		System.out.println("title : " + title);
		for (int i = 0; i < song.length; i++) 
		{
			System.out.println(i + "=>" + song[i] + " play");
		}
	}
	
	void trackPlay()
	{
		if(now >= 0 && now < song.length)
		{
			System.out.println(now + "Ʈ�� : " + song[now] + " play");
		} else 
		{
			System.out.println("Ʈ������ ���Դϴ�");
		}
	}
}

public class MP3MethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MP3Method mm = new MP3Method();
		mm.title = "���座��";
		mm.song = new String [] {"aaa", "bbb", "ccc", "ddd", "eee", };
		
		mm.play();
		mm.trackPlay();
	}
	
	
	

}
