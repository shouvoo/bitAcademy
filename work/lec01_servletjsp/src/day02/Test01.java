package day02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import common.MyGenericServlet;

@WebServlet("/day02/test01")
public class Test01 extends GenericServlet
{
	
	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		System.out.println("Test01 init 호출됨");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Test01 service 호출됨");
	}
}























