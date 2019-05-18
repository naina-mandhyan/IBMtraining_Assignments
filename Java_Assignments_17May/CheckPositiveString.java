class CheckPositiveString{
	public static void main(String[] args) {
		System.out.println("Enter a string");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.nextLine();
		CheckPositiveString ps = new CheckPositiveString();
		boolean result = ps.positiveString(str);
		if(result == true)
			System.out.println("Positive string");
		else
			System.out.println("Not a positive string");
	}

	boolean positiveString(String str){
		String temp = str;
		temp = temp.replace(" ", "");
		temp = temp.toLowerCase();
		String[] tempArr = temp.split("");
		java.util.Arrays.sort(tempArr);
		String sorted = String.join("", tempArr);
		if(temp.equals(sorted))
			return true;
		else
			return false;
	}
}