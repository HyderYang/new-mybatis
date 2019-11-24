package pro.hyder.utils;

import java.util.List;

/**
 * bean工厂
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/24 下午1:44
 */
public class BeanFactory {
	private List<BeanDefined> beanDefinedList;
	public List<BeanDefined> getBeanDefinedList() {
		return beanDefinedList;
	}
	public void setBeanDefinedList(List<BeanDefined> beanDefinedList) {
		this.beanDefinedList = beanDefinedList;
	}
	public Object getBean(String beanId){
		Object o = null;
		for (BeanDefined obj : this.beanDefinedList){
			if (beanId.equals(obj.getBeanId())){
				String classPath = obj.getClassPath();
				try {
					Class<?> aClass = Class.forName(classPath);
					o = aClass.newInstance();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				}
			}
		}
		return o;
	}
}
