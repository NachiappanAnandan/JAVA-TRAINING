package FileOperations;

import java.io.File;

public class FileSize {
	public static void main(String[] args) {
		File file  = new File(PathName.pathNameOfFolder+"Rename.txt");
		
		if(file.exists()) {
			long length  = file.length();
			System.out.println("The size of the file is + "+length+"bytes");
		}else {
			System.out.println("File Not Found.");
		}
	}
}
