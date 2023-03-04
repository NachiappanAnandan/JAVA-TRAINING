package copyByLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyByLine {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyByLine/Read.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyByLine/Write.txt"));
		
		String input;
		while((input=bf.readLine())!=null) {
			System.out.println(input);
			pw.write(input);
		}
		pw.close();
	}
}
