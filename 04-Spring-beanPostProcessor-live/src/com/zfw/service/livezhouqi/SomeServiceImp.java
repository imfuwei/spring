package com.zfw.service.livezhouqi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeServiceImp implements ISomeService, BeanNameAware,
		BeanFactoryAware, InitializingBean, DisposableBean {
	public SomeServiceImp() {
		System.out.println("1：对象创建了，执行无参构造器");
	}

	private String aa;

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		System.out.println("2：参数的setter方法");
		this.aa = aa;
	}

	// 实现BeanNameAware接口，可以得到bean在容器中的id，在第3步执行
	@Override
	public void setBeanName(String name) {
		System.out.println("3:使bean类能获得bean在容器中的id   " + name);
	}

	// 实现BeanFactoryAware接口，可以在bean类中获取beanFactory对象
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4:bean类中获取beanFactory对象   " + beanFactory);
	}

	// 实现InitializingBean接口，在bean类中所有的setter方法执行完毕后执行，标志实例化结束
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("6：InitializingBean接口，bean类中所有的setter方法执行完毕后执行，标志实例化结束");
	}

	public void initPost() {
		System.out.println("7:“init-method”  Bean刚被初始化，执行定制bean生命始末的初始化方法");
	}

	@Override
	public String dosome() {
		return "9:业务代码，实现服务接口的方法";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("10：执行DisposableBean接口中的destroy方法，销毁前的工作");
	}

	public void destroydingzhi() {
		System.out.println("11：执行“method-destroy方法”   Bean马上被销毁了");
	}

}
