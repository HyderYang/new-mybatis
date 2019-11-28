package pro.hyder.service.impl;

import pro.hyder.service.BaseService;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 下午6:33
 */
public class God implements BaseService {

	@Override
	public void eat() {
		System.out.println("不吃饭");
	}

	@Override
	public void wc() {
		System.out.println("不排泄");
	}
}
