import java.util.Scanner;

class FirstNonRepeatChar{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		str = str.replace(" " , "");
		for(int i = 0; i < str.length(); i++)
		{
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
			{
				System.out.println("First non-repeating character is: " + str.charAt(i));
				break;
			}
		}
	}
}