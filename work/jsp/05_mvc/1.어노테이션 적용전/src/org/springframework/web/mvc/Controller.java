// 모든 작업 클래스(Controller)가 구현해야할 service 메서드 정의
package org.springframework.web.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response)
			throws Exception;
}
