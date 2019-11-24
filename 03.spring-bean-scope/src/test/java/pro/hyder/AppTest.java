package pro.hyder;

import org.junit.Test;
import pro.hyder.beans.Teacher;
import pro.hyder.utils.BeanDefined;
import pro.hyder.utils.BeanFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void beanTest() {
        // 1. 声明注册bean
        BeanDefined beanDefined = new BeanDefined();
        beanDefined.setBeanId("teacher");
        beanDefined.setClassPath("pro.hyder.beans.Teacher");
        beanDefined.setScope("prototype");

        List beanList = new ArrayList();
        beanList.add(beanDefined);

        // 2. 声明一个 spring 提供 beanfactory
        BeanFactory beanFactory = new BeanFactory(beanList);
        beanFactory.setBeanDefinedList(beanList);

        // 3. 向 BeanFactory 获取实例对象
        Object teacher = beanFactory.getBean("teacher");
        if (teacher != null){
            System.out.println("t2" + teacher.toString());
        }
        Object teacher1 = beanFactory.getBean("teacher");
        if (teacher != null){
            System.out.println("t2" + teacher1.toString());
        }
    }

    @Test
    public void java8Test(){
        List<BeanDefined> list = new ArrayList<>();
        list.add(new BeanDefined("single-a", "singleton"));
        list.add(new BeanDefined("single-b", "singleton"));
        list.add(new BeanDefined("prototype-c", "prototype"));
        list.add(new BeanDefined("prototype-d", "prototype"));
        list.add(new BeanDefined("prototype-e", "prototype"));
        list.add(new BeanDefined("prototype-f", "prototype"));
        list.stream().filter(o -> {
            return o.getScope().equals("singleton");
        }).forEach(o -> {
            System.out.println(o.getBeanId());
        });
    }
}
