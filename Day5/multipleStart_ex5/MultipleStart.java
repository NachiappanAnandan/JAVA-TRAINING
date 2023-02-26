package multipleStart_ex5;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class MultipleStart  {
	
	public static void main(String[] args) {
		
		ImplementThread ThreadWork = new ImplementThread();
		Thread thread1 = new Thread(ThreadWork , "Thread 1");
		thread1.start();
		thread1.start();
		
	}
	

}
	
class ImplementThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is started...");
		
	}
	
}
