package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;

public class ClientTest {
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		Person bean = (Person) ap.getBean("person");
		System.out.println(bean);
	}

}
