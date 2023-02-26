package digitalClock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Clock {
	public static void main(String[] args) {
		ExecutorService Executor  = Executors.newFixedThreadPool(3);
		ExecuteClock Clock = new ExecuteClock();
		
		//printing seconds
		
		Executor.execute(()->{
			while(true) {
				Clock.setSeconds();
	
			}
			
		});
		
		
		Executor.execute(()->{
			
//			Clock.minutes;
			while(true) {
				Clock.setMinutes();
			
			}
			
		});
		
		
		
		
		Executor.execute(()->{
			while(true) {
				Clock.setHours();
				
//				System.out.println("hours");
			}
			
		});
		
		
		 Executor.shutdown();
	}
}
