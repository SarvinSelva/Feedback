package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "feedback")
public class Employee {

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", EmployeeName=" + EmployeeName + ", Email=" + Email + ",Organization=" + Organization +",Country=" + Country +",, Comments=" + Comments + "]";
	}
@Id @GeneratedValue
private int empid;
private String EmployeeName;
private String Email;
private String Organization;
private String Country;
private String Comments;
public Employee() {
	super();
	
}
public Employee(String EmployeeName,String Email,String Organization,String Country,String Comments) {
	super();
	
	this.EmployeeName = EmployeeName;
	this.Email = Email;
	this.Organization = Organization;
	this.Country = Country;
	this.Comments = Comments;
	
	
}

}
