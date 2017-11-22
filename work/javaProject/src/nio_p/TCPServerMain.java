package nio_p;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPServerMain 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ServerSocketChannel server = ServerSocketChannel.open();
		
		server.configureBlocking(true);
		
		server.bind(new InetSocketAddress(7777));
		
		Charset charset = Charset.forName("UTF-8");
		
		while(true)
		{
			System.out.println("��������");
			SocketChannel client = server.accept();
			System.out.println(((InetSocketAddress)client.getRemoteAddress()).getHostName() + "-����");
			ByteBuffer buf = charset.encode("�ȳ� �� ������� ��");
			client.write(buf);
		}
		
	}

}
