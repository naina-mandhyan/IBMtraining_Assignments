package com.project.dao;

import com.project.bean.UserDetails;

public interface ManageAccountsInterface {
	
	public Integer checkBalance(Integer accNo);
	public boolean doDeposit(Integer accNo, Integer addBal, String type);
	public boolean doWithdraw(Integer accNo, Integer subBal, String type);
	public boolean doTransfer(Integer accNo, Integer toAcc, Integer amt, String type);
	public Integer storeInDb(UserDetails user);
	public void recordTransaction(Integer accNo, String type, Integer amt);
	public String viewTransactions(Integer accNo);
	public boolean getAccNo(Integer accNo);
	public boolean getMobNo(Long mobNo);
}
