import java.io.*;

class InsertLineNumber{
	public static void main(String[] args) {
		try{
			StringBuilder str = new StringBuilder();
			BufferedReader br =new BufferedReader(new FileReader("otherFile2.txt"));
			String newStr = "";
			int count = 1;
			while((newStr = br.readLine()) != null){
				str.append("line "+count + ": " + newStr + "\n");
				count++;
			}
			br.close();
			System.out.println("File contains\n"+ str);
		}

		catch(IOException e){
			System.out.println("File not found");
		}
	}
}