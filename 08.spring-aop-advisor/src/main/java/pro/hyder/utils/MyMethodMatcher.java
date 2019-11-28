package pro.hyder.utils;

import org.springframework.aop.MethodMatcher;

import java.lang.reflect.Method;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 下午6:39
 */
public class MyMethodMatcher implements MethodMatcher {
	/**
	 * 被监控接口比如 (BaseService) 没有重载方法, 每一个方法名称都是唯一
	 * 此时可以采用static检测方式 只根据方法名称判断
	 * @param method        接口中某一个实现类
	 * @param targetClass   接口中一个实现类
	 * @return
	 */
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if ("eat".equals(method.getName())){
			return true;
		}
		return false;
	}
	@Override
	public boolean isRuntime() {
		return false;
	}
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		return false;
	}
}
