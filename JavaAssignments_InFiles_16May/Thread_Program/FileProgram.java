import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;


class FileProgram{
	public static void main(String[] args) {
		
	File srcFile = new File("source.txt");
	File targFile = new File("target.txt");
	CopyDataThread ref = new CopyDataThread(srcFile , targFile);
	ref.start();

	}
}