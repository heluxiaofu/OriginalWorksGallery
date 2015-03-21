package com.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	
	private static ApplicationContext sApplicationContext = null;
	
	/**
	 * @function get the unique spring framework object which also is the application context 
	 * @return the application context singleton object
	 */
	public static ApplicationContext getApplicationContext(){
		if(sApplicationContext == null){
			sApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return sApplicationContext;
	}
	
	/**
	 * @function	get bean by passed name from the applicationcontext
	 * @param		beanId - the registed id of the bean in the applicationContext.xml or annotation
	 * @return 		the bean object
	 */
	public static Object getBeanById(String beanId){
		return getApplicationContext().getBean(beanId);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = ApplicationContextUtil.getBeanById("booksModel");
		System.out.println(object);
	}

}
