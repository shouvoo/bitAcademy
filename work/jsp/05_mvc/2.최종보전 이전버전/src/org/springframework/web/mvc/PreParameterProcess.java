package org.springframework.web.mvc;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;

/*
	메서드 객케의 매개변수 정보를 꺼내서 사용자 요청 파라미터에서 
	해당하는 값을 추출한 다음 Dispatcher 에게 넘겨준다
*/
public class PreParameterProcess 
{
	public Object[] process(Method m, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		Parameter[] pArr = m.getParameters();
		Object[] rArr = new Object[pArr.length];
		
		//메서드의 파라미터 정보만큼 반복됨
		int index = 0;
		for (Parameter p : pArr) 
		{			
			Class<?> tClz = p.getType();
			//tname : 파라미터에 넘어가는 클래스 이름
			String tName = tClz.getSimpleName();
			
			//파라미터에 넘어가는 변수이름
			String pName = p.getName();
			
			RequestParam rq = p.getAnnotation(RequestParam.class);
			String defaultValue = null;
			if(rq != null)
			{
				pName = rq.name();
				defaultValue = rq.defaultValue();
			}
			
			String pValue = request.getParameter(pName);
			if(pValue == null) pValue = defaultValue;
			
			
			switch(tName)
			{
				case "int" :
					rArr[index++] = Integer.parseInt(pValue);
					break;
					
				case "String" :
					rArr[index++] = pValue;
					break;
					
				case "HttpServletRequest" :
					rArr[index++] = request;
					break;
					
				case "HttpServletResponse" :
					rArr[index++] = response;
					break;
					
				case "HttpSession" :
					rArr[index++] = request.getSession();
					break;
					
				default :
					rArr[index++] = WebUtil.toVO(request, tClz);
			}
		}
		
		return rArr;
	}
}
