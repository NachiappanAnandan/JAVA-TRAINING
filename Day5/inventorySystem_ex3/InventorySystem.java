package inventorySystem_ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
}
}
