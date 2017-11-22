package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fos = new FileInputStream("fff/qqq.txt");
		ObjectInputStream dos = new ObjectInputStream(fos);

		System.out.println(dos.readInt());
		System.out.println(dos.readBoolean());
		System.out.println(dos.readUTF());
		
		
		System.out.println(dos.readObject());
		
		ABCD abcd;
		Cover cc = (Cover)dos.readObject();
		System.out.println(cc.data);
		chk(cc);
		abcd = (ABCD)cc.data;
		abcd.execute();
		
		
		cc = (Cover)dos.readObject();
		System.out.println(cc.data);
		chk(cc);
		abcd = (ABCD)cc.data;
		abcd.execute();

		dos.close();
		fos.close();

	}
	
	static void chk(Cover cc)
	{
		switch(cc.kind)
		{
			case "AAA":
				
				System.out.println(((AAA)cc.data).c);
				break;
			case "BBB":
				
				System.out.println(((BBB)cc.data).b);
		}
	}

}
