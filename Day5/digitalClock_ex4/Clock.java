package digitalClock_ex4;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Clock {
	public static void main(String[] args) {
		ExecutorService Executor  = Executors.newFixedThreadPool(3);
		int hour= LocalDateTime.now().getHour();
		int minute= LocalDateTime.now().getMinute();
		int second=LocalDateTime.now().getSecond();
		ExecuteClock Clock = new ExecuteClock(hour , minute , second);

		
		
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
			}
			
		});
		
		
		 Executor.shutdown();
	}
}
