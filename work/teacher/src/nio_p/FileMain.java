package nio_p;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path p1 = Paths.get("fff");
		
		System.out.println(p1);
		System.out.println(Files.isDirectory(p1));
		System.out.println(Files.isRegularFile(p1));
		
		DirectoryStream<Path> ds = Files.newDirectoryStream(p1);
		
		for (Path path : ds) {
			String res = ""+path.getFileName();
			if(!Files.isDirectory(path))
				res+=", "+Files.size(path);
			System.out.println(res);
		}
		System.out.println("------------------------");
		
		
		
	}

}
