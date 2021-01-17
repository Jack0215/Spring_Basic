package com.spring;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;


public class EchoBeanTest {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:Echobean.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		String mesg = service.getService();
		System.out.println(mesg);  
	} 
}
