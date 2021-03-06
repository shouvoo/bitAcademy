package collection_p;

import java.util.Stack;

public class StackURL {

	static Stack back = new Stack();
	static Stack next = new Stack();
	
	static String now=null;
	
	static void goUrl(String url)
	{
		if(now!=null)
			back.add(now);
		
		now = url;
		
		next.clear();
		
		System.out.println("------------goUrl("+url+")");
		
		print();
	}
	
	
	static void goBack()
	{
		System.out.println("------------goBack()");
		
		if(back.empty())
		{
			System.out.println("이전 페이지가 없습니다.");
			return;
		}	
			
		next.add(now);
		
		now = (String)back.pop();
		
		
		
		print();
	}
	
	static void goNext()
	{
		System.out.println("------------goNext()");
		
		if(next.empty())
		{
			System.out.println("다음 페이지가 없습니다.");
			return;
		}	
			
		back.add(now);
		
		now = (String)next.pop();
		
		
		
		print();
	}
	
	
	static void print()
	{
		System.out.println("현재:"+now);
		System.out.println("이전:"+back);
		System.out.println("앞으로:"+next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		goUrl("다움");
		goUrl("네이버");
		goUrl("파란");
		goUrl("빨간");
		goBack();
		goBack();
		goBack();
		goBack();
		goNext();
		goNext();
		goUrl("구글");
		/*goNext();
		goNext();
		goNext();*/
	}

}

