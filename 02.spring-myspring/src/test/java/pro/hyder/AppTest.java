package pro.hyder;

import org.junit.Test;
import pro.hyder.beans.Teacher;
import pro.hyder.utils.BeanDefined;
import pro.hyder.utils.BeanFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AppTest {


    @Test
    public void beanTest() {
        // 1. 声明注册bean
        BeanDefined beanDefined = new BeanDefined();
        beanDefined.setBeanId("teacher");
        beanDefined.setClassPath("pro.hyder.beans.Teacher");

        List beanList = new ArrayList();
        beanList.add(beanDefined);

        // 2. 声明一个 spring 提供 beanfactory
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.setBeanDefinedList(beanList);

        // 3. 向 BeanFactory 获取实例对象
	    Object teacher = beanFactory.getBean("teacher");
	    if (teacher != null){
	    	teacher = (Teacher)teacher;
		    System.out.println(teacher.toString());
	    }

    }

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
}
