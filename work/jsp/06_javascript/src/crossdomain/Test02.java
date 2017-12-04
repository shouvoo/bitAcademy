package crossdomain;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/crossdomain/test02")
public class Test02 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");

		URL u = new URL("http://localhost:9080/lec06_apiserver/crossdomain/test02");
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(u.openStream());
		while(sc.hasNextLine())
		{
			sb.append(sc.nextLine());
		}
		
		PrintWriter out = response.getWriter();
		out.println(sb.toString());
		out.close();
	}
}
