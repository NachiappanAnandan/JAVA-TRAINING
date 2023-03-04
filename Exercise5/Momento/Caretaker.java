package Exercise5.Momento;

import java.util.ArrayList;
import java.util.List;

// holds the methods of history of values for the corresponding momento
public class Caretaker {

     //list for holing the momento objects to history
     List<Momento> history = new ArrayList<Momento>();
     
    public void addToHistory(Momento Momento){
        history.add(Momento);
    }

    public Momento getFromHistory(int index){
       return history.get(index);
    }


}
