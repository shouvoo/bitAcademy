// 서블릿 클래스로 선언
// http://localhost:8080/프로젝트명/quiz/quiz01
// 파라미터 2개를 넘겨준다.
// count : 1 부터 10사이의 숫자를 입력
// type  : music, movie 두개의 값중에서 하나가 입력됨

// 서블릿이 해야할 일
// music 일 경우 "음악" 이라는 단어를 count에 보내온 숫자 만큼 출력
// movie 일 경우 "영화" 이라는 단어를 count에 보내온 숫자 만큼 출력
// music, movie 의 값이 넘어오지 않은 경우 "잘못된 타입"을 출력
package quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/quiz/quiz02")
public class Quiz_teacher implements Servlet {
	
	private Map<String, String> tMap;

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		tMap = new HashMap<>();
		tMap.put("music", "음악");
		tMap.put("movie", "영화");
	}

	@Override
	public void service(ServletRequest request, ServletResponse arg1) throws ServletException, IOException {
		String type = request.getParameter("type");
		String view = tMap.get(type);
		if (view == null) {
			System.out.println("잘못된 타입");
			return;
		}
		
		int count = Integer.parseInt(
				request.getParameter("count"));
		for (int i = 1; i <= count; i++) {
			System.out.println(view);
		}
	}

	@Override
	public void destroy() {}
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}
	@Override
	public String getServletInfo() {
		return null;
	}
	
}











