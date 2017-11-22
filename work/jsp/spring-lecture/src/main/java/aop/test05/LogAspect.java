package aop.test05;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//로그를 출력하는 공통 기능 클래스
@Aspect
@Component
public class LogAspect 
{
	@Before("execution(public * aop.test05..*Controller.execute(..))")
	public void showLog(JoinPoint point)
	{
		//JoinPoint 를 이용해서 호출되는 핵심클래스, 메서드 정보를 꺼낼수 있다
		Object target = point.getTarget();
		Class<?> clz = target.getClass();
		Signature sig =  point.getSignature();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("------------------------------------------");
		System.out.println("클래스명 : " + clz.getName());
		System.out.println("메서드명 : " + sig.getName());
		System.out.println("호출시간 : " + sdf.format(new Date()));
		System.out.println("------------------------------------------");
	}
}
