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

class Attach
{
	Path path;
	AsynchronousFileChannel ch;
	
	public Attach(Path path, AsynchronousFileChannel ch) 
	{
		this.path = path;
		this.ch = ch;
	}

	@Override
	public String toString() {
		return "Attach [path=" + path + ", ch=" + ch + "]";
	}
	
	
}

class MyHandler implements CompletionHandler<Integer, Attach>
{
	
	
	public void completed(Integer result, Attach attachment) 
	{
		System.out.println(result + " : " + attachment + " : "+ Thread.currentThread().getName());
	}

	public void failed(Throwable exc, Attach attachment) 
	{

	}
}

public class AsyncFileMain 
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
					EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE), 
					service);
			
			Charset chset = Charset.defaultCharset();
			ByteBuffer buf = chset.encode("이제는 우리가 집에 가야 할시간");
			
			Attach attach = new Attach(pp, ch);
			
			ch.write(buf, 0, attach, new MyHandler());
			ch.close();
		}
		
		service.shutdown();
	}
}











































