class CubesOfDigits{

	void findDigitsCube(int n){
	
		int rem;
		int cubes = 0;
		for(int i = 0; n > 0; i++){
			rem = n % 10;
			cubes += rem * rem * rem;
			n = n / 10;

		}

		System.out.println("Sum of cubes of the digits is: " + cubes);
	}

	public static void main(String[] args) {

		CubesOfDigits cod = new CubesOfDigits();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scan.nextInt();
		cod.findDigitsCube(n);
		
	}
}