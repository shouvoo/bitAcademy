/*
 *   Dispatcher 의 역활
 *   - 사용자의 모든 요청을 최초로 받는다.(web.xml 등록)
 *   - 사용자의 요청에 해당하는 작업클래스(Controller)를 찾아서 호출
 *   - 컨트롤러의 공통적인 작업을 일반화 시켜 처리하게 한다.
 *     : 파라미터 처리하기
 *     : 화면에 사용할 데이터를 공유
 *     : 페이지 이동
 */
package org.springframework.web.mvc;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.DeleteBoardController;
import kr.co.mlec.board.DetailBoardController;
import kr.co.mlec.board.ListBoardController;
import kr.co.mlec.board.ModifyBoardController;
import kr.co.mlec.board.ModifyFormBoardController;
import kr.co.mlec.board.WriteBoardController;
import kr.co.mlec.board.WriteFormBoardController;
import kr.co.mlec.login.LoginFormController;
import kr.co.mlec.login.LoginProcessController;
import kr.co.mlec.login.LogoutController;
import kr.co.mlec.main.MainController;

public class DispatcherServlet extends HttpServlet {
	
	private URLHandlerMapping mapping;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String controllers = config.getInitParameter("controllers");
		try {
			mapping = new URLHandlerMapping(controllers);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void service(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 특정 URL에 대한 작업 클래스를 호출한다.
		// - 사용자 요청 URL 확인하기
		String uri = request.getRequestURI();
		
		// - 사용자 요청 URL에서 웹어플리케이션 경로 제거하기
		// /lec05_mvc
		String contextPath = request.getContextPath();
		
		uri = uri.substring(contextPath.length());
		try {
			
			// URLHandlerMapping 클래스 활용
			Controller control = mapping.getController(uri);
			
			// 사용자 호출 uri가 존재하지 않을 경우 처리
			if (control == null) {
				throw new Exception("잘못된 URL입니다.");
			}
			
			ModelAndView mav = control.service(request, response);
			String view = mav.getView();
			
			
			
			if (view.startsWith("redirect:")) {
				response.sendRedirect(view.substring("redirect:".length()));
			}
			else {
				//foward 방식일 경우에는 mav 객체에 있는 뱁의 데이터를 꺼내서
				//공유영역에 등록시키는 작업을 진행한다
				
				/*방법1*/
				/*Iterator iter = mav.getModel().keySet().iterator(); 
				while(iter.hasNext())
				{ 
					String key = (String)iter.next(); 
					request.setAttribute(key, mav.getModel().get(key));
				}*/
				
				/*방법2*/
				Map<String, Object> model = mav.getModel();
				Set<String> keys = model.keySet();
				
				for (String key : keys) 
				{
					request.setAttribute(key, model.get(key));
				}
				
				
				RequestDispatcher rd = request.getRequestDispatcher(view);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}











