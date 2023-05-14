package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pojo.Poojitha;

@Component
public class DaoImpl implements PoojithaDao {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger LOGS = LoggerFactory.getLogger(DaoImpl.class);

	public void save(Poojitha ct) {
		LOGS.info("dao impl save method start here ..........");
		System.out.println("dao impl save method start here ..........");

		String query = "insert into poojitha values(?,?,?,?)";
		int result = jdbcTemplate.update(query,
				new Object[] { ct.getId(), ct.getName(), ct.getSalary(), ct.getEmail() });

		LOGS.info("save method result .........." + result);
		System.out.println("save method result .........." + result);
		LOGS.info("dao impl save method ends here ..........");

	}

	public void update(String name, double salary, String email, int id) {
		LOGS.info("update method started here.....");
		System.out.println("update method started here.....");
		String query = "update poojitha set name=?,salary=?,email=? where id=?";
		int update = jdbcTemplate.update(query, name, salary, email, id);
		System.out.println(update);
		LOGS.info("update  method result .........." + update);
		System.out.println("update  method result .........." + update);
		LOGS.info("dao impl save method ends here ..........");

	}

	public void delete(int id) {
		LOGS.info("dao impl save method start here ..........");

		String query = "delete from poojitha where id=?";
		int delete = jdbcTemplate.update(query, id);

		LOGS.info("employee result .........." + id);

	}

	public List<Poojitha> getALl() {
//		LOGS.info("daoimpl maprow method starts here");
//		RowMapper<Poojitha> rowMapper = new RowMapper<Poojitha>() {
//
//			public Poojitha mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Poojitha p = new Poojitha();
//				p.setId(rs.getInt(1));
//				p.setName(rs.getString(2));
//				p.setSalary(rs.getDouble(3));
//				p.setEmail(rs.getString(4));
//				return p;
//
//			}
//		};
//		LOGS.info("daoimpl maprow method ends here");
//		LOGS.info("doimpl resultset executing......");
//		List<Poojitha> ps = jdbcTemplate.query("select * from poojitha", rowMapper);
//		LOGS.info("ps..." + ps);
//		return ps;
		
		List<Poojitha> query = jdbcTemplate.query("select * from poojitha", new PoojithaRowmapper());
		System.out.println(query);

		LOGS.info("GetAll by RowMapper....."+query);
		return query;
	}

	public List<Poojitha> findAll() {
		
		return jdbcTemplate.query("select * from poojitha", new PoojithaResultSetExtractor());
	}

	public List<Poojitha> getPoojitha() {
		
		return 	jdbcTemplate.query("select * from poojitha", new BeanPropertyRowMapper<Poojitha>(Poojitha.class));

		
	}

	public void getById(int id) {

		String query="select * from poojitha where id=?";
		 List<Poojitha> query2 = jdbcTemplate.query(query,new Object[] {id} ,new PoojithaResultSetExtractor());
		System.out.println(query2);
		
	}

	public void getByName(String name) {
		
		String query="select * from poojitha where name=?";
		BeanPropertyRowMapper<Poojitha>p=new BeanPropertyRowMapper<Poojitha>();
		List<Poojitha> getbyname = jdbcTemplate.query(query, new Object[] {name}, p);
		LOGS.info("select by name is here"+ getbyname);
	}

//	public void getByName(String name) {
//		String query="select * from poojitha where name=?";
//		List<Poojitha> query2 = jdbcTemplate.query(query, new Object[] {name}, new PoojithaRowmapper());
//		System.out.println(query2);
//	}

	
	

}
