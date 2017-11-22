package io_p;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class AAA implements Serializable
{
	int a = 10;
	int b = 20;
	int c = 30;
	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}

public class objectMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("fff/qqq.txt");
			ObjectOutputStream dos = new ObjectOutputStream(fos);
			
			AAA aa = new AAA();
			
			ArrayList list = new ArrayList();
			list.add("aaaaa");
			list.add("bbbbb");
			list.add("cccccccc");
			list.add("ddddd");
			list.add(new int [] {1,2,3,4,5,6});

			
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeUTF("¼ºÈñ¾ß ¾È³ç?");
			dos.writeObject(list);
			dos.writeObject(aa);
			
			
			dos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
