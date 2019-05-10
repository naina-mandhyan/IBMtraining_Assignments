import java.util.Scanner;

class CountStringVowels{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		//String[] strarr = str.split("");
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			switch(str.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				count++;
			}
		}
		System.out.println("There are " + count + " vowels in the string.");
		
	}
}