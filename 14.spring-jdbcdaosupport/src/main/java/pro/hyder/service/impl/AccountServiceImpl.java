package pro.hyder.service.impl;

import org.springframework.stereotype.Service;
import pro.hyder.dao.AccountDao;
import pro.hyder.service.AccountService;

import javax.annotation.Resource;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/5 下午3:29
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountDao dao;

	@Override
	public void Transfer(String from, String to, int money) {
		int fromMoney = dao.queryMoney(from);
		dao.update(from, fromMoney - money);

		System.out.println(1 / 0);

		int toMoney = dao.queryMoney(to);
		dao.update(to, toMoney + money);
	}
}
