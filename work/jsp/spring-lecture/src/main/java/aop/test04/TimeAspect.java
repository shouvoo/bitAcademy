package aop.test04;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAspect 
{
	public void exeTime(ProceedingJoinPoint pjp) throws Throwable
	{
		//around 방식일 경우에는 공통 기능 클래스에서 핵심 기능 클래싀 메서드를 호출
		long s = System.currentTimeMillis();
		try {
			pjp.proceed();
		} finally {
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("실행 시간 : " + time);
		}
	}
}
