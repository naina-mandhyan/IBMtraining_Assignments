import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee{
	private String  name, address, fname, lname;
	private Integer id, age;

	Employee(Integer id, String name, Integer age, String address){
		this.id = id;
		//this.name = name;
		this.age = age;
		this.address = address;
		String[] nameArr = name.split(" ");
		if(nameArr.length > 1){
			this.fname = nameArr[0];
			this.lname = nameArr[1];
		}
		else{
			this.fname = name;
			this.lname = "";
		}
	}

	public Integer getId(){
		return this.id;
	}

	public String getFirstName(){
		return this.fname;
	}

	public String getLastName(){
		return this.lname;
	}

	public Integer getAge(){
		return this.age;
	}

	public String getAddress(){
		return this.address;
	}

	public String toString(){
		return("Id: " + this.id + "Name: " + this.fname + " " +this.lname + "Age: " + this.age + "Address: " + this.address);
	}
}

class EmployeeSorting{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		EmployeeSorting ed = new EmployeeSorting();
		Scanner scan = new Scanner(System.in);
		String ch;
		do{
			System.out.println("Add New Employee:");
			ed.addEmployee(list);
			System.out.println("Want to add more employees?(Y/N)");
			ch = scan.nextLine();

		}while(!ch.equals("N"));

		System.out.println("Employees List" + list);

		System.out.println("Sort by: \n1.ID \n2.Age \n3.Address \n4.First Name \n5.Last Name");
		Integer choice = scan.nextInt();
		switch(choice){
			case 1: Collections.sort(list, new SortById());  break;
			case 2: Collections.sort(list, new SortByAge()); break;
			case 3: Collections.sort(list, new SortByAddress()); break;
			case 4: Collections.sort(list, new SortByFirstName()); break;
			case 5: Collections.sort(list, new SortByLastName()); break;
		} 

		System.out.println("Sorted Employees List" + list);
	}

	void addEmployee(ArrayList list){
		// String id, name, address;
		// Integer age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter EmployeeID:");
		Integer id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Employee Name:");
		String name = scan.nextLine();
		System.out.println("Enter Employee Address:");
		String address = scan.nextLine();
		System.out.println("Enter Employee Age:");
		Integer age = scan.nextInt();
		list.add(new Employee(id,name,age,address));
	}
}

class SortById implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
		return (((Employee)firstObject).getId()).compareTo(((Employee)secondObject).getId());   
    }
}

class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
		return (((Employee)firstObject).getAge()).compareTo(((Employee)secondObject).getAge());   
    }
}

class SortByAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
		return (((Employee)firstObject).getAddress()).compareToIgnoreCase(((Employee)secondObject).getAddress());   
    }
}

class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
		return (((Employee)firstObject).getFirstName()).compareToIgnoreCase(((Employee)secondObject).getFirstName());   
    }
}

class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
		return (((Employee)firstObject).getLastName()).compareToIgnoreCase(((Employee)secondObject).getLastName());   
    }
}


 
