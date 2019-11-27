package pro.hyder.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 上午12:42
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 切面: 次要业务
	 * @param method
	 * @param objects
	 * @param o
	 * @throws Throwable
	 */
	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("----洗手----");
	}
}
