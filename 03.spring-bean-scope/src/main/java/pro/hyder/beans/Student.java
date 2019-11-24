package pro.hyder.beans;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/24 下午1:47
 */
public class Student {

	private String sname;
	private int age;
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
