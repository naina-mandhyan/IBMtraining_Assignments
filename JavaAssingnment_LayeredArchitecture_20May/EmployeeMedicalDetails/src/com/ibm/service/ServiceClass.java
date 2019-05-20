package com.ibm.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ibm.bean.Employees;
import com.ibm.dao.DaoClass;
import com.ibm.dao.DaoInterface;

public class ServiceClass implements ServiceInterface {
	
	Scanner scan = new Scanner(System.in);
	
	DaoClass dao = new DaoClass();
	
	String str = "";
	
	public boolean validateId(Integer id) {
		return (dao.validateId(id));
	}
	
	public void setEmployee(Integer id, String name, String designation, Integer salary) {
		
			dao.setEmployee(id, name, designation, salary);
	}
	
	public String getEmployee() {
		HashMap<Integer, Employees> hm = dao.getEmployee();
		for (Map.Entry val : hm.entrySet())
			str += "Emp Id:"+ val.getKey() + " : " + val.getValue() +"\n";
		return str;
	}
	
	public void setScheme(Integer id) {
		Employees emp = (Employees)dao.getSchemeId(id);
								
		if(emp.getSalary() > 5000 && emp.getSalary() < 20000 && emp.getDesignation().equalsIgnoreCase("System Assosciate")) {
			emp.setScheme("Scheme C");
		}
		else if(emp.getSalary() >= 20000 && emp.getSalary() < 40000 && emp.getDesignation().equalsIgnoreCase("Programmer")) {
			emp.setScheme("Scheme B");
		}
		else if(emp.getSalary() > 40000 && emp.getDesignation().equalsIgnoreCase("Manager")) {
			emp.setScheme("Scheme A");
		}
		else if(emp.getSalary() < 5000 && emp.getDesignation().equalsIgnoreCase("Clerk")) {
			emp.setScheme("No Scheme");
		}
		else
			emp.setScheme("No Scheme");
	}
	
	public String getScheme(Integer id) {
		Employees emp = (Employees)dao.getSchemeId(id);
		return(emp.getScheme());
		
	}
				
					
}

