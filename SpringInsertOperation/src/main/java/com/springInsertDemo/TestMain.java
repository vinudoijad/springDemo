package com.springInsertDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) ap.getBean("s");
		System.out.println("Student data>> :" + student);

	}

}
