package pro.hyder.service.impl;

import pro.hyder.service.BaseService;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 上午12:21
 */
public class Person implements BaseService {

	// 切入点 主要业务方法
	@Override
	public void eat() {
		System.out.println("吃饭");
	}

	// 切入点 主要业务方法
	@Override
	public void wc() {
		System.out.println("上厕所");
	}
}
