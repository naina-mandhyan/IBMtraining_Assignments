package com.project.bean;

public class UserDetails {
	private Integer accountNo;
	private String userName;
	private Long phoneNo;
	private Integer balance;
	
	public UserDetails(String userName, Long mobNo) {
		
		this.userName = userName;
		this.phoneNo = mobNo;
		this.balance = 1000;
	}
	
	public Integer getAccountNo() {
		return accountNo;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Long getPhoneNo() {
		return phoneNo;
	}
	
	public Integer getBalance() {
		return balance;
	}
	
}
