package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	private JdbcTemplate jdbcTemplate; // new 한게 없음. xml에서 주입받아서 사용할것임

	public ProductDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ProductDTO> selectProduct() {
		String query = "select*from t_product order by pcode";

		return jdbcTemplate.query(query, new RowMapper<ProductDTO>() {

			public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductDTO dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto;
			}
		});
	}
	public List<OrderDTO> selectOrder() {
		String query = "select*from t_order order by pcode";
		return jdbcTemplate.query(query, new RowMapper<OrderDTO>() {
			
			public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderDTO dto = new OrderDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setNum(rs.getInt("num"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto; 
			}
		});
	} 
	
	public void addOrder(String pcode, int quantity) {
		String q1 = "update t_product set  quantity = quantity - ? where pcode =?";
		int n = jdbcTemplate.update(q1, quantity, pcode);
		System.out.println("update t_product :" +n);
		
		String q2 = "in into t_order (num, pcode, quantity) values (t_order_seq.nextval, ?, ?)";
		int n2 = jdbcTemplate.update(q2, pcode, quantity);
		System.out.println("insert t_order :"+n2); 
	}
}
