package pro.hyder.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:configuration.xml")
public class AccountServiceTest {

	@Resource
	private AccountService service;

	@Test
	public void testTransfer() {
		service.Transfer("测试", "张三", 500);
	}
}