package forwardSite;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

public class Inc 
{
	public Inc(HttpServletRequest request)
	{
		String menu = "info";

		String uri = request.getRequestURI();
		String con = request.getContextPath();
		
		String [] arr = uri.substring(con.length() + 1, uri.length() - 4).split("/");
		
		System.out.println(Arrays.toString(arr));
		
		/*if(request.getParameter("menu") != null)
		{
			menu = request.getParameter("menu");
		}*/
		
		menu = arr[1];
		request.setAttribute("menuUrl", "menu/" + menu + ".jsp");

		
		String main = arr[2];
		/*if(request.getParameter("main") != null)
		{
			main = request.getParameter("main");
		}*/
		request.setAttribute("mainUrl", "main/" + menu + "/" + main + ".jsp");
	}
}
