package homeWork_20170924;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Client2 
{

	public static void main(String[] args) throws Exception 
	{		
		SocketChannel socket = SocketChannel.open();
		socket.configureBlocking(true);
		
		socket.connect(new InetSocketAddress("192.168.56.1", 7778));
		System.out.println("2���� ���Ἲ��");
		
		Charset charset = Charset.forName("UTF-8");
		
		
		
		
		while(true)
		{
			
			
			System.out.println(((InetSocketAddress)socket.getRemoteAddress()).getHostName()+" ����");
			ByteBuffer buf = charset.encode("�ȳ� ��Ŭ���̾�Ʈ2 ��� ��");
			socket.write(buf);
			
			buf = ByteBuffer.allocate(1024);
			socket.read(buf);
			buf.flip();
			String data = charset.decode(buf).toString();
			System.out.println("[2�����ڷ�]"+data);
			
		}
	}

}
