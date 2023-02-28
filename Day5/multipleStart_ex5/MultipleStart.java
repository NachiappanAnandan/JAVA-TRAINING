package multipleStart_ex5;

/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class that trys to start a thread twice
 */
public class MultipleStart  {
	
	public static void main(String[] args) {
		
		ImplementThread ThreadWork = new ImplementThread();
		Thread thread1 = new Thread(ThreadWork , "Thread 1");
		thread1.start();
		thread1.start();

		// Thread once started cannot be started again
		
	}
	

}
	
class ImplementThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is started...");
		
	}
	
}
