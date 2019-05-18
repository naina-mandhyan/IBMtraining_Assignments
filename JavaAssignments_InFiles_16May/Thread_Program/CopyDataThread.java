import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class CopyDataThread extends Thread{

	File source, target;

	CopyDataThread(File source, File target){
		this.source = source;
		this.target = target;
	}

	public void run(){

		try{
			String copiedText = "";
			int ch = 0;
			int count = 0;
			BufferedReader br = new BufferedReader(new FileReader(this.source));
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.target));
			while((ch = br.read()) != -1 ){
				if(count < 10){
					copiedText += (char)ch;
					count++; 
					//System.out.println("Copied before write : " + ch);
				}
				else{
					//System.out.println("Copied : " + copiedText);
					bw.write(copiedText);
					bw.flush();
					copiedText = "" + (char)ch;
					count = 0;
					System.out.println("10 characters copied");

					try{
						Thread.sleep(3000);
					}
					catch(InterruptedException e){
						System.out.println("Some error occured..");
					}
				}
			}
			bw.write(copiedText);
			bw.close();
			br.close();
		}

		catch(IOException e){
			System.out.println(" File not found ");
		}

	}
}