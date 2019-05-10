class CommandFloatAdd{
	public static void main(String[] args) {
		float sum = 0.0f;
		for(int i = 0; i < args.length; i++)
			sum = sum + Float.parseFloat(args[i]);
		System.out.printf("Sum of Command line float inputs: %.2f", sum);
	}
}