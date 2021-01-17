package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;

@Repository("dao")
public class DeptDAO {
	
	DeptDTO dto;
	
	public DeptDTO getDeptDTO() {
		return new DeptDTO(100,"관리","서울");
	}
	
} 
