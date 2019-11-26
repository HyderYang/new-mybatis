package pro.hyder.utils;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/27 上午12:15
 */
public interface BeanPostProcessor {
	default Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
		return bean;
	}

	default Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
		return bean;
	}
}
