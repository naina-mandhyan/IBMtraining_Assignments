import java.util.Scanner;

class CompareIgnoringCases{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		System.out.println("Enter second string");
		String str2 = scan.nextLine();
		int result = str1.compareToIgnoreCase(str2);
		if(result == 0){
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are different");
		}

	}
}