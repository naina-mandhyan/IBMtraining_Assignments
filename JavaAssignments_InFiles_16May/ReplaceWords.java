import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class ReplaceWords{
	public static void main(String[] args) {
		System.out.println("Enter the word to replace");
		Scanner scan = new Scanner(System.in);
		String oldWord = scan.nextLine();
		System.out.println("Enter the new word");
		String newWord = scan.nextLine();

		try{
			File file = new File("otherFile2.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String oldText = "" , str = "";
			while((str = br.readLine()) != null){
				oldText += str +"\n";
			}
			br.close();

			String newText = oldText.replaceAll(oldWord ,newWord);

			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(newText);
			bw.flush();
			bw.close();
		}
	
		catch(IOException e){
			System.out.println("No file found" + e);
		}
	}

}