package pro.hyder.utils;

import org.springframework.aop.ClassFilter;
import pro.hyder.service.impl.Person;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 下午6:34
 */
public class MyClassFilter implements ClassFilter {
	/**
	 * 1. 一个接口下会有多个实现类
	 * 2. 判断当前实现类是不是需要织入的目标类
	 * BaseService接口我们现在只想管理Person
	 * 参数 就是当前被拦截类, BaseService 类型
	 * @param clazz
	 * @return
	 */
	@Override
	public boolean matches(Class<?> clazz) {
		// 判断当前类是否需要我们提供织入服务
		if (clazz == Person.class){
			return true;
		}
		return false;
	}
}
