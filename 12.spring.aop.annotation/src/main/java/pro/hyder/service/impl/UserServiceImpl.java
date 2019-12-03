package pro.hyder.service.impl;

import org.springframework.stereotype.Service;
import pro.hyder.service.UserService;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/30 下午11:58
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void saveUser() {
		System.out.println("演示 Spring IOC");
	}
}
