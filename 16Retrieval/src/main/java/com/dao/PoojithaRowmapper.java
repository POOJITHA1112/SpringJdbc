package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pojo.Poojitha;

public class PoojithaRowmapper implements RowMapper<Poojitha>{

	public Poojitha mapRow(ResultSet rs, int rowNum) throws SQLException {
		Poojitha poojitha=new Poojitha();
		poojitha.setId(rs.getInt(1));
		poojitha.setName(rs.getString(2));
		poojitha.setSalary(rs.getDouble(3));
		poojitha.setEmail(rs.getString(4));
		
		return poojitha;
		
	}

}
