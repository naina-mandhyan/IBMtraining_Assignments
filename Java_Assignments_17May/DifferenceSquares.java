class DifferenceSquares{
	int calculateDifference(int n){

		int sumOfSqr = 0, sqrOfSum = 0;
		int diff;
		for(int i = 1; i <= n; i++){
			sumOfSqr += ( i * i );
			sqrOfSum += i;
		}
		System.out.println("Sum of squares of first " + n + " natural numbers is: " + sumOfSqr );
		System.out.println("Square of sum of first " + n + " natural numbers is: " + (sqrOfSum * sqrOfSum));
		diff = sumOfSqr - (sqrOfSum * sqrOfSum);
		return diff;
		
	}

	public static void main(String[] args) {

		DifferenceSquares ds = new DifferenceSquares();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scan.nextInt();
		int diff = ds.calculateDifference(n);
		if(diff < 0)
			System.out.println("Required difference is: " + (0-diff));
		else
			System.out.println("Required difference is: " + diff);

	}
}