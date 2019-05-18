class ValidateRegistration{
	
	boolean validateUserName(String userName){
		if(userName.endsWith("_job")){
			int i = userName.indexOf("_");
			String sub = userName.substring(0,i);
			if(sub.length() >= 8)
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		ValidateRegistration vr = new ValidateRegistration();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter user name");
		String userName = scan.nextLine();
		boolean result = vr.validateUserName(userName);
		if(result == true)
			System.out.println("User name available");
		else
			System.out.println("Invalid user name");

	}
}