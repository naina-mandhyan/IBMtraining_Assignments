import java.util.Scanner;

class ReplaceRwithT{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		str = str.replace("r","t");
		System.out.println("String after replacement: " + str);
	}
}