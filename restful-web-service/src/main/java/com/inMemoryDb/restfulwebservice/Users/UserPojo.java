package com.inMemoryDb.restfulwebservice.Users;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


public class UserPojo {
	
	Integer id;
	@Size(min = 2, message = "size must be more than 2 char")
	String name;
	@Past
	Date dob;
	String dept;
	public UserPojo() {
		// TODO Auto-generated constructor stub
	}
		
	public UserPojo(Integer id, String name, Date date, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dob = date;
		this.dept = dept;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNameString() {
		return name;
	}
	public Date getDate() {
		return dob;
	}
	public String getDept() {
		return dept;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNameString(String nameString) {
		this.name = nameString;
	}
	public void setDate(Date date) {
		this.dob = date;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", name=" + name + ", date=" + dob + ", dept=" + dept + "]";
	}
	

}
