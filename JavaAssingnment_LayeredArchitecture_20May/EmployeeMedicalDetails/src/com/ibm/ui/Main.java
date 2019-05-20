package com.ibm.ui;
import com.ibm.bean.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ibm.service.ServiceClass;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ServiceClass serv = new ServiceClass();
		String choice  = "";
		do {
		System.out.println("Enter your choice: \n1.Enter Employee Details. \n2.Get employee details \n3.Get Medical Scheme for employee");
		int option = scan.nextInt();
		switch(option){
		
		case 1: System.out.println("Enter employee ID");
				Integer id = scan.nextInt();
				scan.nextLine();
				while(true) {
					if(!serv.validateId(id))
						break;
					System.out.println("Id already exists.. Enter new Id..");
					id = scan.nextInt();
					scan.nextLine();
				}
				System.out.println("Enter employee name");
				String name = scan.nextLine();
				System.out.println("Enter employee salary");
				Integer salary = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter employee designation");
				String designation = scan.nextLine();
				serv.setEmployee(id, name, designation, salary);
				serv.setScheme(id);
				break;
		
		case 2: System.out.println(serv.getEmployee()); break;
				
		case 3: System.out.println("Enter the employee Id to know the Scheme");
				Integer checkId = scan.nextInt();
				System.out.println(serv.getScheme(checkId));
				break;
				
		default: System.out.println("Wrong choice entered.. Try again..");
				
		}
		System.out.println("Want to continue(yes/no)");
		choice = scan.next();
		}while(choice.equals("yes"));
	}
}
