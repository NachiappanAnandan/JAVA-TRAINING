package Day2;
/**
*this is a java program to calculate the cost for doors and windos in a house
*
* @author  Nachiappan
* @version 1.0
* @since   2023/02/23
*/

// cost of door and window
public class DoorWindow_ex15 {//class house

    /**
   * This is the main method which makes use of Calculate function in the Door and window Class
   * @param args Unused.
   * @return Nothing.
   
   */

    public static void main(String[] args) {
        // instances
        House Doors = new Door(5, 200);
        House wwindows = new Window(20, 70);
        Doors.Calculate();
        wwindows.Calculate();
        
    }
}
/** 
 * This is ythe base class for the Door and Window
 */
abstract class House{
    // Door
    public abstract void Calculate();

}
class Door extends House{
    int count,cost;
    Door(int count , int cost){
        this.count= count;
        this.cost=cost;
    }
    public void Calculate(){
        System.out.println("The cost for Doors is " +(this.cost*this.count));
    }

}
class Window extends House{
    int count,cost;
    Window(int count , int cost){
        this.count= count;
        this.cost=cost;
    }
    public void Calculate(){
        System.out.println("The cost for Window is " +(this.cost*this.count));
    }

}


