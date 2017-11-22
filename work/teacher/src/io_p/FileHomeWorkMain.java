package io_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;

class FileHomeWork{
	
	String oriDir;
	
	HashMap<String, String> map = new HashMap<>();

	public FileHomeWork(String oriDir) {
		super();
		this.oriDir = oriDir;
		
		map.put("img", "bmp,jpg,gif,png");
		map.put("music", "mp3,wma,wav");
		map.put("doc", "doc,hwp,ppt,xls,pptx,xlsx,docx");
		map.put("txt", "txt");

		directory(new File(oriDir));
	}
	
	
	void directory(File fList)
	{
		
		for (File ff:fList.listFiles()) {
		
			if(ff.isDirectory())
			{
				directory(ff);
			}else {
				
				int pos = ff.getName().lastIndexOf('.');
				
				String fname = ff.getName().substring(0,pos);
				String ext = ff.getName().substring(pos+1);
				
				String path = filePath(ff, ext);
				
				fileSave(path, ff, fname, ext);
			}
		}
		
		
		
	}
	
	void fileSave(String path, File ff,String fname, String ext)
	{

		File upfile = new File(path+ff.getName());
		if(upfile.exists())
		{
			int i =0;
			
			upfile = new File(path+fname+"_"+i+"."+ext);
			while(upfile.exists())
			{
				i++;
				upfile = new File(path+fname+"_"+i+"."+ext);
			}
			
		}
		
		
		try {
			FileOutputStream fos = new FileOutputStream(upfile);
			FileInputStream fis = new FileInputStream(ff);
			
			byte [] buf = new byte[1024];
			
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				
				fos.write(buf, 0, len);
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	String filePath(File ff, String ext)
	{
		String path="new/";
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			
			if(map.get(key).contains(ext))
				path += key+"/";
		}
		
		if(path.equals("new/"))
			path+= "etc/";

		if(ext.equals("txt"))
		{
			path+=txtPath(ff);
		}
		System.out.println(ff.getName()+":"+path);
		
		new File(path).mkdirs();
		
		
		return path;
	}
	
	String txtPath(File ff)
	{
		String res ="";
		String str ="";
		
		try {
			FileInputStream fis = new FileInputStream(ff);
			
			byte [] buf = new byte[1024];
			
			while(fis.available()>0)
			{
				int len = fis.read(buf);
				
				str = new String(buf, 0, len);
			}
			
			String [] sss = str.split("\r\n");
			
			res = sss[1]+"/"+sss[0]+"/";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	
}
public class FileHomeWorkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileHomeWork("ff");
	}

}
