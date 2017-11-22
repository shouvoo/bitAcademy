package day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/day02/test05")
public class Test05 extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		String path = "C:/!SHOU/test.jpg";
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(path)
		);
		
		response.setContentType("image/jpg");
		
		//OutputStream out = response.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
		
		while(true) 
		{
			int ch = bis.read();
			if(ch == -1) break;
			
			//System.out.print((char)ch);
			bos.write(ch);
		}
		
		bos.close();
		bis.close();
	}
	
}
