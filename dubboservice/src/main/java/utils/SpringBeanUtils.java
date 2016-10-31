package utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanUtils implements ApplicationContextAware{

	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("dddddd");
		this.applicationContext = applicationContext;
	}

	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}
	
	public static Object getBeanByType(String name) throws BeansException, ClassNotFoundException{
		return applicationContext.getBean(Class.forName(name));
	}
}
