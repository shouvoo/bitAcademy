/*
* - 필터 만들기
* Filter 인터페이스 상속
* 
* 필터를 특정 서블릿 또는 특정 페이지와 연결
* web.xml 파일 이용해서 등록하기
*/

package day07;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter 
{
	public void destroy(){}
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("My Filter init 실행됱!!");
		String appName = filterConfig.getInitParameter("app_name");
		String port = filterConfig.getInitParameter("server_port");
		System.out.println(appName);
		System.out.println(port);
	}
	
	//실제 처러해야할 일을 정의
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		System.out.println("doFilter 호출됨");
		//다른 필터 또는 서블릿 호출
		
		//고객의 요구사항
		/*어떤 ip 에서 어떤 페이지를 호출하는지 확인이 필요
		페이지가 처리되는 시간을 관리*/
		String ip = request.getRemoteAddr();
		
		HttpServletRequest hreq = (HttpServletRequest)request;
		String uri = hreq.getRequestURI();
		System.out.println("사용자 ip : " + ip);
		System.out.println("호출페이지 uri : " + uri);
		
		long s = System.currentTimeMillis();		
		chain.doFilter(request, response); //코드가 없으면 페이지를 호출하지 않음!!
		double time = System.currentTimeMillis() - s / 1000d;
		System.out.println("실행시간 : " + time);
	}

	
}








































