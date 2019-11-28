package pro.hyder.utils;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 下午6:45
 */
public class MyPointCut implements Pointcut {
	private MyClassFilter classFilter;
	private MyMethodMatcher methodMatcher;

	@Override
	public MyClassFilter getClassFilter() {
		return classFilter;
	}

	public void setClassFilter(MyClassFilter classFilter) {
		this.classFilter = classFilter;
	}

	@Override
	public MyMethodMatcher getMethodMatcher() {
		return methodMatcher;
	}

	public void setMethodMatcher(MyMethodMatcher methodMatcher) {
		this.methodMatcher = methodMatcher;
	}
}
