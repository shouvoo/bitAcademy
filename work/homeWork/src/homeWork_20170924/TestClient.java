package homeWork_20170924;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;


public class TestClient 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner;
		 SocketChannel socketChannel = SocketChannel.open();
		socketChannel.configureBlocking(true);
		System.out.println("[Server ���� ��û��...]");
		socketChannel.connect(new InetSocketAddress("192.168.56.1", 7778));
		System.out.println("[Server ����]");
		Charset charset = Charset.forName("UTF-8");
		
		while (true) 
		{
			System.out.print("[Client] : ");
			scanner = new Scanner(System.in);
			ByteBuffer byteBuffer = charset.encode(scanner.nextLine());
			socketChannel.write(byteBuffer);
			
			
			
			byteBuffer = ByteBuffer.allocate(100);
			socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String data = charset.decode(byteBuffer).toString();
			System.out.println("[Server] : " + data);
		}

/*	
		if (socketChannel.isOpen()) 
		{
			try 
			{
				socketChannel.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}*/
	}
}

