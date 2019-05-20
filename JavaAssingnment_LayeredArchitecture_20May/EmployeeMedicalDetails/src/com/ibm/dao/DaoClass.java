package com.ibm.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.bean.Employees;
import com.ibm.dao.DaoInterface;

public class DaoClass implements DaoInterface {

	private HashMap<Integer, Employees> map = new HashMap<>();
//	{
//		
//	map.put(1,new Employees("Ajay","System Assosciate",7000));
//	map.put(2,new Employees("Rita","Programmer",30000));
//	map.put(3,new Employees("Sumit","Manager",50000));
//	map.put(4,new Employees("Alia","Clerk",2500));
//	
//	}
		

	public HashMap<Integer, Employees> getEmployee() {
		
		return map;
		
	}
	
	public void setEmployee(Integer id, String name, String designation, Integer salary){
		map.put(id, new Employees(name,designation,salary));
	}
	
	public Employees getSchemeId(Integer id) {
		for (Map.Entry val : map.entrySet()) {
			if(id == val.getKey()) {
				return (Employees)val.getValue();
			}
		}
		
		return null;
		
	}

	public boolean validateId(Integer id) {
		return map.containsKey(id);
	}
	
	
}
