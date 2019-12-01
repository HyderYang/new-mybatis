package pro.hyder.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pro.hyder.service.UserService;
import pro.hyder.service.impl.UserServiceImpl;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/1 下午3:21
 */
@Configuration
@ComponentScan(basePackages = "pro.hyder.service")
public class DataConfiguration {
//	@Value("${id}")
//	private int id;
//	@Value("${name}")
//	private String name;

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
}
