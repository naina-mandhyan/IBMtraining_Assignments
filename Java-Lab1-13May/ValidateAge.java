class MyExceptions extends Exception{
     
    MyExceptions(String str){
        super(str);
    }
 
}
 
class ValidateAge{
    public static void main(String[] args) throws MyExceptions {
       java.util.Scanner scan = new java.util.Scanner(System.in);
       System.out.println("Enter your age to proceed");
       int age = scan.nextInt();
 
        if(age <= 15){
            throw new MyExceptions("Sorry, you cannot proceed further. To proceed your age should be above 15...");
        }

        else
        	System.out.println("Congratulations... You can complete further steps.");
    }
}