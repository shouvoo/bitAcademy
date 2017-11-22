package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day02/test06")
public class Test06 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		String msg = request.getParameter("msg");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("	<body>");
		sb.append("		<h1>");
		sb.append("			msg : " + msg);
		sb.append("		</h1>");
		sb.append("	</body>");
		sb.append("</html>");
		
		out.write(sb.toString());
		
		out.close();
	}
}
