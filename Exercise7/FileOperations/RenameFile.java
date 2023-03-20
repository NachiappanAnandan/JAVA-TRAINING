package FileOperations;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		File  file = new File(PathName.pathNameOfFolder+"/Name1.txt");
		
		File rename = new File(PathName.pathNameOfFolder+"Rename.txt");
		
		if(file.exists()) {
			file.renameTo(rename);
			System.out.println("File renamed");
		}else {
			System.out.println("File not found");
		}
	}
}
