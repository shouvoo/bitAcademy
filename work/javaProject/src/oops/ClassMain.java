package oops;

class AAA // 1.Ŭ������ ����
{
	int a = 10; // �������
	void meth() // Ŭ���� �޼ҵ�
	{
		System.out.println("AAA meth()");
	}
}

class SellPhone
{
	String camera = "�Ϲ� ī�޶�";
	String earPhone = "�Ϲ� �̾���";
	
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
	/*String[] firstAlbum = {"1�� �뷡", "2�� �뷡", "3�� �뷡", "4�� �뷡", "5�� �뷡"};
	String[] singerArr = {"AOA", "�ҳ�ô�"};
	String siner = "ȫ����";
	
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
	
	//������ ���
	String title;
	String [] song;
}

class HandPhone
{
	String camera = "�Ϲ�ī�޶�";
	String earPhone = "�Ϲ��̾���";
}

public class ClassMain 
{
	
	public static void main(String[] args) 
	{
		AAA a1 = new AAA(); // 3.����
		AAA a2; // 2.����
		a2 = new AAA();
		
		a1.a = 20;
		
		System.out.println(a1); //4. ȣ��
		System.out.println(a2); //4. ȣ��
		System.out.println(a1.a); //4. ȣ��
		System.out.println(a2.a); //4. ȣ��
		a1.meth();
		
		
		SellPhone sellPhone0 = new SellPhone();
		SellPhone sellPhone1 = new SellPhone();
		
		sellPhone0.camera = "���� ī�޶�";
		sellPhone1.earPhone = "������� �̾������� ������ �ּ���";
		
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
		//hp1.camera = "����ī�޶�";
		//hp2.earPhone = "������� �̾���";
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
		hp1.earPhone = "����";
		for (HandPhone hp : arr) 
		{
			System.out.println(hp.camera + "  :  " + hp.earPhone);
		}
		
		
		//������ ���mp3
		Mp3 twice = new Mp3();
		twice.title = "Ʈ���̽� 1��";
		twice.song = new String[] {"�뷡1",
									"�뷡2",
									"�뷡3",
									"�뷡4",
									"�뷡5",
									};
		
		System.out.println(twice.title);
		for (String ss : twice.song) 
		{
			System.out.println(ss);
		}
	}

}






























