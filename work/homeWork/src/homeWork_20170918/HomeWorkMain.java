package homeWork_20170918;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;


class CopyFile
{
	int streamByte;
	TypeCheck tc;
	MakeDir md;
	String fosPath = "";
	String str = "";
	int overlapCnt = 1;
	String overlap = "(" + overlapCnt + ")";
	File matchFile;
	
	public void overLapName()
	{
		
	}
	
	public CopyFile(MakeDir md) 
	{
		tc = md.tc;
		this.md = md;
		try 
		{			
			streamByte = (tc.fileType.equals("txt")) ? 2 : 10;
			fosPath = md.dirMap.get(tc.fileType) + "/" + tc.fileName + "." + tc.fileType;
			matchFile = new File(fosPath);
	
			if(matchFile.exists()) 
			{
				if(tc.fileName.lastIndexOf("(") == -1) overlapCnt = 1;
				else overlapCnt = Integer.parseInt(tc.fileName.charAt(tc.fileName.lastIndexOf("(") + 1) + "") + 1;
			}
			else  
			{
				overlap = "";
			}
			fosPath = md.dirMap.get(tc.fileType) + "/" + tc.fileName + overlap + "." + tc.fileType;
			
			FileInputStream fis = new FileInputStream(tc.fileFullName);
			FileOutputStream fos = new FileOutputStream(fosPath);
			
			byte [] buf = new byte[streamByte];
			
			
			while(fis.available() > 0)
			{
				int len = fis.read(buf);
				if(streamByte == 2) str += new String(buf, 0, len);
				else fos.write(buf, 0, len);
			}
			
			if(streamByte == 2) 
			{
				byte [] writeArr = str.getBytes();
				fos.write(writeArr);
			} 
				
			print();
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print()
	{
		String str = tc.original + " 폴더 에서" + md.dirMap.get(tc.fileType) + " 폴더로"
	             + tc.fileName + overlap + "." + tc.fileType + " 을(를) 이동 합니다";
		System.out.println(str);
	}
}

class MakeDir
{
	TypeCheck tc;
	String imagePath = "media/image";
	String musicPath = "media/music";
	String txtPath = "media/txt";
	File file;
	
	TreeMap<String, String> dirMap = new TreeMap<>();

	public MakeDir(TypeCheck tc) 
	{
		setDirMap();
		this.tc = tc;
		file = new File(dirMap.get(tc.fileType));
		
		if(!file.exists()) 
		{
			print();
			file.mkdirs();
		}
		
		new CopyFile(this);
	}
	
	public void print()
	{
		System.out.println("========================================");
		System.out.println("폴더생성 : " + dirMap.get(tc.fileType));
		System.out.println();
	}
	
	private void setDirMap()
	{
		dirMap.put("png", imagePath);
		dirMap.put("gif", imagePath);
		dirMap.put("jpg", imagePath);
		dirMap.put("bmp", imagePath);
		dirMap.put("mp3", musicPath);
		dirMap.put("wav", musicPath);
		dirMap.put("wma", musicPath);
		dirMap.put("txt", txtPath);
	}
}

class TypeCheck
{
	String fileType = "";
	String fileFullName = "";
	String fileName = "";
	String original = "";

	public TypeCheck() 
	{
		
	}	
	
	TypeCheck check(File file) 
	{
		original = file.getParent();
		this.fileFullName = file.getPath();
		this.fileName = file.getName().substring(0, file.getName().lastIndexOf("."));
		fileType = fileFullName.substring(this.fileFullName.lastIndexOf(".") + 1, 
				                          this.fileFullName.length());
		return this;
	}	
}

class CheckChildDir
{
	File [] searchFile;
	ArrayList<File> fileList;
	
	
	public CheckChildDir() 
	{
		
	}
	
	ArrayList<File> init()
	{
		searchFile = new File("media/original").listFiles();
		fileList = new ArrayList<>();
		fileList.add(new File("media/original"));
		searchFolder(searchFile);
		return fileList;
	}
	
	public void searchFolder(File [] searchFile)
	{
		for (File file : searchFile) 
		{
			if(file.isDirectory()) 
			{
				fileList.add(file);
				searchFolder(file.listFiles());
			}
		}
	}
}

public class HomeWorkMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		ArrayList<File> fileList = new CheckChildDir().init();
		
		for (File file : fileList) 
		{
			for (File f : file.listFiles()) 
			{
				if(!f.isDirectory())
				{
					new MakeDir(new TypeCheck().check(f));
				}
			}
			
		}

	}

}































