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
		//stack �ڷ� ������ ���1
		//scriptList.listIterator();�ڷ� ������ ���2 
		for (int i = 0; i < scriptList.size(); i++)
		{
			EditScript ex = scriptList.get(i);
			System.out.println("�뷡 ����  :  " + ex.trackName);
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
			System.out.println("====  " + ex.trackName + " �뷡 ��" + "  ====");
			
			
		}
	}
	
	public void moviePause() throws InterruptedException
	{
		print("��� ����");
		this.sleep(3000);
		this.suspend();
	}
	
	public void movieResume() throws InterruptedException
	{
		print("�� ����");
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
		/*������ �÷��̾ �����ϼ���
		�ڷ����, ���(���� ���), �Ͻ�����, ����(mp3 �ƿ�)
		����� - �ڸ����*/
		
		ArrayList<EditScript> scriptList = new ArrayList<>();
		scriptList.add(new EditScript("1��", "���ع��� ��λ��� ������ �⵵��,�ϴ����� �����ϻ� �츮���� ����,����ȭ ��õ�� ȭ������,���� ���,�������� ���� �����ϼ�"));
		scriptList.add(new EditScript("2��", "���� ���� �� �ҳ��� ö���� �θ� ��,�ٶ����� �Һ����� �츮 ����ϼ�,����ȭ ��õ�� ȭ������,���� ���,�������� ���� �����ϼ�"));
		scriptList.add(new EditScript("3��", "���� �ϴ� ��Ȱ�ѵ� ���� ���� ����,���� ���� �츮 ���� ����ܽ��ϼ�,����ȭ ��õ�� ȭ������,���� ���, �������� ���� �����ϼ�"));
		scriptList.add(new EditScript("4��", "�� ���� �� ������ �漺�� ���Ͽ�,���ο쳪 ��ſ쳪 ���� ����ϼ�,����ȭ ��õ�� ȭ������,���� ���, �������� ���� �����ϼ�"));

		MovieTimer mt = new MovieTimer(scriptList);
		mt.start();
		
		
		mt.moviePause();
		mt.movieResume();
		
	}

}
