package pro.hyder.beans;

import java.util.List;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/24 下午1:47
 */
public class Teacher {
	private String teacherName;
	private String friendArray[];
	private List<String> school;

	public String[] getFriendArray() {
		return friendArray;
	}

	public void setFriendArray(String[] friendArray) {
		this.friendArray = friendArray;
	}

	public List<String> getSchool() {
		return school;
	}

	public void setSchool(List<String> school) {
		this.school = school;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
