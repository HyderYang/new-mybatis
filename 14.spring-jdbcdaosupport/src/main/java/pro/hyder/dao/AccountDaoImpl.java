package pro.hyder.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/5 下午3:34
 */
@Repository
public class AccountDaoImpl implements AccountDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void update(String name, int money) {
		jdbcTemplate.update("UPDATE  account SET money = ? WHERE name = ?", money, name);
	}

	@Override
	public int queryMoney(String name) {
		String sql = "SELECT money FROM account where name = ?";
		Integer integer = jdbcTemplate.queryForObject(sql, new MyInt(), name);
		return integer;
	}
}

class MyInt implements RowMapper<Integer> {

	@Override
	public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
		int money = resultSet.getInt("money");
		return money;
	}
}


