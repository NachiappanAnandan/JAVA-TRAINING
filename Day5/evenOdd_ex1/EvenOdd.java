package evenOdd_ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to print a even and odd numbers from 1 to 100 with 2 threads
 */
public class EvenOdd {
	public static void main(String[] args) {
		ExecutorService executor =  Executors.newFixedThreadPool(2);
		
		executor.execute(()->{
			for(int i=0;i<=100;i++) {
				if(i%2==0) {
					System.out.println(i+ " is a even number");
				}
			}
		});
		executor.execute(()->{
			for(int i=0;i<=100;i++) {
				if(i%2!=0) {
					System.out.println(i+ " is a odd number");
				}
			}
		});
		executor.shutdown();
	}
	
}
