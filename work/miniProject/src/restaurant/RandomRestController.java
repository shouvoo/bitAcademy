package restaurant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restaurant/random")
public class RandomRestController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(request.getRemoteAddr());
		boolean chk = false;
		
		if(request.getParameter("ran").equals("true"))
			chk = true;
		
		RestDAO dao = new RestDAO();
		RestVO vo = new RestVO();
		String str = "";
		int page = 0;
		String flavor = "";
		
		double random = Math.random();
		
		if(random > 0.8)
			flavor = "★★★★☆"; //20%
		else if(random > 0.5)
			flavor = "★★★★"; //30%
		else if(random > 0.3)
			flavor = "★★★☆"; // 20%
		else if(random > 0.2)
			flavor = "★★★"; // 10%
		else if(random > 0.1)
			flavor = "★★☆"; // 10%
		else
			flavor = "★★"; //10%
		
		if(chk) {
			try {
				vo.setIp(request.getRemoteAddr());
				vo = dao.JungBok(vo);
				str = "이미 참여하셨습니다.";
				
				if(!vo.isChk()) {
					
					try {
						page = dao.Page(flavor);
					} catch (Exception e) {

					}
					
					str = "랜덤 결과";
					int ran = 0;
					
					while(true) {
						ran = (int)(Math.random()*100);
						//System.out.println(ran);
						
						if(ran > 0 && ran < page)
							break;				
					}
					
					vo = dao.randomRest(ran, flavor);
					vo.setIp(request.getRemoteAddr());
					
					try {
						dao.TodayinsertRest(vo);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/restaurant/random.jsp");
		request.setAttribute("rest", vo);
		request.setAttribute("msg", str);

		rd.forward(request, response);
	}
}
