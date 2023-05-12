package com.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.CustController;
import com.pojo.Poojitha;

public class ClientTest {
	
	public static void main(String[] args) {
		
		Poojitha ct=new Poojitha(4, "sai Srinivas", 79000.00, "saiSrinivas@gmail.com");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CustController bean = context.getBean(CustController.class);
//		bean.save(ct);
//		bean.update("poojitha", 45000.00, "poojitha@gmail.com", 3);
//		bean.delete(4);
//		bean.getAll();
//		bean.findAll();
//		List<Poojitha> poojitha = bean.getPoojitha();
//		System.out.println(poojitha);
//		bean.getById(3);
		bean.getByName("mahesh");
		
		
	}

}
