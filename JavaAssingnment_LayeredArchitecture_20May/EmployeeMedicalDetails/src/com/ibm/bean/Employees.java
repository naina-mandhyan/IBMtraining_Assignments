package com.ibm.bean;

import java.util.HashMap;

//import com.ibm.ui.Employees;
//import com.ibm.ui.Hashmap;
//import com.ibm.ui.emp;

public class Employees {
	
	
	private String empName, designation, scheme;
	private Integer salary;
	

	public Employees(String empName, String designation, Integer salary) {
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
	public String toString() {
		return ("EmpName=" + empName + ", EmpSalary=" + salary + ", Designation=" + designation + ", Scheme=" + scheme);
	}

}
