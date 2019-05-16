import java.io.File;
import java.util.Scanner;

class GetFileDetails{
	public static void main(String[] args) {
		String fileName = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name :");
		fileName = sc.nextLine();
		File f = new File(fileName);
		if(f.exists()){
			int index = fileName.indexOf('.') + 1;
			System.out.println("File found with the extension: "+ fileName.substring(index));
			System.out.println("Length of files in bytes: " + f.length());
			if(f.canRead())
				System.out.println("It is a readable file");
			if(f.canWrite())
				System.out.println("It is a writable file");
		}
		else
			System.out.println("File not found");
	}
}