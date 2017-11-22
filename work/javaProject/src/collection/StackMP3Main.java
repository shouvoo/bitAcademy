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
				System.out.println("잘못된 트랙번호입니다.");
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
			System.out.println("이전 곡이 없습니다.");
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
			System.out.println("다음곡이 없습니다.");
		
		else
			print();
	}
	
	
	void print()
	{
		System.out.println("현재:"+now);
		System.out.println("이전:"+back);
		System.out.println("앞으로:"+next);
	}
}

public class StackMP3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {
				"뉴페이스_싸이",
				"봉선화연정_현철",
				"진진자라_태진아",
				"가시나_선미",
				"멸공의횃불_MC몽군대가라",
				"전선을 간다_발치몽",
				"남행열차_김수희",
				"좋니_윤종신",
				"밤편지_아이유",
				"시차_우원재",
		};
		
		StackMP3 mm = new StackMP3(arr);
		
		mm.goNext();
		mm.goTrack(7);
		mm.goTrack(-2);
		
		
	}

}

