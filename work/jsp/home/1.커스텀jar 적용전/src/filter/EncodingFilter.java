package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter
{
	private String charset;
	
	public void destroy() {}
	
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		System.out.println("init!!!!");
		charset = filterConfig.getInitParameter("charset");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		System.out.println("doFilter!!!!");
		request.setCharacterEncoding(charset);
		chain.doFilter(request, response);
	}
	
}
