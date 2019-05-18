class FindSecondSmallest{
	int getSecondSmallest(int[] arr){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < arr.length-i-1; j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return(arr[arr.length-2]);
	}
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = scan.nextInt();
		int[] input = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < n; i++)
			input[i] = scan.nextInt();
		FindSecondSmallest fn = new FindSecondSmallest();
		int secSmall = fn.getSecondSmallest(input);
		System.out.println("Second smallest number of array is: "+ secSmall);
	}
}