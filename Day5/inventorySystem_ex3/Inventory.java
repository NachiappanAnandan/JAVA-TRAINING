package inventorySystem_ex3;

public class Inventory {
	int item =0 ;
	synchronized  void produceItem() {
		if(item == 1) {
			// wating to be consumed
			try {
				wait();
			}catch(Exception e) {}
		}
			
			System.out.println("Item is produced");
			System.out.println("The item count is " +item);
			this.item =1;
			notify();
			
		}
	 
	 
	 synchronized  void consumeItem() {
		 if(item == 0) {
				// wating to be consumed
				try {
					wait();
				}catch(Exception e) {}
			}
		
			System.out.println("Item is Consumed");
			System.out.println("The item count is " +item);
			this.item =0;
			
			notify();
	
	}
}
