package pro.hyder.utils;

import pro.hyder.beans.Teacher;

/**
 * 自定义工厂
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/26 下午8:26
 */
public class ObjFactory {
	public Teacher createTeacher(){
		System.out.println("由teacher工厂返回 teacher 实例");
		return new Teacher();
	}
}
