package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.service.BaseService;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void mainTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		BaseService bean = (BaseService) context.getBean("someService");
		System.out.println(bean.doSth());
	}
}
