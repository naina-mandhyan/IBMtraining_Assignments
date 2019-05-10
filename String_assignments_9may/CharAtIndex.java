import java.util.Scanner;

class CharAtIndex{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		System.out.println("Enter an index");
		int index = scan.nextInt();
		if(index < str.length())
			System.out.println("Char at " + index + ": " + str.charAt(index));
		else
			System.out.println("Wrong index..");


			// using try catch...

		// try{
		// 	System.out.println("Char at " + index + ": " + str.charAt(index));
		// }
		// catch(IndexOutOfBoundsException in){
		// 	System.out.println("please enter correct index");
		// }
	}
}