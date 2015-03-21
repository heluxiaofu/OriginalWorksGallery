package com.spring.test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUseAspect {
	
	@Pointcut(value = "execution(* com.spring.test.Person.sayHello(..))")
	public void anyMethod(){}	//AOP Pointcut Signature
	
	@Before(value = "anyMethod()")
	public void sayBefore(){
		System.out.println("---before---");
	}
	
	public void sayAround(){
		System.out.println("---around---");
	}
	
	@AfterReturning(value = "anyMethod()")
	public void sayAfter(){
		System.out.println("---after---");
	}
}
