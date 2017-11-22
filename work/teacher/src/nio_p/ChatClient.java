package nio_p;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			SocketChannel socket = SocketChannel.open();
			socket.configureBlocking(true);
			socket.connect(new InetSocketAddress("192.168.0.29", 7777));
			
			new ChatSender(socket).start();
			new ChatReciever(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
