package nio_p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Attach2
{
	Path path;
	AsynchronousFileChannel ch;
	ByteBuffer buf;

	public Attach2(Path path, AsynchronousFileChannel ch, ByteBuffer buf) {
		super();
		this.path = path;
		this.ch = ch;
		this.buf = buf;
	}

	@Override
	public String toString() {
		return "Attach2 [path=" + path + ", ch=" + ch + ", buf=" + buf + "]";
	}

	
}

class MyHandler2 implements CompletionHandler<Integer, Attach2>
{
	
	
	public void completed(Integer result, Attach2 attachment) 
	{
		//System.out.println(result + " : " + attachment);
		attachment.buf.flip();
		Charset chset = Charset.defaultCharset();
		String data = chset.decode(attachment.buf).toString();
		
		System.out.println(attachment.path.getFileName() + " : " + data + " : " + Thread.currentThread().getName());
		
		try {
			attachment.ch.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void failed(Throwable exc, Attach2 attachment) 
	{
		try {
			attachment.ch.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class AsyncFileReadMain 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		for (int i = 0; i < 10; i++) 
		{
			Path pp = Paths.get("nnn/ff" + i + ".txt");
			
			Files.createDirectories(pp.getParent());
			
			AsynchronousFileChannel ch = AsynchronousFileChannel.open(
					pp, 
					EnumSet.of(StandardOpenOption.READ), 
					service);
			
			ByteBuffer buf = ByteBuffer.allocate((int)ch.size());
			
			Attach2 attach = new Attach2(pp, ch, buf);
			
			ch.read(buf, 0, attach, new MyHandler2());
		}
		
		service.shutdown();
	}
}











































