import java.util.Scanner;

class ReverseString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		String[] starr = str.split(" ");
		//System.out.println(starr.length);
		System.out.println("Reverse String:");
		for(int index = starr.length; index > 0; index--)
		{
			System.out.print(starr[index-1] + " ");
			
		}
		
	}
}