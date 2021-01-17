package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {
	@Autowired 
	SqlSessionTemplate template; //Sqlsessionr과 동일기능
	public void tx() throws Exception {
		template.delete("DeptMapper.deptDelete", 10); //detpno 10번 삭제
		DeptDTO dto = new DeptDTO (1, "6666", "6666"); //deptno 1번 추가
		template.insert("DeptMapper.deptInsert",dto); //하지만 1번이 있는 상황
	}												//둘 다 완료되지 않았으므로
													//10번 삭제 코드까지 롤백
	
	public List<DeptDTO> selectAll(){
		return template.selectList("DeptMapper.selectAll");
	}
}
