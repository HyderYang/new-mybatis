package pro.hyder.dao;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/5 下午3:26
 */
public interface AccountDao {
	void  update(String name, int money);

	int queryMoney(String name);
}
