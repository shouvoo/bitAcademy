package nio_p;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.util.List;

public class WatchServiceMain {

	public static void main(String[] args) throws Exception {
		
		Path p1 = Paths.get("fff");

		
		while(true) 
		{
			WatchService service=  FileSystems.getDefault().newWatchService();
			
			p1.register(service, 
					StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY
					);
			WatchKey wk =service.take();
			
			List<WatchEvent<?>> list = wk.pollEvents();
			
			for (WatchEvent<?> ww : list) 
			{
				Kind kind = ww.kind();
				
				Path path = (Path)ww.context();
				
				if(kind==StandardWatchEventKinds.ENTRY_CREATE) 
				{
					System.out.println("颇老积己 : "+path.getFileName());
				}
				
				if(kind==StandardWatchEventKinds.ENTRY_DELETE) 
				{
					System.out.println("颇老昏力 : "+path.getFileName());
				}
				
				if(kind==StandardWatchEventKinds.ENTRY_MODIFY) 
				{
					System.out.println("颇老函版 : "+path.getFileName());
				}
				System.out.println("if end");
			}
			System.out.println("for end");
		}
		
	}

}
