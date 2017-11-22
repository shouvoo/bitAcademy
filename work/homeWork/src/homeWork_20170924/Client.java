package homeWork_20170924;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Client 
{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc;
		SocketChannel socket = SocketChannel.open();
		socket.configureBlocking(true);
		socket.connect(new InetSocketAddress("192.168.56.1", 7778));
		System.out.println("서버 연결성공");
		
		Charset charset = Charset.forName("UTF-8");
		
		while(true)
		{
			System.out.println(((InetSocketAddress)socket.getRemoteAddress()).getHostName()+" 접속");
			/*데이터 보내기*/
			sc = new Scanner(System.in);
			ByteBuffer buf = charset.encode(sc.nextLine());
			socket.write(buf);

			
			/*데이터 읽어오기*/
			buf = ByteBuffer.allocate(100);
			socket.read(buf);
			buf.flip();
			String data = charset.decode(buf).toString();
			System.out.println("[Client 수신자료]"+data);
			
			
			
		}
		
	}

}
