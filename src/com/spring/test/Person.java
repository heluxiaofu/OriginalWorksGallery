package com.spring.test;

import org.springframework.stereotype.Component;

import com.spring.util.ApplicationContextUtil;

interface IPerson{
	void sayHello();
	void sayAnotherHello();
}

@Component
public class Person implements IPerson{
	
	public void sayHello(){
		System.out.println("Hello Aspect");
	}
	
	public void sayAnotherHello(){
		System.out.println("Another Hello Aspect");
	}
	
	
	
	public static void main(String[] args) {
		IPerson bean = (IPerson) ApplicationContextUtil.getBeanById("person"); 
		bean.sayHello();
		//bean.sayAnotherHello();
	}
}
