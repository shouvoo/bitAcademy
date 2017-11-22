package org.springframework.web;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;

public class WebUtil 
{
	//clz 로 들어온 클래스 정보를 읽고 request 의 파라미터에서 정보를 추출한다음
	//파라미터 정보가 추출 설정된 객체를 반환
	public static Object toVO(Object request, Class<?> clz) throws Exception
	{
		//메서드를 실행하기 위한 객체생성
		Object obj = clz.newInstance();
		
		//clz 클래스 객체의 모든 메서드를 추출
		Method[] mArr = clz.getDeclaredMethods();
		for(Method m : mArr)
		{	
			//메서드 이름 확인하기
			String mName = m.getName();
			
			//메서드의 이름이  set 로 시작하는 메서드인지 확인
			if(mName.startsWith("set") == false) continue; // set 이란 이름으로 시작하는지 여부 true, false 반환
			
			mName = mName.substring("set".length());
			
			//첫글자를 소문자로 변경하기
			mName = Character.toLowerCase(mName.charAt(0)) + mName.substring(1);
			
			//변경된 이름에 해당하는 파라미터 추출하기
			String reqName = request.getClass().getSimpleName();
			String pValue = null;
			
			switch(reqName)
			{
				case "MultipartRequest" :
					pValue = ((MultipartRequest)request).getParameter(mName);
					break;
				default : 
					pValue = ((HttpServletRequest)request).getParameter(mName);
					break;
			}
			
			//이름에 해당하는 파라미터가 없는경우
			if(pValue == null) continue;
			
			//메서드와 해당하는 파라미터 값이 존재하는 경우 메서드의 매개변수 타입이 정수인 경우
			//문자열을 정수로 변경한 다음 값을 대입
			String tTypeName = m.getParameterTypes()[0].getName();
			
			switch(tTypeName)
			{
				case "int" :
					m.invoke(obj, Integer.parseInt(pValue));
					break;
					
				default :
					m.invoke(obj, pValue);
					break;
			}
		}
		
		/*int no = Integer.parseInt(request.getParameter("no"));
		// 화면에서 넘어온 파라미터 추출하기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		// Domain 클래스에 파라미터 담기
		BoardDomain board = new BoardDomain();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);*/
		
		
		return obj;
	}
	
}









































