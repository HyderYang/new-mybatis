package pro.hyder;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pro.hyder.domain.Dept;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/16 上午3:37
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Dept dept = new Dept();
		dept.setDeptNo(2);
		dept.setDname("你猜");
		dept.setLoc("北京");
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = build.openSession();
//		sqlSession.insert()
		int a = 1;
	}
}
