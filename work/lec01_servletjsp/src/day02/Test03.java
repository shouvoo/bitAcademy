//tcp 서버를 이용한 http 통신 이해하기
//요청 방식 처리

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03 
{
	public static void main(String[] args) 
	{
		try 
		{
			ServerSocket ss = new ServerSocket(10001);
			System.out.println("서버구동 중!!!");
			
			while(true)
			{
				Socket s = ss.accept();
				//연결되  클라이언트가 보내준 정보를 읽기 위해
				//InputStream in = s.getInputStream();
				
				//InputStreamReader isr = new InputStreamReader(s.getInputStream());
				//줄단위 입력을 위해서
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("시작라인 정보 출력하기" + br.readLine());
				System.out.println("헤더정보 풀력하기");
				while(true)
				{
					String line = br.readLine();
					
					if(line.equals(""))
					{
						break;
					}
					System.out.println(line);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
