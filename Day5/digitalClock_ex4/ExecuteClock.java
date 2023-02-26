package digitalClock_ex4;

public class ExecuteClock {
	int hours = 0;
	int minutes=0;
	int seconds = 1;
	
	
//	setting hours
	synchronized void setHours() {
		if(minutes==60 && hours<24) {// adding each hour for every 60 th minute till 24th hour
			minutes=0;
			hours+=1;
//			 
		}else if(hours ==24) {
			hours =0;
			 try {
				notify();
				wait();// making minutes wait
					
				 }catch(Exception e) {}
		}
		
	}
	
//	seting minutes
	 synchronized public void setMinutes() {
//		 System.out.println(seconds);
		 if(seconds ==60 && minutes<60) {// adding each minute for every 60 th second till 59 th minute
			 minutes+=1;
			 seconds =0;//reseting seconds to zero
		 }else  {
			 
			 try {
				notify();
				wait();// making minutes wait
				
			 }catch(Exception e) {}
			 
		}
		
		
		
		
		
	}
	 
	 
//	 setting seconds
	synchronized  public void setSeconds() {
			
		if(seconds<60) {//printing seconds from 1 to 59 
			print();//printing clock
			delay();
			seconds+=1;//adding each second
		}else {//after 59 th second
			
			try {
				notify();//notify other thread
				wait();// make the thread wait
				
				
				
			}catch(Exception e){
				
			}
		}
	  }
		 
	  
	  
	
//printing  clock
	synchronized public void print() {
			System.out.println(hours+" : "+minutes+" : "+seconds);
	  }
	
	  
	
//delay of execution	
	synchronized	public void delay() {
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	
}
