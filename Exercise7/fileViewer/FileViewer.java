package fileViewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileViewer {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/fileViewer/ReadFile.txt");
		
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String data = scanner.nextLine();
			System.out.println(data);
		}
	}
}
