import java.util.Scanner;
class PrimeNumbers{
	public static void main(String[] args) {
		System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 2; i <= n; i++){
			int flag = 0;
			for( int j = 2; j <= i; j++){
				if((i % j) == 0)
					flag++;
			}
			if(flag == 1)
				System.out.print(i + " ");
		}
	}
}