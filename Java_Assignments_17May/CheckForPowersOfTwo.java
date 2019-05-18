class CheckForPowersOfTwo{
	boolean checkNumber(int n){
		int pow = 2;
		int i = 1;
		while(n > pow){
			pow = 2;
			for(int j = 1; j < i ; j++){
				pow = pow * 2;
				if(pow == n)
					return true;
			}
			i++;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckForPowersOfTwo check = new CheckForPowersOfTwo();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scan.nextInt();
		boolean ans = check.checkNumber(n);
		if(ans == true)
			System.out.println(n + " is one of the powers of 2");
		else
			System.out.println(n + " is not one of the power of 2");
	}
}