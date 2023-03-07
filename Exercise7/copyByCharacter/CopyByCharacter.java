package copyByCharacter;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyByCharacter {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyByCharacter/ReadFile.txt");
		File fileWrite = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyByCharacter/WriteFile.txt");

		FileReader fr = new FileReader(file);
		FileWriter fw  = new FileWriter(fileWrite );
		
		int length =0;
		char charBuffer[] = new char[8];
		
		while((length = fr.read(charBuffer))!=-1) {
			System.out.println(length);
			fw.write(charBuffer,0,length);//writtinghbcontents in character buffer
//			System.out.println();
			
		}
		fw.close();
	}
}
