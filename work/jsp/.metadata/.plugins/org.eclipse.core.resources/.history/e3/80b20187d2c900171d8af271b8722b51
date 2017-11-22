package ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/08_ajax/test05")
public class Test05 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json; charset=utf-8");
		
		List<AjaxVO> list = new ArrayList<>();
		for(int i = 0; i < 5; i++)
		{
			AjaxVO vo = new AjaxVO();
			vo.setName("길수" + i);
			vo.setEmail("gilsu" + i + "@a.com");
			vo.setAge(20 + i);

			list.add(vo);
		}

		PrintWriter out = response.getWriter();
		out.println(new Gson().toJson(list));
		out.close();
	}
}
