package nio_p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

class ChatSender extends Thread{
	SocketChannel client;
	String name;

	public ChatSender(SocketChannel client) {
		super();
		this.client = client;
		try {
			name = "["+InetAddress.getLocalHost().getHostAddress()+"]";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Charset ch = Charset.forName("UTF-8");
		Scanner sc = new Scanner(System.in);
		while(true) {
			ByteBuffer buf = ch.encode(name+sc.nextLine());
			try {
				client.write(buf);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	
}

class ChatReciever extends Thread{
	SocketChannel client;

	public ChatReciever(SocketChannel client) {
		super();
		this.client = client;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Charset ch = Charset.forName("UTF-8");
		
		while(true) {
			
			try {
				ByteBuffer buf = ByteBuffer.allocate(1024);
				client.read(buf);
				buf.flip();
				System.out.println(ch.decode(buf).toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocketChannel server = ServerSocketChannel.open();
			
			server.configureBlocking(true);
			server.bind(new InetSocketAddress(7777));
			
			SocketChannel client = server.accept();
			
			new ChatSender(client).start();
			new ChatReciever(client).start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
