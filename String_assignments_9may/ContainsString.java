import java.util.Scanner;

class ContainsString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		System.out.println("Enter sequence of Characters to check");
		String str2 = scan.nextLine();
		if(str1.contains(str2))
			System.out.println("it contains..");
	}
}

