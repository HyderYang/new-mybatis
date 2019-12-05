package pro.hyder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/4 下午4:13
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/java?useUnicode=true&characterEncoding=UTF-8";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	@Bean
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(this.dataSource());
	}
}
