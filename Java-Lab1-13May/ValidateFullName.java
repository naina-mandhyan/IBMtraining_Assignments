import java.util.Scanner;

class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}

class ValidateFullName{
	
	public static void main(String[] args){
		ValidateFullName obj = new ValidateFullName();
		try{
			obj.validateFunc();
		}
		catch(MyException e){
			System.out.println(e);
		}
		
	}

	void validateFunc() throws MyException{
	
		System.out.println("Enter first name");
		Scanner scan = new Scanner(System.in);
		String firstName = scan.nextLine();
		if(firstName.equals(""))
			throw new MyException("First name can't be left blank");
		System.out.println("Enter last name");
		String lastName = scan.nextLine();
		if(lastName.equals(""))
			throw new MyException("Last name can't be left blank");

	 }
}
