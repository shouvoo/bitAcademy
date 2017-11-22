package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.MemberDomain;


public class AuthFilter implements Filter 
{
	//로그인이 필요없는 페이지 주소를 담는다
	List<String> list = new ArrayList<>();
	List<String> folderList = new ArrayList<>();

	public void destroy() {}
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		String pages = filterConfig.getInitParameter("fixFreePages");
		String[] arr = pages.split(";");
		for (String page : arr)
		{
			list.add(page.trim());
		}
		
		String folders = filterConfig.getInitParameter("fixFreeFolder");
		String[] fArr = folders.split(";");
		for (String folder : fArr)
		{
			folderList.add(folder.trim());
		}
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		HttpServletRequest hRequest = (HttpServletRequest)request;		
		HttpServletResponse hResponse = (HttpServletResponse)response;

		
		//웹 어플리케이션 path 경로
		String contextPath = hRequest.getContextPath();
		
		//사용자가 요청한 페이지 주소 확인
		String uri = hRequest.getRequestURI();
		uri = uri.substring(contextPath.length());
		System.out.println(uri);
		boolean isRedirect = false;
		
		
		
		if(list.indexOf(uri) == -1)
		{
			HttpSession session = hRequest.getSession();
			MemberDomain user = (MemberDomain)session.getAttribute("user");
			//로그인이 되어있지 않은 경우
			if(user == null) isRedirect = true;	
		}

		for (String folder : folderList) 
		{
			if(uri.startsWith(folder))
			{
				isRedirect = false;
				break;
			}
		}
			
		System.out.println(uri);
		System.out.println(isRedirect);
		
		if(isRedirect)
		{
			hResponse.sendRedirect(contextPath + "/member/loginform");
		} else 
		{
			chain.doFilter(request, response);
		}
	
		
		
		/*if(list.indexOf(uri) == -1)
		{
			HttpSession session = hRequest.getSession();
			MemberDomain user = (MemberDomain)session.getAttribute("user");
			//로그인이 되어있지 않은 경우
			if(user == null) isRedirect = true;	
		}
	
		if(isRedirect)
		{
			hResponse.sendRedirect(contextPath + "/member/loginform");
		} else 
		{
			chain.doFilter(request, response);
		}*/

	}
	
}
