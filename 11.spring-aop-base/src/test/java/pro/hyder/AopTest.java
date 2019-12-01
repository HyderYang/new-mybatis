package pro.hyder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.hyder.service.UserService;

import javax.annotation.Resource;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/1 下午6:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:configuration.xml")
public class AopTest {

	@Resource
	private UserService userService;

	@Test
	public void testAop(){
		this.userService.saveUser();
	}
}
