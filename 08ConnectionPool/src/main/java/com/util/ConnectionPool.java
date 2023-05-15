package com.util;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPool {
	
	public static void main(String[] args) throws SQLException, NamingException, PropertyVetoException {
		
		
		//Spring-jdbc
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("poojitha");
		System.out.println(driverManagerDataSource);
		System.out.println(driverManagerDataSource.getConnection());
		
		
		//apache dbcp
		BasicDataSource basicDataSource=new BasicDataSource();
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("poojitha");
		System.out.println(basicDataSource);
		System.out.println(basicDataSource.getConnection());
		
		
		//c3p0 from jboss
		C3P0PooledDataSource c3p0PooledDataSource=new C3P0PooledDataSource();
		c3p0PooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc");
		c3p0PooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		c3p0PooledDataSource.setUser("root");
		c3p0PooledDataSource.setPassword("poojitha");
		System.out.println(c3p0PooledDataSource);
//		System.out.println(c3p0PooledDataSource.getConnectionTesterClassName());
		
		
		HikariDataSource hikariDataSource=new HikariDataSource();
		hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc");
		hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariDataSource.setUsername("root");
		hikariDataSource.setPassword("poojitha");
		System.out.println(hikariDataSource);
		System.out.println(hikariDataSource.getConnection());
		
		
	}

}
