package inventorySystem_ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to initialize a inventory management using threads
 */
public class InventorySystem {
public static void main(String[] args) {
	ExecutorService Executor =  Executors.newFixedThreadPool(2);
	
	Inventory Inventory = new Inventory();
	
	Executor.execute(()->{
		for (int i = 0; i < 10; i++) {
			Inventory.produceItem();
		}
	});
	Executor.execute(()->{
		for (int i = 0; i < 10; i++) {
			Inventory.consumeItem();
		}
	});
	Executor.shutdown();
}
}
