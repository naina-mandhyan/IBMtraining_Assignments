import java.util.*;

class CountCharsInArray{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string");

		String str= scan.nextLine();

		str = str.replace(" ", "");

		char[] chArr = str.toCharArray();

		CountCharsInArray ref= new CountCharsInArray();

		HashMap<Character, Integer> countChar =	ref.getCharCount(chArr);

		for (Map.Entry val : countChar.entrySet()) {

			System.out.println(val.getKey() + " " + val.getValue());

		}

	}

	HashMap<Character, Integer> getCharCount(char[] chArr){

		HashMap<Character, Integer> countChar = new HashMap<>();

		for (char ch : chArr) {

			if (countChar.containsKey(ch)) {

				countChar.put(ch, countChar.get(ch) + 1);

			}

			else {

				countChar.put(ch, 1);

			}

		}

		return(countChar);

	}

}

