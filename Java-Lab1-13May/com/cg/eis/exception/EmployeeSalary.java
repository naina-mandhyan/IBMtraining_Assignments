package com.cg.eis.exception;
import java.util.Scanner;

class EmployeeException extends Exception{
	EmployeeException(String msg){
		super(msg);
	}
}

public class EmployeeSalary{

	public static void main(String[] args){
		EmployeeSalary empExp = new EmployeeSalary();
		try{
			empExp.checkSal();
		}
		catch(EmployeeException e){
			System.out.println(e);
		}
	}
	
	void checkSal() throws EmployeeException{
		System.out.println("Enter your salary");
		Scanner scan = new Scanner(System.in);
		int sal = scan.nextInt();
		if(sal < 3000)
			throw new EmployeeException("Sorry, your salary is not up to the mark to have these benefits..");
		else
			System.out.println("Getting benefits suggestions...");
	}
}
