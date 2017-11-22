package collection;

import java.util.Stack;

public class StackURL 
{
	static Stack back = new Stack();
	static Stack next = new Stack();
	
	static String now = null;
	
	static void goUrl(String url)
	{
		if(now != null) back.add(now);
		now = url;
		next.clear();
		System.out.println("--- goUrl(" + url + ")");
		print();
	}
	
	static void print()
	{
		System.out.println("���� : " + now);
		System.out.println("���� : " + back);
		System.out.println("������ : " + next);
	}
	
	static void goBack()
	{
		System.out.println("--- goBack()");
		if(back.empty()) 
		{
			System.out.println("���� �������� �����ϴ�!");
			return;
		}
		next.add(now);
		now = (String)back.pop();
		print();
	}
	
	static void goNext()
	{
		System.out.println("--- goNext()");
		if(next.empty()) 
		{
			System.out.println("���� �������� �����ϴ�!");
			return;
		}
		
		back.add(now);
		now = (String)next.pop();
		print();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		goUrl("1����");
		goUrl("2���̹�");
		goUrl("3�Ķ�");
		goUrl("4����");
		
		goBack();
		goBack();
		goBack();
		goBack();
		
		goNext();
		goNext();
		goUrl("����");
		/*goNext();
		goNext();*/
	}

}



































