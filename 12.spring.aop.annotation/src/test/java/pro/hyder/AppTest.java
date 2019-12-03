package pro.hyder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.hyder.config.Configuration;
import pro.hyder.service.UserService;

import javax.annotation.Resource;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Configuration.class)
public class AppTest {

    @Resource
    private UserService userServiceImpl;

    @Test
    public void appTest(){
        this.userServiceImpl.saveUser();
    }
}
