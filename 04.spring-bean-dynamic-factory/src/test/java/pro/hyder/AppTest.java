package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.beans.Teacher;
import pro.hyder.utils.BeanDefined;
import pro.hyder.utils.BeanFactory;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    @Test
    public void beanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
    }

    @Test
    public void dynamicFactoryOfMy() {
        // 声明注册 Bean
        BeanDefined beanObj = new BeanDefined();
        beanObj.setBeanId("teacher");
        beanObj.setClassPath("pro.hyder.beans.Teacher");
        beanObj.setFactoryBean("factory1");
        beanObj.setFactoryMethod("createTeacher");
        beanObj.setScope("prototype");

        BeanDefined beanFactory = new BeanDefined();
        beanFactory.setBeanId("factory1");
        beanFactory.setClassPath("pro.hyder.utils.ObjFactory");

        List configuration = new ArrayList();
        configuration.add(beanObj);
        configuration.add(beanFactory);

        BeanFactory factory = new BeanFactory(configuration);
        Teacher teacher = (Teacher) factory.getBean("teacher");
        System.out.println(teacher.toString());
    }
}
