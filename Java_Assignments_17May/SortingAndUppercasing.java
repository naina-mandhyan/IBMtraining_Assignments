class SortingAndUppercasing{
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		str = str.toLowerCase();
		//System.out.println(str);
		String[] strArr = str.split(" ");
		java.util.Arrays.sort(strArr);
		int ln = strArr.length;
		if (ln % 2 == 0){
			for(int i = 0; i < (ln/2); i++)
				strArr[i] = strArr[i].toUpperCase();
		}
		else
			for(int i = 0; i < (ln/2)+1 ; i++)
				strArr[i] = strArr[i].toUpperCase();

		System.out.println(String.join(" ", strArr));
	}

}