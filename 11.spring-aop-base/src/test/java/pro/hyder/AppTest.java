package pro.hyder;

import org.junit.Test;
import pro.hyder.service.UserService;
import pro.hyder.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@Configuration()
public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
		UserService userService = new UserServiceImpl();
		UserService proxy = this.getProxy(userService);

		userService.saveUser();

		System.out.println("--------------------------------");

		proxy.saveUser();

	}

	/**
	 * JDK的动态代理
	 *
	 * @param user 1
	 *
	 * @return userService
	 */
	private UserService getProxy(UserService user) {
		/*
		  1: 目标对象类加载器
		  2: 目标对象接口
		  3: 代理对象执行处理器
		 */
		return (UserService) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(),
		        /*
		          proxy: 代理对象
		          method: 执行方法
		          args: 执行方法参数
		         */
				(proxy, method, args) -> {
					System.out.println("执行前操作");
					Object invoke = method.invoke(user, args);
					System.out.println("执行后操作");
					return invoke;
				});
	}
}
