package nio_p;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class TCPClientMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SocketChannel socket = SocketChannel.open();
		socket.configureBlocking(true);
		
		socket.connect(new InetSocketAddress("192.168.0.29", 7777));
		System.out.println("서버 연결성공");
		
		Charset charset = Charset.forName("UTF-8");
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		socket.read(buf);
		
		buf.flip();
		String data = charset.decode(buf).toString();
		System.out.println("[수신자료]"+data);
		
		socket.close();
		
	}

}
