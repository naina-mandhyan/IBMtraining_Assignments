package com.project.service;

import com.project.bean.UserDetails;

public interface PerformOperationInterface {
	String userNamePattern="[A-Za-z]+";
	public Integer checkBalance(Integer accNo);
	public boolean doDeposit(Integer accNo, Integer addBal);
	public boolean doWithdraw(Integer accNo, Integer subBal);
	public boolean doTransfer(Integer accNo, Integer toAcc, Integer amt);
	public Integer storeInDb(UserDetails user);
	public String viewTransactions(Integer accNo);
	public boolean validateAccNo(Integer accNo);
	public boolean validateMinDeposit(Integer addBal);
	public boolean validateAccBal(Integer subBal, Integer accNo);
	public String validateMobNo(Long mobNo);
	public boolean validateUserName(String name);
}
