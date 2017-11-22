package nio_p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyMain 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		FileChannel fr = FileChannel.open(Paths.get("fff/hd.jpg"), StandardOpenOption.READ);
		
		FileChannel fw = FileChannel.open(Paths.get("rec/hd.jpg"), StandardOpenOption.CREATE,
																	StandardOpenOption.WRITE);
		
		ByteBuffer buf = ByteBuffer.allocate(2);
		System.out.println(fr.size());
		
		/*while(true)
		{
			if(fr.read(buf) == -1)
			{
				break;
			}
			buf.flip();
			fw.write(buf);
			
			buf.clear();
		}*/
		System.out.println("파일 복사 시작");
		while(fr.read(buf) != -1)
		{
			buf.flip();
			buf.clear();
		}
		System.out.println("파일 복사 완료");
		fw.close();
		fr.close();
	}

}
