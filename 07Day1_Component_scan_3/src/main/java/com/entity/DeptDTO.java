package com.entity;

public class DeptDTO {
	int deptno;
	String dname;
	String loc;
	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	int getDeptno() {
		return deptno;
	}
	void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	String getDname() {
		return dname;
	}
	void setDname(String dname) {
		this.dname = dname;
	}
	String getLoc() {
		return loc;
	}
	void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}
