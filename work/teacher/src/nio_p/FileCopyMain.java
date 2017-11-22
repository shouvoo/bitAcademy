package nio_p;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileChannel fr = FileChannel.open(
			Paths.get("rec/당구.jpg"), StandardOpenOption.READ);
		
		FileChannel fw = FileChannel.open(
				Paths.get("fff/당구.jpg"), 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		
		ByteBuffer buf = ByteBuffer.allocate(1024);

		while(fr.read(buf)!=-1)
		{	
			buf.flip();
			fw.write(buf);	
			buf.clear();
		}
		
		fr.close();
		fw.close();
	}

}
