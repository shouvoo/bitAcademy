package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue qq = new LinkedList();
		
		st.add(1);
		st.add(2);
		st.add(3);
		
		qq.add(1);
		qq.add(2);
		qq.add(3);
		
		System.out.println(st);
		System.out.println(qq);
		//pop poll �� ������ �����ϴ� ���� �ƴ϶� ������ �迭��ü���� ������ ���� �� ������ �迭 ���̴� 0
		//stack �� �� ���� �������� ���´� 1 2 3  -> 3 2 1 
		//queue �� �� ������� ���´� 1 2 3 -> 1 2 3 
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
		System.out.println("`````````````````````````````````````````````````````````");
		while(!qq.isEmpty())
		{
			System.out.println(qq.poll());
		}
		
	}

}


























