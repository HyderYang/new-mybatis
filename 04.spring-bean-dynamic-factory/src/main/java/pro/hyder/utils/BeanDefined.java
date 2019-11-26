package pro.hyder.utils;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/24 下午1:48
 */
public class BeanDefined {
	private String beanId;
	private String classPath;
	private String scope = "singleton";

	public BeanDefined() {}

	public BeanDefined(String beanId, String scope) {
		this.beanId = beanId;
		this.scope = scope;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getBeanId() {
		return beanId;
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
}