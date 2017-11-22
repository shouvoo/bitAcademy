/*
 *  메서드 객체의 매개변수 정보를 꺼내서 사용자 요청 파라미터에서
 *  해당하는 값을 추출 설정한 다음  Dispatcher에게 넘겨준다.
 */
package org.springframework.web.mvc;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;
import org.springframework.web.mvc.RequestParam;

public class PreParameterProcess {
	public Object[] process(
			Method m, HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		Parameter[] pArr = m.getParameters();
		Object[] rArr = new Object[pArr.length];
		
		// 메서드의 파라미터 정보만큼 반복됨..
		int index = 0;
		// modify(BoardDomain board, String name, int no)
		for (Parameter p : pArr) {
			Class<?> tClz = p.getType();
			// tName : BoardDomain, String, int
			String tName = tClz.getSimpleName();
			// 파라미터이름 : board, name, no
			String pName = p.getName();
			
			// @RequestParam(name="pageNo", defaultValue="1") int no
			RequestParam rp = 
					p.getAnnotation(RequestParam.class);
			String defaultValue = null;
			if (rp != null) {
				pName = rp.name();
				defaultValue = rp.defaultValue();
			}
			String pValue = request.getParameter(pName);
			if (pValue == null) pValue = defaultValue;
			
			switch (tName) {
			case "int":
				rArr[index++] = Integer.parseInt(pValue);
				break;
			case "String": 
				rArr[index++] = pValue;
				break;
			case "HttpServletRequest":
				rArr[index++] = request;
				break;
			case "HttpServletResponse":
				rArr[index++] = response;
				break;
			case "HttpSession":
				rArr[index++] = request.getSession();
				break;
			default:
				rArr[index++] = WebUtil.toVO(request, tClz);
			}
		}
		return rArr;
	}
}


















