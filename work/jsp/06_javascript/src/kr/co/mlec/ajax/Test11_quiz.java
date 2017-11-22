package kr.co.mlec.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.ModelAndView;

import com.google.gson.Gson;

import kr.co.mlec.lotto.LottoDomain;
import kr.co.mlec.lotto.LottoMapper;

@WebServlet("/08_ajax/test11_quiz")
public class Test11_quiz extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id = request.getParameter("id");
		QuizMapper qm = new QuizMapper();
		String result = qm.read(id);	
		System.out.println(result);
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
		
	}
}
