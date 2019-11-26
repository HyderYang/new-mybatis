package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.beans.Teacher;

public class AppTest {
    @Test
    public void beanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
    }
}
