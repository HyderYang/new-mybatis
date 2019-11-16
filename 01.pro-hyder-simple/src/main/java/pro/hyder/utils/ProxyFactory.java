package pro.hyder.utils;

import org.apache.ibatis.javassist.Loader;
import pro.hyder.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/17 上午2:46
 */
public class ProxyFactory {

	public static BaseService builder(Class classFile) throws IllegalAccessException, InstantiationException {
		// 创建被监控实例对象
		BaseService o = (BaseService)classFile.newInstance();

		// 创建通知对象
		InvocationHandler adviser = new Invaction(o);

		// jvm 申请负责监控 obj 对象指定行为的监控对象

		/**
		 * loader:          被监控对象隶属的类文件在内存中真实地址
		 * interfaces:      被监控对象隶属的类文件实现接口
		 * h:               监控对象发现要执行被监控行为 应该由哪个通知对象进行辅助
		 */
		BaseService baseProxy = (BaseService) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), adviser);
		return baseProxy;

	}
}
