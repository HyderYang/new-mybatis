package pro.hyder.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/2 下午5:02
 */
@Aspect
@Component
public class MyAdvice {

	@Before(value="fn()")
	public void before(){
		System.out.println("注解前置通知....");
	}

	@AfterThrowing
	@After(value="fn()")
	public void after(){
		System.out.println("注解后置通知....");
	}

	// 通用切入点表达式
	@Pointcut("execution(* *..*.*ServiceImpl.*(..))")
	public void fn(){}
}
