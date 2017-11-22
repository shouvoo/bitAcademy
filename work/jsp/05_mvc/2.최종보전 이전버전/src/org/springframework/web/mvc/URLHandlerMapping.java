/*
 *   Dispatcher의 역활중에서 uri와 controller에 대한 정보 관리 부분을 처리 
 */
package org.springframework.web.mvc;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

import kr.co.mlec.main.MainController;

public class URLHandlerMapping {
	private Map<String, CtrlAndMethod> mappings = new HashMap<>();
	
	public URLHandlerMapping(String controllers) throws Exception {
		String[] arr = controllers.split(";");
		for (String ctrl : arr) {
			Class<?> clz = Class.forName(ctrl.trim());
			Object target = clz.newInstance();
			
			//클래스에 선언된 모든 메서드 객체 가져오기
			Method[] mArr = clz.getDeclaredMethods();
			Object [] pName = target.getClass().getTypeParameters();

			
			for(Method m : mArr)
			{
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
					
				if(rm == null) continue;
				
				mappings.put(rm.value(), new CtrlAndMethod(target, m));
			}
			
		}
	}
	
	public CtrlAndMethod getCtrlAndMethod(String uri) {
		return mappings.get(uri);
	}
}












