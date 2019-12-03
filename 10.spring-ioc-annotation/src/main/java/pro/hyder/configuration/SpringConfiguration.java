package pro.hyder.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pro.hyder.service.UserService;
import pro.hyder.service.impl.UserServiceImpl;

/**
 * 相当于 spring xml 配置文件的 beans 根标签
 * @author Hyder
 * @version 1.0
 * @date 2019/12/1 下午3:06
 */
@Configuration
@Import(DataConfiguration.class)
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("spring 多配置");
	}

	// Bean 注解 可以指定 bean id 如果不知道 则默认beanID就是对应的方法名
	// 相当于 bean 标签
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
