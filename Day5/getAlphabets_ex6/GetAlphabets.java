package getAlphabets_ex6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GetAlphabets {
public static void main(String[] args) {
	
	ExecutorService Executor  = Executors.newFixedThreadPool(1);
	
	//Scanner 
	Scanner scanner  = new Scanner(System.in);
	
	String Input  = scanner.next();//String input
	
	Executor.execute(()->{
		new CheckAlphabets(Input);
	});
	scanner.close();
	Executor.shutdown();
	
	
	
}
}
