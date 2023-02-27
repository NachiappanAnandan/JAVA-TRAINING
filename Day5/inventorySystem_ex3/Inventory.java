package inventorySystem_ex3;

public class Inventory {
	int item =0 ;
	synchronized  void produceItem() {
		if(item == 1) {
			// wating to be consumed
			try {
				wait();
			}catch(Exception e) {}
		}else{
			System.out.println("Item is produced");
			this.item =1;
			System.out.println("The item count is " +item);
			notify();
		}
			
			
			
		}
	 
	 
	 synchronized  void consumeItem() {
		 if(item == 0) {
				// wating to be consumed
				try {
					wait();
				}catch(Exception e) {}
			}else{
				System.out.println("Item is Consumed");
				this.item =0;
				System.out.println("The item count is " +item);
				notify();
			}
		
			
	
	}
}
