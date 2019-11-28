package pro.hyder.utils;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

import java.awt.*;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/11/28 下午7:06
 */
public class MyPointCutAdvisor implements PointcutAdvisor {
	// 次要业务以及次要业务与主要业务执行顺序
	private Advice advice;
	// 当前拦截对象和对象调用主要业务方法
	private Pointcut pointcut;

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public void setPointcut(Pointcut pointcut) {
		this.pointcut = pointcut;
	}

	@Override
	public Pointcut getPointcut() {
		return this.pointcut;
	}

	@Override
	public Advice getAdvice() {
		return this.advice;
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}
}
