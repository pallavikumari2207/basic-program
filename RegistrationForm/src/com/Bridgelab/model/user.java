package com.Bridgelab.model;

public class user {
	private String email;
	private String pwd;
	@Override
	public String toString() {
		return "user [email=" + email + ", pwd=" + pwd + ", mob=" + mob + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public user() {}
	public user(String email, String pwd, String mob, String fname, String lname) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.mob = mob;
		this.fname = fname;
		this.lname = lname;
	}
	private String mob;
	private String fname;
	private String lname;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}	
}
