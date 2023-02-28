package counting_ex7;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to print 1 to 100 and a message
 */
public class Counter {
	
	int count = 1;
	synchronized  void countNumbers()  {
		for(;count<=100;count++) {
			System.out.println(count);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			if(count%10==0) {
				try {
					notify();
					wait();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}



	synchronized public  void printMessage() {
		
		for(;count%10==0;) {
			System.out.println("Ten Numbers Reached....");
			try {
				Thread.sleep(1000);
				notify();
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
			
	}
	

}
