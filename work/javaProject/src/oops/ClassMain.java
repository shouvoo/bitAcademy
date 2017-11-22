package oops;

class AAA // 1.클래스의 정의
{
	int a = 10; // 멤버변수
	void meth() // 클래스 메소드
	{
		System.out.println("AAA meth()");
	}
}

class SellPhone
{
	String camera = "일반 카메라";
	String earPhone = "일반 이어폰";
	
	void camera()
	{
		System.out.println(camera);
	}
	
	void earPhone()
	{
		System.out.println(earPhone);
	}
}

class Mp3
{
	/*String[] firstAlbum = {"1번 노래", "2번 노래", "3번 노래", "4번 노래", "5번 노래"};
	String[] singerArr = {"AOA", "소녀시대"};
	String siner = "홍진영";
	
	void twiceAlbum()
	{
		System.out.println("===============================");
		for (int i = 0; i < firstAlbum.length; i++) 
		{
			System.out.println(firstAlbum[i]);
		}
	}
	
	void multiSinger()
	{
		System.out.println("===============================");
		for (int i = 0; i < singerArr.length; i++) 
		{
			System.out.println(singerArr[i]);
		}
	}
	
	void singleSinger()
	{
		System.out.println("===============================");
		System.out.println(siner);
	}*/
	
	//선생님 방법
	String title;
	String [] song;
}

class HandPhone
{
	String camera = "일반카메라";
	String earPhone = "일반이어폰";
}

public class ClassMain 
{
	
	public static void main(String[] args) 
	{
		AAA a1 = new AAA(); // 3.생성
		AAA a2; // 2.선언
		a2 = new AAA();
		
		a1.a = 20;
		
		System.out.println(a1); //4. 호출
		System.out.println(a2); //4. 호출
		System.out.println(a1.a); //4. 호출
		System.out.println(a2.a); //4. 호출
		a1.meth();
		
		
		SellPhone sellPhone0 = new SellPhone();
		SellPhone sellPhone1 = new SellPhone();
		
		sellPhone0.camera = "광학 카메라";
		sellPhone1.earPhone = "블루투스 이어폰으로 변경해 주세요";
		
		sellPhone0.camera();
		sellPhone1.earPhone();
		
		/*Mp3 twiceMp3 = new Mp3();
		Mp3 multiMp3 = new Mp3();
		Mp3 singleMp3 = new Mp3();
		
		twiceMp3.twiceAlbum();
		multiMp3.multiSinger();
		singleMp3.singleSinger();*/
		
		System.out.println("HP_______________________________________");
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone();
		
		System.out.println(hp1.camera + "  :  " + hp2.earPhone);
		//hp1.camera = "광학카메라";
		//hp2.earPhone = "블루투스 이어폰";
		System.out.println(hp1.camera + "  :  " + hp2.earPhone);
		
		HandPhone hh = hp1;
		System.out.println(hh.camera + "  :  " + hh.earPhone);
		hh = hp2;
		System.out.println(hh.camera + "  :  " + hh.earPhone);
		System.out.println("HP_______________________________________");
		
		HandPhone [] arr = {hp1, hp2};
		
		/*for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("hp" + i + "  :  " + arr[i].camera);
			System.out.println("hp" + i + "  :  " + arr[i].earPhone);
		}*/
		hp1.earPhone = "헤드셋";
		for (HandPhone hp : arr) 
		{
			System.out.println(hp.camera + "  :  " + hp.earPhone);
		}
		
		
		//선생님 방법mp3
		Mp3 twice = new Mp3();
		twice.title = "트와이스 1집";
		twice.song = new String[] {"노래1",
									"노래2",
									"노래3",
									"노래4",
									"노래5",
									};
		
		System.out.println(twice.title);
		for (String ss : twice.song) 
		{
			System.out.println(ss);
		}
	}

}






























