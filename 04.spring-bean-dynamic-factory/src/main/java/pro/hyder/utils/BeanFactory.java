package pro.hyder.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * bean工厂
 *
 * @author Hyder
 * @version 1.0
 * @date 2019/11/24 下午1:44
 */
public class BeanFactory {
	private List<BeanDefined> beanDefinedList;
	// 创建好的示例对象
	private Map<String, Object> SpringIoc;

	public BeanFactory(List<BeanDefined> beanDefinedList) {
		this.beanDefinedList = beanDefinedList;
		// 单例容器
		SpringIoc = new HashMap<String, Object>();
		this.beanDefinedList.stream().filter(o -> {
			return o.getScope().equals("singleton");
		}).forEach(o -> {
			try {
				Class<?> aClass = Class.forName(o.getClassPath());
				Object o1 = aClass.newInstance();
				SpringIoc.put(o.getBeanId(), o1);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
		});
	}

	public List<BeanDefined> getBeanDefinedList() {
		return beanDefinedList;
	}

	public void setBeanDefinedList(List<BeanDefined> beanDefinedList) {
		this.beanDefinedList = beanDefinedList;
	}

	public Object getBean(String beanId) {
		Object o = null;
		for (BeanDefined obj : this.beanDefinedList) {
			if (beanId.equals(obj.getBeanId())) {
				String classPath = obj.getClassPath();
				try {
					Class<?> aClass = Class.forName(classPath);
					String scope = obj.getScope();
					switch (scope) {
						case "prototype":
							o = aClass.newInstance();
							break;
						default:
							o = SpringIoc.get(beanId);
					}
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
