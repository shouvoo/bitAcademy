package lang_p;

import java.io.IOException;

public class ChamChamCham 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//참참참
		/*String [] index = {"왼쪽", "오른쪽", "종료"};
		System.out.println("추억의 게임 참참참");
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.print("\n 입력 : ");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				if(user == index.length - 1) break;
				
				int com = (int)(Math.random() * 2);
				String res = "패";
				if(com == user) res = "승";
				
				System.out.println("게이머 : " + index[user]);
				System.out.println("컴퓨터 : " + index[com]);
				System.out.println("결과 : " + res);
				
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("게임 종료");*/
		
		//가위 바위 보
		/*String [] index = {"가위", "바위", "보", "종료"};
		int [][] match = {{2, 0, 1}, {2, 1, 0}, {0, 1, 2}};
		System.out.println("가위 바위 보");
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.println("입력 \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * 3);
				
				String res = "무승부";
				
				if(user == com) res = "무승부";
				else if(user < match[user][com]) res = "승";
				else res = "패";
				
				System.out.println("게이머 : " + index[user]);
				System.out.println("컴퓨터 : " + index[com]);
				System.out.println("결과 : " + res);
				
				if(user == index.length - 1) break;
				
			} catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
		
		System.out.println("게임 종료");*/
		
		//가위 바위 보 선생님 방법
		/*String [][] res = {{"비김", "패", "승"}, {"승", "비김", "패"}, {"패", "승", "비김"}};
		String [] index = {"가위", "바위", "보", "종료"};
		
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.println("입력 \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * (index.length - 1));
				
				System.out.println("게이머 : " + index[user]);
				System.out.println("컴퓨터 : " + index[com]);
				System.out.println("결과 : " + res[user][com]);
				
				if(user == index.length - 1) break;
				
			} catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
		System.out.println("게임 종료");*/
		
		//묶찌빠
		String [][] res = {{"비김", "패", "승"}, {"승", "비김", "패"}, {"패", "승", "비김"}};
		String [] index = {"가위", "바위", "보", "종료"};
		
		try
		{
			aaa:while(true)
			{
				System.out.println("선공정하기");
				System.out.println("입력 \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * (index.length - 1));
				
				System.out.println("게이머 : " + index[user]);
				System.out.println("컴퓨터 : " + index[com]);
				System.out.println("결과 : " + res[user][com]);
				
				if(user == index.length - 1) break aaa;
			} 
		
			bbb:while(true)
			{
				
			}
		} catch(Exception e)
		{
			
		}
		
		
	}

}
