package io_p;

import java.io.File;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ff = new File("fff/aaa.txt");
		
		System.out.println(ff.exists());
		
		System.out.println(ff.getName());
		System.out.println(ff.getPath());
		System.out.println(ff.getParent());
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());
		System.out.println(ff.isHidden());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.length());
		System.out.println(new Date(ff.lastModified()));
		System.out.println(ff.getAbsolutePath());
		
		File [] list = new File("fff").listFiles();
		
		for (File f : list) {
			System.out.println(f.getName());
		}
		
		File newFF = new File("fff/ttt/yyy/uuu");
		newFF.mkdirs();
		
		File delFF = new File("fff/bbb.txt");
		
		delFF.delete();
	}

}
