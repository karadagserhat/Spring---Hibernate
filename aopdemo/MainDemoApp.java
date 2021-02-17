package com.serhatkaradag.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.serhatkaradag.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		//read config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//call method
		theAccountDAO.addAccount();
		theAccountDAO.addAccount();
		  
		//close
		context.close();
	}

}
