package stringBuffer;

public class StringBufferThread extends Thread {
	
	public static void main(String[] args) {
		Execution Ex = new Execution("A");
		
		

		Thread Thread1 = new Thread(Ex , "Thread-1");
		Thread Thread2 = new Thread(Ex , "Thread-2");
		Thread Thread3 = new Thread(Ex , "Thread-3");
		
		Thread1.start();
		Thread2.start();
		Thread3.start();
		
		
	}
	
	
	
	
	
	
}
