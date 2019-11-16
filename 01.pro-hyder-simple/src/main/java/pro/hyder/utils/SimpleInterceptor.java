package pro.hyder.utils;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * 拦截器
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/17 上午1:49
 */
@Intercepts({
		@Signature(
				method = "query",
				type = Executor.class,
				args = {
						MappedStatement.class,
						Object.class,
						RowBounds.class,
						ResultHandler.class
				}
		)
})
public class SimpleInterceptor implements Interceptor {

	/**
	 * @param invocation    代理对象, 被监控方法 被监控方法运行实参
	 * @return
	 * @throws Throwable
	 */
	public Object intercept(Invocation invocation) throws Throwable {
		Object proceed = invocation.proceed();
		return proceed;
	}

	/**
	 * 如果被拦截对象所在类有实现接口 就为当前拦截对象生成一个 $proxy
	 * 如果被拦截对象所在类没有指定接口 这个对象之后行为就不会被代理操作
	 *
	 * @param target    被拦截对象 应该是 executor 接口的实例对象
	 * @return
	 */
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/**
	 * 读取配置文件属性信息
	 * @param properties
	 */
	public void setProperties(Properties properties) {

	}
}
