package inventorySystem_ex3;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class to manage the inventory by simultaneouslyb producing and consuming but maximum 1 item is produced. 
 */
public class Inventory {
	int item =0 ;
	synchronized  void produceItem() {
		if(item == 1) {
			// wating to be consumed
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("Item is produced");
			item =1;
			System.out.println("The item count is " +item);
			notify();
		}
			
			
			
		}
	 
	 
	 synchronized  void consumeItem() {
		 if(item == 0) {
				// wating to be consumed
				try {
					wait();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Item is Consumed");
				item =0;
				System.out.println("The item count is " +item);
				notify();
			}
		
			
	
	}
}
