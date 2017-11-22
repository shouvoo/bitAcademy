package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("fff/ddd.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(123456);
			dos.writeDouble(123.456);
			dos.writeBoolean(true);
			dos.writeLong(12345678912345L);
			dos.writeUTF("fjewojfpewjfpew");
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
