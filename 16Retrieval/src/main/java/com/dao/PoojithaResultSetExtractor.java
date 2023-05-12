package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pojo.Poojitha;

public class PoojithaResultSetExtractor implements ResultSetExtractor<List<Poojitha>> {

	public List<Poojitha> extractData(ResultSet rs) throws SQLException, DataAccessException {
	
		List<Poojitha>poo=new ArrayList<Poojitha>();
		while(rs.next()) {
			Poojitha p=new Poojitha();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setSalary(rs.getDouble(3));
			p.setEmail(rs.getString(4));
			poo.add(p);
			
		}
		
		System.out.println(poo);

		return poo;
	}

}
