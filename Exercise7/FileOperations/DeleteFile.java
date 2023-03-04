package FileOperations;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		
		File  file = new File(PathName.pathNameOfFolder+"/DemoDelete.txt");
		if(file.delete()) {
				System.out.println("File Deleted Sucessfully");
		}else {
			System.out.println("Operatiion failed");
		}
	}
}
