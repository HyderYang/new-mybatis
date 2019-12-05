package pro.hyder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.hyder.config.Configuration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/4 下午4:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:configuration.xml")
//@ContextConfiguration(classes = Configuration.class)
public class JdbcTest {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void jdbcTest(){
		this.jdbcTemplate. update("INSERT INTO account VALUES (NULL, ?, ?)", "测试3", 21023);
	}

	@Test
	public void queryTest(){
		String sql = "SELECT * FROM account";
		List<Account> query = this.jdbcTemplate.query(sql, new MyAccounts());
		for (Account ac : query){
			System.out.println(ac.toString());
		}
	}
}

class MyAccounts implements RowMapper{

	@Override
	public Account mapRow(ResultSet resultSet, int i) throws SQLException {
		Account ac = new Account();
		ac.setId(resultSet.getInt("id"));
		ac.setName(resultSet.getString("name"));
		ac.setMoney(resultSet.getInt("money"));
		return ac;
	}
}

class Account{
	private Integer id;
	private String name;
	private Integer money;

	@Override
	public String toString() {
		return "Account{" + "id=" + id + ", name='" + name + '\'' + ", money=" + money + '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
}
