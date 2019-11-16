package pro.hyder.domain;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/16 上午3:37
 */
public class Dept {
	private Integer deptNo;
	private String dName;
	private String loc;
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dName;
	}
	public void setDname(String dname) {
		this.dName = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}