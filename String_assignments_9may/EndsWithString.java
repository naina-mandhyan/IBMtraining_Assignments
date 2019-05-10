import java.util.Scanner;

class EndsWithString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		System.out.println("Enter sequence of Characters to end with");
		String str2 = scan.nextLine();
		if(str1.endsWith(str2))
			System.out.println("desirable end..");
		else
			System.out.println("ends differntly..");
	
	}
}

