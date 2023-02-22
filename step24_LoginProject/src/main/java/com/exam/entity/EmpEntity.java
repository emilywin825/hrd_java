package com.exam.entity;

public class EmpEntity {
	private int eno;
	private String ename;
	private String phone;
	private String dept;
	
	public EmpEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpEntity(int eno, String ename, String phone, String dept) {
		super();
		this.eno=eno;
		this.ename = ename;
		this.phone = phone;
		this.dept = dept;
	}
	public int getEno() {
		return eno;
	}
	
	public String getEname() {
		return ename;
	}

	public String getPhone() {
		return phone;
	}

	public String getDept() {
		return dept;
	}

	public void setEno(int eno) {
		this.eno= eno;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}	
}
