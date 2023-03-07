package FilesInDirectories;

import java.io.File;

public class FileInDirectories {
	public static void main(String[] args) {
		File Directory = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/");
		
		//files in directory
		
		File filesArray[] = Directory.listFiles();
		
		for(int i=0;i<filesArray.length;i++) {
			System.out.println(filesArray[i].getName());
		}
		
		
	}
}
