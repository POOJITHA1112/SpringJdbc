package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.DaoImpl;
import com.pojo.Poojitha;

@Component
public class ServiceImpl implements CustService {

	@Autowired
	private DaoImpl daoimpl;
	
	public void save(Poojitha ct) {
		daoimpl.save(ct);
	}

	public void update(String name,double salary,String email,int id) {
		daoimpl.update(name, salary, email, id);
		
	}

	public void delete(int id) {
		daoimpl.delete(id);
		
	}

	public List<Poojitha> getALl() {
		
		return daoimpl.getALl();
	}

	public List<Poojitha> findAll() {
		return daoimpl.findAll();
	}

	public List<Poojitha> getPoojitha() {
		return daoimpl.getPoojitha();
	}

	public void getById(int id) {
		daoimpl.getById(id);
		
	}

	public void getByName(String name) {
		daoimpl.getByName(name);
		
	}

}
