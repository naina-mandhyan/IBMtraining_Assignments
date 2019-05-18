class ReverseThenSort{
	public static void main(String[] args) {

		ReverseThenSort rn = new ReverseThenSort();
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("\nEnter the number of elements of the array: ");
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("\nEnter the elements of array: ");
		
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		
		System.out.println("\nOriginal Array: ");

		for(int no : arr)
		 	System.out.print(no + " ");

		System.out.println("\n\nArray with reversed numbers: ");

		for(int i = 0; i<arr.length; i++){
			arr[i] = rn.reverseInt(arr[i]);
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nSorted array: ");

		int[] sortedArr = rn.getSorted(arr);

		for(int no : sortedArr)
		 	System.out.print(no + " ");

	}

	int[] getSorted(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return(arr);
	}

	int reverseInt(int n){
		int rev = 0;
		while(n>0){
			rev = rev * 10;
			rev += n % 10;
			n = n/10;
		}
		return rev;


	}
}