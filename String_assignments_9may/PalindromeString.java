import java.util.Scanner;

class PalindromeString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		//System.out.println(str);
		String[] starr = str.split(" ");
		int i = 0;
		//System.out.println(starr.length);
		for(int index = 0; index < starr.length; index++)
		{
			if(!starr[i].equals(starr[starr.length - 1 - i])){
				i = 1;
				break;
			}

			
		}
		if(i == 1)
			System.out.println("not palindrome");
		else
			System.out.println("palindrome");

		}
}