package message_ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to print message with multiple threads  
 */

public class Synchronized_ex2 {
public static void main(String[] args) {
	
	ExecutorService executor  = Executors.newFixedThreadPool(7);
	
	executor.execute(()->{
		printMesssage("Message1");
	});
	executor.execute(()->{
		printMesssage("Message2");
	});
	executor.execute(()->{
		printMesssage("Message3");
	});
	executor.execute(()->{
		printMesssage("Message4");
	});
	executor.execute(()->{
		printMesssage("Message5");
	});
	executor.execute(()->{
		printMesssage("Message6");
	});

	executor.shutdown();
	
}
synchronized public static void printMesssage(String s) {
	System.out.println("[ ------ "+s+"------ ]");	
}
}
