package oops;

class Mp3Class
{
	String [] twiceArr;
	String [] MultiSinger;
	String singleSinger;
	
	void listenRadio()
	{
		twiceArr = new String [] {"�뷡1","�뷡2","�뷡3","�뷡4","�뷡5","�뷡6"};
	}
	
	void print()
	{
		for (int i = 0; i < twiceArr.length; i++) 
		{
			System.out.println((i + 1) + "�� �뷡�� �÷��� �մϴ�!!");
			System.out.println("�������� : " + twiceArr[i]);
			System.out.println((i + 1) + "�� �뷡�� ���� �մϴ�!!");
			System.out.println();
			System.out.println("---------------------------");
			System.out.println();
		}
		
		System.out.println(twiceArr.length + "���� �뷡�� ��� �����߽��ϴ�");
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
