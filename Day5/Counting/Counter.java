package Counting;

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
				}catch(Exception e) {}
			}
		}
		
	}



	synchronized public  void PrintMsg() {
		
		for(;count%10==0;) {
			System.out.println("Ten Numbers Reached....");
			try {
				Thread.sleep(1000);
				notify();
				wait();
			}catch(Exception e) {}
		
		}
		
			
	}
	

}
