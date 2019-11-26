package pro.hyder.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import pro.hyder.service.impl.SomeServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/26 下午11:06
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean 前置处理器");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// 为当前bean对象注册一个代理监控对象 负责曾倩
		if (bean.getClass() == SomeServiceImpl.class) {
			return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), (proxy, method, args) -> {
				System.out.println("被拦截方法");
				String res = (String) method.invoke(bean, args);
				return res.toUpperCase();
			});
		}
		return bean;
	}
}
