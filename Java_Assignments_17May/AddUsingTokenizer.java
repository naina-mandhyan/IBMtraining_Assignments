class AddUsingTokenizer{
	public static void main(String[] args) {
		
		System.out.println("Enter the numbers to add");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String intLine = scan.nextLine();
		int sum = 0;
		int number = 0;
		System.out.println("Elements of array");
		java.util.StringTokenizer st = new java.util.StringTokenizer(intLine);
     	while (st.hasMoreTokens()) {
     		number = Integer.parseInt(st.nextToken());
        	System.out.println(number);
        	sum += number;
    	}

    	System.out.println("Sum of elements: " +sum);

	}
}