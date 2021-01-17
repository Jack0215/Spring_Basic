package com.dto;

public class Login {
	private String useid;
	private String passwd;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String useid, String passwd) {
		super();
		this.useid = useid;
		this.passwd = passwd;
	}
	public String getUseid() {
		return useid;
	}
	public void setUseid(String useid) {
		this.useid = useid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Login [useid=" + useid + ", passwd=" + passwd + "]";
	}
	
	
}
