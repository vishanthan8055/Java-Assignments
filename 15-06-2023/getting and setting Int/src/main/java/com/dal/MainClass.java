package com.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.application.Application;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("welcome.xml");
		Welcome wel = (Welcome)context.getBean("wel");
		System.out.println(wel.sayHi());

	}

}
