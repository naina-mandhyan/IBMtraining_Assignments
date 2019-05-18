class CheckIncreasingNumber{

	boolean checkNumber(int n){
		int rem = 10;
		do{
			int ln = n % 10;
			if(rem != 10){
				if(ln <= rem){
					rem = ln;
					n = n/10;
				}
				else
					return false;
			}
			else{
				rem = ln;
				n = n/10;
			}
		}while(n>0);

		return true;

	}

	public static void main(String[] args) {
		CheckIncreasingNumber cn = new CheckIncreasingNumber();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scan.nextInt();
		boolean result = cn.checkNumber(n);
		if(result == true)
			System.out.println("It is increasing number");
		else
			System.out.println("It is not an increasing number");

	}
	
}