package com.p1.departments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String department;
	String dept_head;
	public department() {
		super();
	}
	public department(int id, String department, String dept_head) {
		super();
		this.id = id;
		this.department = department;
		this.dept_head = dept_head;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDept_head() {
		return dept_head;
	}
	public void setDept_head(String dept_head) {
		this.dept_head = dept_head;
	}
	@Override
	public String toString() {
		return "department [id=" + id + ", department=" + department + ", dept_head=" + dept_head + "]";
	}
	
	

}
