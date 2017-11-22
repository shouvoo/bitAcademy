package collection;

import java.util.Stack;

class MP3
{
	int no;
	String title, singer, genre;
	public MP3(int no, String title, String singer) {
		super();
		this.no = no;
		this.title = title;
		this.singer = singer;
		
	}
	@Override
	public String toString() {
		return "[" + no + ", " + title + "," + singer  + "]";
	}
	
	
}


class StackMP3{
	private Stack back = new Stack();
	private Stack next = new Stack();
	
	private MP3 now=null;
	
	public StackMP3(String [] arr) {
		// TODO Auto-generated constructor stub
		for (int i = arr.length-1; i >=0 ; i--) {
			
			String [] buf = arr[i].split("_");
			
			next.add(new MP3(i, buf[0], buf[1]));
		}
		
		
	}
	
	void goTrack(int no)
	{
		int ori = now.no;
		boolean chk = false;
		System.out.println("------------goTrack("+no+")");
		while(true)
		{
			if(now.no==no)
				break;
			else if(now.no<no) 
				chk=nextModule();				
			else 
				chk=backModule();

			if(chk) {
				System.out.println("�߸��� Ʈ����ȣ�Դϴ�.");
				no = ori;
			}
		}
			
		
		print();
	}
	
	boolean backModule()
	{
		if(back.empty())
		{
			
			return true;
		}	
		if(now!=null)
			next.add(now);
		
		now = (MP3)back.pop();
		
		return false;
	}
	
	void goBack()
	{
		System.out.println("------------goBack()");
		
		
		
		
		if(backModule())
			System.out.println("���� ���� �����ϴ�.");
		else		
			print();
	}
	
	boolean nextModule()
	{

		if(next.empty())
			return true;
	
		
		if(now!=null)
			back.add(now);
		
		now = (MP3)next.pop();
		return false;
	}
	
	void goNext()
	{
		System.out.println("------------goNext()");
		
		
		
		if(nextModule())
			System.out.println("�������� �����ϴ�.");
		
		else
			print();
	}
	
	
	void print()
	{
		System.out.println("����:"+now);
		System.out.println("����:"+back);
		System.out.println("������:"+next);
	}
}

public class StackMP3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {
				"�����̽�_����",
				"����ȭ����_��ö",
				"�����ڶ�_������",
				"���ó�_����",
				"�����ȶ��_MC�����밡��",
				"������ ����_��ġ��",
				"���࿭��_�����",
				"����_������",
				"������_������",
				"����_�����",
		};
		
		StackMP3 mm = new StackMP3(arr);
		
		mm.goNext();
		mm.goTrack(7);
		mm.goTrack(-2);
		
		
	}

}

