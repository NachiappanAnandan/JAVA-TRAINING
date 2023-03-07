package readWriteObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;


public class ReadWriteObject {
	public static void main(String[] args) throws IOException {
		
		Date date= new Date();
		
		FileOutputStream fos;
		
			fos = new FileOutputStream("/Users/Nachiappan/eclipse-workspace/Exercise7/src/readWriteObject/date.txt");
			ObjectOutputStream pw = new ObjectOutputStream(fos);
			
			pw.writeObject(date);
			
			BufferedReader br = new BufferedReader(new FileReader("/Users/Nachiappan/eclipse-workspace/Exercise7/src/readWriteObject/date.txt"));
			
			String s;
			 while((s=br.readLine())!=null) {
				 System.out.println(s);
			 }
		
		
		
		
		
		
	}
}
