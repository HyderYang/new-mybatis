package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.service.UserService;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        // 根据Bean类型获取Bean实例
        UserService bean1 = context.getBean(UserService.class);
        UserService bean2 = (UserService) context.getBean("userService");

        bean1.saveUser();
        bean2.saveUser();
    }
}
