package stringBuffer_ex8;


/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to print a string buffer starting from A and increment it in every thread 
 */
public class Execution extends Thread{
	StringBuffer Stringbuffer;

	
	Execution(String s){
		this.Stringbuffer = new StringBuffer(s);
	}
	
	
	@Override
	synchronized public
	  void run() {
		// TODO Auto-generated method stub
		int number ;
		for(int i=0;i<100;i++) {

			System.out.println(Stringbuffer);

			
			
		}
		number = Stringbuffer.charAt(0);
		
		number++;

		
		Stringbuffer.replace(0, 1, String.valueOf((char)number));

		
		
	}
}
