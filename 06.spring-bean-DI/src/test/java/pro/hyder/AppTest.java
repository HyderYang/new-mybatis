package pro.hyder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hyder.beans.Teacher;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
        ApplicationContext fa = new ClassPathXmlApplicationContext("configuration.xml");
        Teacher teacher = (Teacher) fa.getBean("teacher");
        System.out.println(teacher.getTeacherName());
        System.out.println(teacher.getFriendArray().toString());
        System.out.println(teacher.getSchool().toString());
    }
}
