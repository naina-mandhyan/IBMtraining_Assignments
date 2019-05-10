class CheckAnagrams{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		str1 = str1.replace(" " , "");
		System.out.println("Enter second string");
		String str2 = scan.nextLine();
		str2 = str2.replace(" " , "");
		String[] strarr1 = str1.split("");
		String[] strarr2 = str2.split("");
		String sortStr1 = new CheckAnagrams().sortString(strarr1);
		String sortStr2 = new CheckAnagrams().sortString(strarr2);
		if(sortStr1.equals(sortStr2))
			System.out.println("These are anagrams");
		else
			System.out.println("These are not anagrams");
		
	}

	String sortString(String[] strarr){
		java.util.Arrays.sort(strarr);
		String str = String.join("",strarr);
		String sortedStr = new String(str);
		return sortedStr;
	}
}