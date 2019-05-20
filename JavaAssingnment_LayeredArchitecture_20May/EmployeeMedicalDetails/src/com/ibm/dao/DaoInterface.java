package com.ibm.dao;

import java.util.HashMap;

import com.ibm.bean.Employees;

public interface DaoInterface {
	
	public HashMap<Integer, Employees> getEmployee();
	public void setEmployee(Integer id, String name, String designation, Integer salary);
	
}
