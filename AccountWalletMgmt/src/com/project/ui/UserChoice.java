package com.project.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.project.bean.UserDetails;
import com.project.service.PerformOperation;
import com.project.service.PerformOperationInterface;

public class UserChoice {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PerformOperation service = new PerformOperation();
		Integer accNo = 0;
		Integer choice = 0;
		
		while(true) {
		try {
			System.out.println("Enter your Choice: \n1.Create New Account \n2.Already have an Account ?  ");
			choice = scan.nextInt();
			scan.nextLine();
			break;
		}
		catch(InputMismatchException e) {
			System.out.println("Please input a number only");
			scan.next();
		}
		scan.nextLine();
		}
		switch(choice) {
		case 1:
			System.out.println("Enter your name");
			String name;
			while(true) {
			name = scan.nextLine();
			if(service.validateUserName(name))
				break;
			System.out.println("Enter valid name(Letters only)");
			}
			System.out.println("Enter mobile number");
			Long mobNo;
			while(true) {
				while(true) {
					try {
						mobNo = scan.nextLong();
						scan.nextLine();
						break;
					}catch(InputMismatchException e) {
						System.out.println("Enter mobile number again (number only)");
						scan.next();
					}
					scan.nextLine();	
				}
			
			String result = service.validateMobNo(mobNo);
			if(result.equalsIgnoreCase("pass"))
				break;
			System.out.println(result);
			}
			UserDetails user = new UserDetails(name,mobNo);
			accNo = service.storeInDb(user);
			System.out.println("Account Created \nYour account no is: " + accNo);
			walletServices(service, accNo);
			break;
		case 2:
			System.out.println("Enter the account number");
			while(true) {
				while(true) {
					try {
						accNo = scan.nextInt();
						scan.nextLine();
						break;
					}catch(InputMismatchException e) {
						System.out.println("Enter account number again(number only)");
						scan.next();
					}
					scan.nextLine();
				}
				boolean accExist = service.validateAccNo(accNo);
				if(accExist) 
					break;
				System.out.println("Invalid account number..try again");
				}
			walletServices(service, accNo);
			break;
		}
		System.out.println("Thank You..");
		
		
	}

	private static void walletServices(PerformOperation service, Integer accNo) {
		Scanner scan = new Scanner(System.in);
		Integer option = 0;
		
			System.out.println("\r Welcome to the wallet services: "
					+ "\n1.Check Balance"
					+ "\n2.Deposit amount"
					+ "\n3.Withdraw amount"
					+ "\n4.Transfer Funds"
					+ "\n5.View all transactions"
					+ "\n6.Exit");
				
			option = scan.nextInt();
			scan.nextLine();
				
			switch(option) {
			case 1:
				Integer bal = service.checkBalance(accNo);
				System.out.println(bal);
				walletServices(service, accNo);
				break;
			case 2:
				doDeposit(accNo, service);
				break;
			case 3:
				doWithdraw(accNo, service);
				break;
			case 4:
				doTransfer(accNo, service);
				break;
			case 5:
				String result = service.viewTransactions(accNo);
				System.out.println("Transfer Type -- Transfered Amount -- Date and Time");
				System.out.println(result);
				walletServices(service, accNo);
				break;
			case 6:
				break;
			}
		
	}

	private static void doTransfer(Integer accNo, PerformOperation service) {
		Scanner scan = new Scanner(System.in);
		Integer toAcc = 0, amt = 0;
		System.out.println("Enter the receiver's account number");
		while(true) {
			while(true) {
				try {
					toAcc = scan.nextInt();
					scan.nextLine();
					break;
				}catch(InputMismatchException e) {
					System.out.println("Enter account number again(number only)");
					scan.next();
				}
				scan.nextLine();
			}
		boolean accExist = service.validateAccNo(accNo);
		if(accExist) 
			break;
		System.out.println("Invalid account number..try again");
		}
		System.out.println("Enter the amount to transfer");
		while(true) {
		amt = scan.nextInt();
		scan.nextLine();
		if(service.validateAccBal(amt, accNo))
			break;
		System.out.println("entered amount is more than the available balance \nCurrent balance is: " + service.checkBalance(accNo) + "\nEnter amount again");
		}
		if(service.doTransfer(accNo,toAcc,amt))
			System.out.println(amt + " Rs. transefered from account no " + accNo + " to account no " + toAcc + "\n your current balance is: "+ service.checkBalance(accNo));
		walletServices(service, accNo);
		
	}

	private static void doWithdraw(Integer accNo, PerformOperation service) {
		Scanner scan = new Scanner(System.in);
		Integer subBal = 0;
		System.out.println("Enter the amount you want to withdraw");
		while(true) {
		subBal = scan.nextInt();
		scan.nextLine();
		if(service.validateAccBal(subBal, accNo))
			break;
		System.out.println("entered amount is more than the available balance \nCurrent balance is: " + service.checkBalance(accNo) + "\nEnter amount again");
		}
		if(service.doWithdraw(accNo, subBal))
			System.out.println(subBal + " Rs. Withdrawn from account no " + accNo + "\ncurrent balance: " + service.checkBalance(accNo));
		walletServices(service, accNo);
		
	}

	private static void doDeposit(Integer accNo,PerformOperation service) {
		Scanner scan = new Scanner(System.in);
		Integer addBal = 0;
		System.out.println("Enter the amount you are adding");
		while(true) {
		addBal = scan.nextInt();
		scan.nextLine();
		if(service.validateMinDeposit(addBal))
			break;
		System.out.println("Min deposit amount is :3000  \nPlease enter the amount again");
		}
		if(service.doDeposit(accNo, addBal))
			System.out.println(addBal + " Rs. Deposited to account no " + accNo);
		walletServices(service, accNo);
		
	}
}
