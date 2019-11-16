package pro.hyder.service.impl;

import pro.hyder.service.BaseService;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/17 上午2:32
 */
public class Person implements BaseService {

	public void eat() {
		// 主要业务 代理模式 只关心主要业务
		System.out.println("用筷子吃饭");
	}

	public void wc() {
		System.out.println("测试上厕所");
	}
}
