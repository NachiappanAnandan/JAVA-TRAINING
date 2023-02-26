package counting_ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingNumbers {
public static void main(String[] args) {
	ExecutorService Executor = Executors.newFixedThreadPool(2);
	
	Counter counter = new Counter();
	
	Executor.execute(()->{
		counter.countNumbers();
	});
	Executor.execute(()->{
		counter.PrintMsg();
	});
}
}

