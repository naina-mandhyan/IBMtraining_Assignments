class SumNumbersDivBy{
	int calculateSum(int n){
		int sum = 0;
		int count = 0;
		for(int i = 1; count < n; i++){
			if((i % 3) == 0 || (i % 5) == 0){
				sum += i; 
				count++;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		SumNumbersDivBy sm = new SumNumbersDivBy();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a no.");
		int n = scan.nextInt();
		int sum = sm.calculateSum(n);
		System.out.println("Sum: " + sum);
	}
}