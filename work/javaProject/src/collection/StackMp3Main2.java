package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackMp3Main2 
{
	static Stack prev = new Stack();  
	static Stack next = new Stack(); 
	static List singerInfo = new ArrayList();
	static List Info = new ArrayList();
	
	static String now = null;
	static int currentId = 0;
	static boolean skip = false;
	
	static int total;
	
	static void addSong(String [][] song)
	{
		total = song.length;
		for (int i = song.length - 1; i > 0; i--) 
		{
			next.add(song[i][0]);
			singerInfo.add(song[(song.length - 1) - i][1]);
			Info.add(song[(song.length - 1) - i][2]);
		}
		now = song[0][0];
	}
	
	static void init()
	{
		print();
	}
	
	static void skip(int skipId)
	{
		
		if(total < skipId || skipId <= 0) 
		{
			System.out.println("�������� �ʴ� ������ �̵��߽��ϴ�!" );
			return;
		}
		skip = true;
		System.out.println(skipId + "�� ������ �̵��߽��ϴ�!" );
		if(currentId < skipId)
		{
			for (int i = currentId; i < skipId; i++) 
			{
				nextSong();
			}
		} else 
		{
			for (int i = currentId + 1; i > skipId; i--) 
			{
				prevSong();
			}
		}
		
		print();
		skip = false;
	}
	
	static void prevSong()
	{
		if(prev.empty()) 
		{
			System.out.println("���� ���� �����ϴ�!");
			return;
		}
		currentId--;
		next.add(now);
		now = (String)prev.pop();
		if(!skip) print();
	}
	
	static void nextSong()
	{
		if(next.empty()) 
		{
			System.out.println("���� ���� �����ϴ�!");
			return;
		}
		currentId++;
		prev.add(now);
		now = (String)next.pop();
		if(!skip) print();
	}
	
	static void print()
	{
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("���� Ʈ�� " + (currentId + 1) + " : " + singerInfo.get(currentId) + " : " + Info.get(currentId) + " : " + now);
		System.out.println("���� : " + prev);
		System.out.println("������ : " + next);
		System.out.println("---------------------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [][] songList = {{"1�� �뷡", "����1", "����1"}, {"2�� �뷡", "����2", "����2"}, {"3�� �뷡", "����3", "����3"}, 
				{"4�� �뷡", "����4", "����4"}, {"5�� �뷡", "����5", "����5"}, {"6�� �뷡", "����6", "����6"}, {"7�� �뷡", "����7", "����7"}};
		addSong(songList);
		init();
		
		//skip(3);
		
		nextSong();
		nextSong();
		nextSong();
		nextSong();
		nextSong();
		
		prevSong();
		prevSong();
		prevSong();
		prevSong();
		
		/*skip(3);
		skip(5);
		skip(1);*/
		
		skip(0);
		
		
	}

}
