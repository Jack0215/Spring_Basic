package com.dto;

import java.util.Arrays;

public class LoginDTO {
	private String userid;
	private String passwd;
	private String [] phone;
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginDTO(String userid, String passwd, String[] phone) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.phone = phone;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone)+"\r";
	}
	
	
	
}
