package thread_p;

import java.util.ArrayList;

class MP3 extends Thread{
	ArrayList<Music> list;
	int curr = 0, currMM=-1,dir =1;
	Music now;
	
	boolean pau = false, finish;
	
	void pause() {
		
		pau = !pau;
	}
	
	void next()
	{
			
		finish=true;
		
	}
	void back()
	{
			
		finish=true;
		curr-=2;
	}
	void goTrack(int tr)
	{
			
		finish=true;
		curr=tr-1;
	}
	
	public MP3(Music [] mm) {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (Music music : mm) {
			list.add(music);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			finish=false;
			curr++;
			
			if(curr>=list.size()-1)
			{
				curr=list.size()-1;
				
				continue;

			}
			if(curr<0)
			{
				curr=0;

				continue;

			}
			
			now = list.get(curr);
			currMM=-1;
			play();
			System.out.println();
		}
	}
	
	
	
	void play()
	{
		System.out.println("\n>>>>>>"+now.name+" : ����");
		while(true)
		{
			try {
				Thread.sleep(50);
				
				if(pau)
					continue;
				
				currMM+= dir;
				if(finish)
					break;
				
				if(currMM>=now.str.length()-1)
				{
					curr++;
					break;
				}
				if(currMM<0)
				{
					curr--;
					break;
	
				}
				
				
				System.out.print(now.str.charAt(currMM));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n>>>>>>"+now.name+" : ����");
	}
	
	
}

class Music //extends Thread
{
    String singer;
    String name;
    String str;
	public Music(String singer, String name, String str) {
		super();
		this.singer = singer;
		this.name = name;
		this.str = str;
	}
    
    
}
public class MP3PlayerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 MP3 mm = new MP3(new Music[] {
				 new Music("������","�� ���� ��","�� ���� �ʸ� ������ �ʸ� ���� �ٶ󺸱⿣ \n"+
		                    "��ȸ�� ���� �� �������� �ʹ� ���� ���ƾ� \n"+
		                    "���� ���ſ� ���� ���ݰ� �ʹ��� ���⿡ \n"+
		                    "�η��� ���̳� \n"+
		                    "���� �������̾�� �� ���\n"+
		                    "���� ��Ȳ�� ���� �� �ְ� \n"+
		                    "�� �̷��� �Ѹ�ģ�뵵 ���� ���� ��ģ ���� �ž�\n"+
		                    "��õ� �ʴ� �Ҿ��� ��� ���� ���� ������ ��~~\n"+
		                    "���� �Ƴ൵ ��ģ �� ���� ���� ���� �� �ִ� \n"+
		                    "���� ���ſ� ���� ���ݰ� �ʹ��� ���⿡\n"+
		                    "�η��� ���̳� \n"+
		                    "���� �������̾�� �� ���\n"+
		                    "���� ��Ȳ�� ���� �� �ְ� \n"+
		                    "�� �̷��� �Ѹ�ģ�뵵 ���� ���� ��ģ �����ž�\n"),
		            new Music("�����","�߰���","�̾��ظ��� ������ �� ���޾ƿ�\n"+
		                    "�� ���� �״� ¦�� �ƴ���\n"+
		                    "�������Կ� ��ȥ �ۿ� �� �� ����\n"+
		                    "���� �� �� ���Ѱ����\n"+
		                    "�״� �ູ ���� �� �ƴ϶�\n"+
		                    "��ų�׸� �װ� ��������� �װ� ���� ������\n"+
		                    "�߰��� �� ������ ��� �ູ�߾��\n"+
		                    "�׷��� �̰͸� �˾����\n"+
		                    "���� �� ������� ����\n"+
		                    "�� ����� �����ϴٰų� ���� ������"),
		            new Music("G�巡��","����","������ ���ƿ��Ⱑ\n"+
		                    "��ư� ���� �� �˾�\n"+
		                    "���� ���� ��ó�ޱⰡ\n"+
		                    "�ηư� ���� �� �˾�\n"+
		                    "�װ� ���� ���� �׳�����\n"+
		                    "���� ���� �� �︮��\n"+
		                    "�ڵ��� ���� ��ȸ�� �̾���\n"+
		                    "���� �� �� ���̶�\n"+
		                    "�ʸ� �� �� �ִٸ�\n"+
		                    "�� ��� �� �� �Ҿ ������\n"+
		                    "�޿����� �ʸ� ����\n"+
		                    "�ٽ� ����ϱ⸦\n"+
		                    "�츮 �̴��"),
		            new Music("������","����","���� ������ �ʹ� ������ݾ�\n"+
		                    "�츮 �� �������� ���� �̺����� �ǵ� \n"+
		                    "�츰 �� �������\n"+
		                    "�� �����ٰ� ���� ����� ����\n"+
		                    "���� �� ���� ���\n"+
		                    "���� �� ������ �־�\n"+
		                    "���� ���� ���ϴ���\n"+
		                    
		                    "���߾� �� �� ������ �ž�\n"+
		                    "�� �������� �ߵ� ���⿣\n"+
		                    "������ ����ؼ� ����� ������ ��\n"+
		                    "�ϰ� �󸶳� ������ ����\n"+
		                    "�� ����� ������ �� �ؾ�\n"+
		                    "��� ������ ����\n"+
		                    "�� �ҽ� �鸰 ���� ��\n"+
		                    
		                    "������ �� ��� ������ �ߵ�� ���ſ�\n"+
		                    "�ϰ� ���� �� ����� ���ھ�\n"+
		                    "��¥ ���� �� �� ���� �� ���̶�\n"+
		                    "������ �ູ����"),
		            new Music("������","Heaven","�� ���� �Գ��� �� ���� �״� \n"+
		                    "����ŭ ��������� \n"+
		                    "�� �� ��� �ϳ׿� �״� �� ����\n"+ 
		                    "�� ��� �� ������ ���� \n"+
		                    "�� ���� ������ ���ðŸ鼭 \n"+
		                    "����� ���⿡ �ִµ� \n"+
		                    "�ٽ� �׷������� ���� �׾��\n"+ 
		                    "�״� ���� ���̴ϱ�� \n"+
		                    "�� �״� �Ҵ´ٴ� �� \n"+
		                    "�� ���� ���� �� \n"+
		                    "��Ƶ� �����ΰ��� \n"+
		                    "�״� ���� ���� �״� ���� ���\n"+ 
		                    "����� �� ����� \n"+
		                    "�������� �� ���� �츮 ��� ��������\n"+ 
		                    "�������� ���� ���� ��� �ϳ��θ� �״� ��� �Ҳ��� \n"+
		                    "�״�� �� ������ �ູ�� �� �� Heaven ")
		 });
		 
		 
		 mm.start();
		 Thread.sleep(2000);
		 mm.pause();
		 Thread.sleep(2000);
		 mm.pause();
		 Thread.sleep(2000);
		 mm.next();
		 Thread.sleep(2000);
		 mm.goTrack(3);
		 Thread.sleep(2000);
		 mm.back();
		 Thread.sleep(2000);
		 mm.stop();
	}

}
