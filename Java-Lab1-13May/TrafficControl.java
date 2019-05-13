import java.util.Scanner;
class TrafficControl{
	public static void main(String[] args) {
		System.out.println("Enter your choice(1/2/3) \n 1.Red \n 2.Yellow \n 3.Green");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		switch(input){
			case 1: System.out.println("Stop..");
					break;
			case 2: System.out.println("Ready..");
					break;
			case 3: System.out.println("Go..");
					break;
			default: System.out.println("Wrong Input");
		}
	}
}