import java.util.Scanner;
class Fibonacci{
	static int n;
	public static void main(String[] args) {
		int a = 1 , b = 1;
		Fibonacci fib = new Fibonacci();
		System.out.println("Enter your choice(1/2) \n 1.Print fibonacci series using Recursion \n 2.Print fibonacci series without using recursion");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Enter the no of terms");
		n = scan.nextInt();
		if(input == 1){
						System.out.print(a + " " + b);
			fib.recFib(a,b);
		}
		if(input == 2)
			fib.non_recFib(a,b);
		

	}

	void recFib(int a, int b){
		
		while(this.n > 2){
			int c;
			c = a+b;
			System.out.print(" " + (a+b));
			this.n--;
			this.recFib(b,c);
		}


	}

	void non_recFib(int a, int b){
		int c;
		System.out.print(a + " " + b);
		for(int i=0; i < this.n-2; i++)
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}
}