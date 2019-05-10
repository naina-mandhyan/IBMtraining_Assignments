import java.util.Scanner;

class NameInitials{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your full name");
		String name = scan.nextLine();
		String[] nameArr = name.split(" ");
		System.out.println("Name Initials: ");
		for(String init : nameArr)
			System.out.print(init.charAt(0) + " ");
		
	}
}