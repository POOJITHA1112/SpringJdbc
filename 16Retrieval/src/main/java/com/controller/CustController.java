package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.Poojitha;
import com.service.ServiceImpl;

@Component
public class CustController {

	@Autowired
	private ServiceImpl serviceImpl;

	public void save(Poojitha ct) {
		serviceImpl.save(ct);
	}

	public void update(String name,double salary,String email,int id) {
		serviceImpl.update(name, salary, email, id);
	}

	public void delete(int id) {
		serviceImpl.delete(id);
	}
	public List<Poojitha>getAll(){
		return serviceImpl.getALl();
	}
	public List<Poojitha> findAll() {
		return serviceImpl.findAll();
	}
	public List<Poojitha>getPoojitha(){
		return serviceImpl.getPoojitha();
	}
	
	public void getById(int id) {
		serviceImpl.getById(id);
}
	
	public void getByName(String name) {
		serviceImpl.getByName(name);
}
}
