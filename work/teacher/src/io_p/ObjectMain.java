package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

interface ABCD
{
	void execute();
}

class AAA implements Serializable, ABCD{
	
	int a = 10;
	int b =20;
	int c =30;
	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
}

class BBB implements Serializable, ABCD{
	
	String a;
	String b;
	
	@Override
	public String toString() {
		return "BBB [a=" + a + ", b=" + b + "]";
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if(a.equals("¿øÁØ¾Æ"))
			System.out.println("¿øÁØÀÌ ¸Þ·Õ");
		
		System.out.println(b);
	}
}

class Cover implements Serializable{
	
	String kind;
	
	Object data;
}

public class ObjectMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("fff/qqq.txt");
		ObjectOutputStream dos = new ObjectOutputStream(fos);
		
		
		
		ArrayList list = new ArrayList<>();
		list.add("aaa");
		list.add("vvv");
		list.add("ccccc");
		list.add("ddd");
		list.add(new int [] {11,22,33,44});
		
		dos.writeInt(123);
		dos.writeBoolean(true);
		dos.writeUTF("¼ºÈñ¾ß ¾È³ç?");
		dos.writeObject(list);
		
		Cover cc= new Cover();
		cc.kind="AAA";
		cc.data = new AAA();
		dos.writeObject(cc);
		
		cc= new Cover();
		cc.kind="BBB";
		BBB bb= new BBB();
		
		bb.a = "¼ºÈñ¾Æ";
		bb.b = "ÆíÀÇÁ¡Àº Èûµé¾î";
		cc.data =bb; 
		
		dos.writeObject(cc);
		
		dos.close();
		fos.close();
	}

}

