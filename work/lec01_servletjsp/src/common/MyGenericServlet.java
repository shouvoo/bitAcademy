package common;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet
{
	@Override
	public void destroy() {}

	@Override
	public ServletConfig getServletConfig() {return null;}

	@Override
	public String getServletInfo() {return null;}
	

	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		System.out.println("Generic init 호출됨");
	}

	public abstract void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException;
}
