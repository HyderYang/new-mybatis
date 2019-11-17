package pro.hyder.utils;

import pro.hyder.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通知类
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/17 上午2:34
 */
public class Invaction implements InvocationHandler {

	private BaseService obj;

	public Invaction(BaseService serv){
		this.obj = serv;
	}
	/**
	 * invoke 方法
	 * 在被监控行为将要执行时 会被JVM拦截
	 * 被监控行为和行为实现方法会被作为参数输送invoke
	 * 通知 jvm 这个被拦截方法如何与当前次要业务方法绑定实现
	 *
	 * @param proxy     负责监控的代理对象
	 * @param method    被拦截方法被封装为 Method 类型对象
	 * @param args      被拦截方法运行时接受所有的实参封装到 Object[]
	 * @return
	 * @throws Throwable
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 设置局部变量 接受主要业务方法执行完毕后返回值
		Object value;

		// 确认当前被拦截行为
		String methodName = method.getName();

		//根据拦截行为不同 决定主要和次要业务如何绑定执行
		if("eat".equals(methodName)){
			this.wash();
			value = method.invoke(this.obj, args);
		}else{
			value = method.invoke(obj, args);
			this.wash();
		}
		return value;
	}

	public void wash() {
		System.out.println("洗手");
	}
}
