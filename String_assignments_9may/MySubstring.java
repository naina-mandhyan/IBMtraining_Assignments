import java.util.Scanner;

class MySubstring{

	String str;
	public static void main(String[] args) {
		
		MySubstring sub = new MySubstring();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		sub.str = scan.nextLine();
		System.out.println("Enter the number of arguments for getting subscript: (1/2)");
		int number = scan.nextInt();
		if(number == 1){
			System.out.println("enter the index value");
			int index = scan.nextInt();
			sub.getSubstring(index);
		}
		else if(number == 2){
			System.out.println("enter the index values");
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();
			sub.getSubstring(index1, index2);
		}
		else
			System.out.println("enter either 1 or 2 index values only..");
		
	}

	void getSubstring(int index){
		for(int i = index; i < this.str.length(); i++)
			System.out.print(this.str.charAt(i));
	}

	void getSubstring(int index1, int index2){
		for(int i = index1; i < index2; i++)
			System.out.print(this.str.charAt(i));
	}
}