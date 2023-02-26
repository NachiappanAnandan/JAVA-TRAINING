package stringBuffer_ex8;

public class Execution extends Thread{
	StringBuffer Stringbuffer;
	int position = 0;
	
	Execution(String s){
		this.Stringbuffer = new StringBuffer(s);
	}
	
	
	@Override
	synchronized public
	  void run() {
		// TODO Auto-generated method stub
		int number ;
		for(int i=0;i<100;i++) {
//			System.out.println(position);
			System.out.println(Stringbuffer);
//			System.out.println(number);
			
			
		}
		number = Stringbuffer.charAt(position);
		
		number++;
//		position++;
		
		Stringbuffer.replace(0, 1, String.valueOf((char)number));
//		Stringbuffer.append((char)number);
		
		
	}
}
