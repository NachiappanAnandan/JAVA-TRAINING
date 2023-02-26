package evenOdd_ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
	}
	
}
