package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.service.BaseService;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("configuration.xml");
        BaseService personProxy = (BaseService) factory.getBean("personProxy");
        personProxy.eat();
        personProxy.wc();
    }
}
