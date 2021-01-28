package com.ba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;    
import java.util.Date;   

@Aspect
@Component
public class CustomerAspect {
	
	  Date date = new Date();  
      Timestamp ts=new Timestamp(date.getTime());  

	@Before("execution(* com.ba.service.*ServiceImpl.add*(..))")
	public void addCustomerBefore(JoinPoint joinPoint) {
		System.out.println(ts+" tarihinde");
		 System.out.println( joinPoint.getArgs()[0]+ "eklendi");
	     System.out.println(joinPoint.getSignature());
	}
	
	@After("execution(* com.ba.service.*ServiceImpl.add*(..))")
	public void addCustomerAfter(JoinPoint joinPoint) {
		System.out.println(ts+" tarihinde");
		 System.out.println("addCustomer mehtodu başarılı olarak sonlandı");
	}
	
}
