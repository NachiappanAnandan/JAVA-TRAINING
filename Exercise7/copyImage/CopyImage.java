package copyImage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class CopyImage {
	

	//Byte reading - input straem
	//Declaring file
	
	public static void main(String[] args) throws IOException {
		
		//file 
		File file = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyImage/image.jpeg");
		
		//fie to be copied 
		File copyPath = new File("/Users/Nachiappan/eclipse-workspace/Exercise7/src/copyImage/copyByByteImage.jpeg");
		
//		input and output stream to read and write file in byte format
		FileInputStream input  = new FileInputStream(file);
		FileOutputStream output = new FileOutputStream(copyPath);
		

		int i;
		int count = 0;
		
		
		byte b[] = new byte[1024];
		while((i=input.read(b))!=-1) {
//			System.out.println(input.read(b));
			output.write(b);

			
		}
		
		input.close();
		
		
		
		
	}
}
