package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {
	private JdbcTemplate JdbcTemplate;

	public TestDAO(DataSource dataSource) {
		JdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<TestDTO> select() {
		List<TestDTO> list = JdbcTemplate.query("select*from test",
				new RowMapper<TestDTO>() {// RowMapper, mapRow함수 오버라이딩
					public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException {
						TestDTO dto = new TestDTO();// 구현은 레코드의 내용을 읽어와 컬럼의 값을 꺼내
						dto.setNum(rs.getInt(1));// Model(dto)에 담아서 리턴하는 부분만 구현
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						return dto;
					}
				});
		return list;
	}

	public List<TestDTO> selectByName(String name) {
		List<TestDTO> list = JdbcTemplate.query("select*from test where username=?", 
			new RowMapper<TestDTO>() {// RowMapper,																					// 오버라이딩
				public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException {
				TestDTO dto = new TestDTO();
				dto.setNum(rs.getInt(1));
				dto.setAddress(rs.getString(2));
				dto.setUsername(rs.getString(3));
				return dto;
			}
		}, name); //여기서의 name은 query의 ?에 들어간다.
		return list;
	}
	
	public void insert(int num, String name, String address) {
		JdbcTemplate.update("insert into test(num, username, address) values(?,?,?)",
				num, name, address);
	}

}
