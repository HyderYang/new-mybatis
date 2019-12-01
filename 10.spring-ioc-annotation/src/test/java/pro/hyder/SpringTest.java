package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pro.hyder.configuration.DataConfiguration;
import pro.hyder.configuration.SpringConfiguration;
import pro.hyder.service.UserService;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/1 下午3:08
 */
public class SpringTest {

	@Test
	public void springTest(){
		ApplicationContext context = new AnnotationConfigApplicationContext(DataConfiguration.class);
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		UserService bean = (UserService) context.getBean("userServiceImpl");
		bean.saveUser();
		System.out.println(bean.toString());
	}

	@Test
	public void moreConfigTest(){
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		UserService bean = (UserService) context.getBean("userServiceImpl");
		bean.saveUser();
		System.out.println(bean.toString());
	}
}
