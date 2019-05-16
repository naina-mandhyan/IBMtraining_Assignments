import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class CountingNumbers{
	public static void main(String[] args) {
		try{
			
			BufferedReader br =new BufferedReader(new FileReader("otherFile.txt"));

			BufferedReader br1 =new BufferedReader(new FileReader("otherFile.txt"));

			System.out.println("File contains");

			CountingNumbers cn = new CountingNumbers();

			cn.countLinesAndWords(new BufferedReader(new FileReader("otherFile.txt")));

			cn.countCharacters(br);

			br.close();
		}

		catch(IOException e){
			System.out.println("File not found");
		}
	}

	void countLinesAndWords(BufferedReader br){
		String newStr = "";
		String[] str = {};
		int lineNo = 0,  wordNo = 0;

		try{
			while((newStr = br.readLine()) != null){
				lineNo++;
				str = newStr.split(" ");
				wordNo += str.length;
			}
			
		}

		catch(IOException e){
			System.out.println("No lines found");
		}

		System.out.println(lineNo + " lines\n"+ wordNo + " words");
	}

	void countCharacters(BufferedReader br){
		int str = 0;
		int charNo = 0;
		try{
			while((str = br.read()) != -1){
					charNo++;
			}
		
		}
		catch(IOException e){
			System.out.println("File is empty");
		}
		System.out.println(charNo + " characters" );
	}
}