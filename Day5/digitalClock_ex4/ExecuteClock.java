package digitalClock_ex4;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to print a digital clock by setting seonds , minutes and hours
 */
public class ExecuteClock {
	int hours = 0;
	int minutes=0;
	int seconds = 0;

	ExecuteClock(int hour, int minute, int second){
		this.hours = hour;
		this.minutes = minute;
		this.seconds = second;
	}
	
	
//	setting hours
synchronized void setHours() {
	// System.out.println("calling hour");
		if(seconds ==0 &&minutes==60 && hours<24) {// adding each hour for every 60 th minute till 24th hour
			minutes=0;
			hours+=1;
			notify();
//			 
		}else if(seconds==0 && minutes==60 &&hours ==24) {
			hours =0;
			 try {
				wait();// making minutes wait
					
				 }catch(Exception e) {
					e.printStackTrace();
				 }
		}else{
			try {
				wait();// making minutes wait
					
				 }catch(Exception e) {
					e.printStackTrace();
				 }
		}
		
	}
	
//	seting minutes
synchronized public void setMinutes() {
		//  System.out.println("calling minutes");
		 if(seconds ==60 && minutes<60) {// adding each minute for every 60 th second till 59 th minute
			 minutes+=1;
			 seconds =0;//reseting seconds to zero
			 
		 }else  {
			notify();
			 try {
				
				wait();;// making minutes wait
				
			 }catch(Exception e) {
				e.printStackTrace();
			 }
			 
		}
		
		
		
		
		
	}
	 
	 
//	 setting seconds
	 synchronized public void setSeconds() {
			// System.out.println("calling seconds");
		if(seconds<60) {//printing seconds from 1 to 59 
			print();//printing clock
			delay();
			seconds+=1;//adding each second
		}else {//after 59 th second
			notify();//notify other thread
			try {
				
				wait();// make the thread wait
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	  }
		 
	  
	  
	
//printing  clock
 public void print() {
			System.out.println(hours+" : "+minutes+" : "+seconds);
	  }
	
	  
	
//delay of execution	
	public void delay() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
	
}
