package homeWork_20170924;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Server 
{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc;
		ServerSocketChannel server = ServerSocketChannel.open();
		server.configureBlocking(true);
		server.bind(new InetSocketAddress(7778));
		
		Charset charset = Charset.forName("UTF-8");
		
		
		System.out.println("서버시작");
		
		while(true)
		{
			SocketChannel client = server.accept();

			ByteBuffer buf = ByteBuffer.allocate(100);
			
			System.out.println(((InetSocketAddress)client.getRemoteAddress()).getHostName()+" 접속");

			
			/*데이터 읽어오기*/
			client.read(buf);
			buf.flip();
			String data = charset.decode(buf).toString();
			System.out.println("[Server 수신자료]"+data);
			
			/*데이터 보내기*/
			sc = new Scanner(System.in);
			buf = charset.encode(sc.nextLine());
			client.write(buf);

		}
	}
 
}
