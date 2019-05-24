package com.project.service;

import com.project.bean.UserDetails;
import com.project.dao.ManageAccounts;
import com.project.dao.ManageAccountsInterface;

public class PerformOperation implements PerformOperationInterface{
	
	ManageAccountsInterface dao = new ManageAccounts();
	String type = "";

	public Integer checkBalance(Integer accNo) {
		return(dao.checkBalance(accNo));
	}

	public boolean doDeposit(Integer accNo, Integer addBal) {
		type = "deposit";
		return(dao.doDeposit(accNo, addBal, type));
		
	}

	public boolean doWithdraw(Integer accNo, Integer subBal) {
		type = "withdraw";
		return(dao.doWithdraw(accNo, subBal, type));
		
	}

	public boolean doTransfer(Integer accNo, Integer toAcc, Integer amt) {
		type = "transfer";
		return(dao.doTransfer(accNo, toAcc, amt, type));
	}

	public Integer storeInDb(UserDetails user) {
		return(dao.storeInDb(user));
		
	}

	public String viewTransactions(Integer accNo) {
		return(dao.viewTransactions(accNo));
		
	}

	public boolean validateAccNo(Integer accNo) {
		
		return dao.getAccNo(accNo);
	}

	public boolean validateMinDeposit(Integer addBal) {
		if(addBal >= 3000)
			return true;
		return false;
	}

	public boolean validateAccBal(Integer subBal, Integer accNo) {
		if(checkBalance(accNo) >= subBal)
			return true;
		return false;
	}

	public String validateMobNo(Long mobNo) {
		String mob = String.valueOf(mobNo);
		if(!mob.matches("\\d{10}") )
			return "Mobile number should be of 10 digits";
		if(dao.getMobNo(mobNo))
			return "Mobile number already exists";
		return "pass";
	}
	
	public boolean validateUserName(String name) {
		if(name.matches(userNamePattern))
			return true;
		
		return false;
	}
	

}
