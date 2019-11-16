package pro.hyder.utils;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import pro.hyder.domain.Dept;

/**
 * 对象工厂
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/16 下午11:01
 */
public class MyObjectFactory extends DefaultObjectFactory {

	/**
	 * 重新定义 实体类实例对象创建规则 其他类实例创建规则不会改变
	 * @param type
	 * @return
	 */
	@Override
	public Object create(Class type) {
		if(Dept.class == type){
			// 依靠父类提供 create 方法创建 Dept 实例对象
			Dept dept = (Dept) super.create(type);
			// 设置自定义规则 (数据库中没有此字段)
			dept.setCountry("China");
			return dept;
		}

		return super.create(type);
	}
}
