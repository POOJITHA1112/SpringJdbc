package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Employee;

public class ClientTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee bean2 = (Employee) context.getBean("employee");
		System.out.println(bean2);
		
		Resource rc=new ClassPathResource("spring.xml");
		BeanFactory bf=new XmlBeanFactory(rc);
//		Employee bean = bf.getBean(Employee.class);
		Employee bean = (Employee) bf.getBean("employee");
		System.out.println(bean);
//		Employee bean2 = (Employee) bf.getBean("employee");
//		Employee bean3 = (Employee) bf.getBean("employee");
//		Employee bean4 = (Employee) bf.getBean("employee");
//		System.out.println(bean2);
//		System.out.println(bean3);
//		System.out.println(bean4);

		


	}

}
