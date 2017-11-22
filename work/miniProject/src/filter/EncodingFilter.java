// 필터 클래스로 선언
// 모든 페이지 호출에 동작되도록 web.xml 파일에 정보 등록
// - 등록시 논리적 이름은 encoding
package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	private String charset;
	
	public void destroy() {}
	
	public void init(FilterConfig filterConfig) throws ServletException {
		charset = filterConfig.getInitParameter("charset");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		request.setCharacterEncoding(charset);
		chain.doFilter(request, response);
	}

}













