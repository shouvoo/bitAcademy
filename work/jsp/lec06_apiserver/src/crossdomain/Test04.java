
package crossdomain;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/crossdomain/test04")
public class Test04 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");
		
		String callBack = request.getParameter("callback");
		
		PrintWriter out = response.getWriter();
		out.println(callBack + "('<h1>Ajax crossDomain test04 응답 결과</h1>')");
		out.close();
	}
}
