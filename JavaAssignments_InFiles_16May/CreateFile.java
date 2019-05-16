import java.io.*;
//import java.io.IOException;

class CreateFile{
	public static void main(String[] args) {
		// try{
		// 	File f = new File("newFile.txt");
		// 	if(f.exists()){
		// 		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
		// 		bw.write("more content added");
		// 		bw.newLine();
		// 		bw.write("some more");
		// 		bw.flush();
		// 		bw.close();
		// 	}
		// 	//f.createNewFile();

		// }

		try{
			//File f = new File("otherFile.txt");
			char[] c = {'a' , 'b' , 'c' , 'd'};
			PrintWriter pw = new PrintWriter("otherFile2.txt");
			pw.println("writing using PrintWriter");
			//pw.nextLine();
			pw.println("added");
			pw.write(c,2,2);
			pw.flush();
			pw.close();
			
		}
		
		catch(IOException e){
			System.out.println("Some error occured");
		}

	}
}