package com.dao;

import java.util.List;

import com.pojo.Poojitha;

public interface PoojithaDao {

	void save(Poojitha ct);

	void update(String name, double salary, String email, int id);

	void delete(int id);

	List<Poojitha> getALl();

	List<Poojitha> findAll();
	
	List<Poojitha>getPoojitha();
	
	void getById(int id);
	
	void getByName(String name);

}
