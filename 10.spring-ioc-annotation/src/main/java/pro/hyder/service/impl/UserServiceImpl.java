package pro.hyder.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pro.hyder.service.UserService;

import javax.annotation.Resource;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/30 下午11:58
 */
@Component(value = "userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserName name;

	// 简单类型注入 配合properties文件使用
	@Value("234")
//	@Value("${id}")
	private Integer id;

	@Override
	public void saveUser() {
		System.out.println("演示 Spring IOC");
		System.out.println(this.name.toString());
		System.out.println(this.id);
	}
}
