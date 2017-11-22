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
			System.out.println("존재하지 않는 곡으로 이동했습니다!" );
			return;
		}
		skip = true;
		System.out.println(skipId + "번 곡으로 이동했습니다!" );
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
			System.out.println("이전 곡이 없습니다!");
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
			System.out.println("다음 곡이 없습니다!");
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
		System.out.println("현재 트랙 " + (currentId + 1) + " : " + singerInfo.get(currentId) + " : " + Info.get(currentId) + " : " + now);
		System.out.println("이전 : " + prev);
		System.out.println("앞으로 : " + next);
		System.out.println("---------------------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [][] songList = {{"1번 노래", "가수1", "정보1"}, {"2번 노래", "가수2", "정보2"}, {"3번 노래", "가수3", "정보3"}, 
				{"4번 노래", "가수4", "정보4"}, {"5번 노래", "가수5", "정보5"}, {"6번 노래", "가수6", "정보6"}, {"7번 노래", "가수7", "정보7"}};
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
