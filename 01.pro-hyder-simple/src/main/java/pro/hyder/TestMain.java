package pro.hyder;

import pro.hyder.service.BaseService;
import pro.hyder.service.impl.Person;
import pro.hyder.utils.ProxyFactory;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/17 上午2:57
 */
public class TestMain {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BaseService mike = ProxyFactory.builder(Person.class);
		mike.eat();

	}
}
