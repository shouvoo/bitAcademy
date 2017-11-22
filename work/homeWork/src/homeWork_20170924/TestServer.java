package homeWork_20170924;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;


public class TestServer 
{

	public static void main(String[] args) throws Exception 
	{
	
	// ServerSocket은 Concrete Class, ServerSokcetChannel은 Abstract Class
		Scanner scanner;
		 ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		serverSocketChannel.configureBlocking(true);
		serverSocketChannel.bind(new InetSocketAddress(7778));
		Charset charset = Charset.forName("UTF-8");
		while (true)
		{
			SocketChannel socketChannel = serverSocketChannel.accept();
			InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
			System.out.println("[Client 접속] HostName = " + isa.getHostName() + " Port = " + isa.getPort()
			+ " Client IPAddress = " + isa.getAddress());
	
			ByteBuffer byteBuffer = ByteBuffer.allocate(100);
			socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String data = charset.decode(byteBuffer).toString();
			System.out.println("[Client] : " + data);
			System.out.print("[Server] : ");
			
			scanner = new Scanner(System.in);
			byteBuffer = charset.encode(scanner.nextLine());
			socketChannel.write(byteBuffer);
		}

	}
}

