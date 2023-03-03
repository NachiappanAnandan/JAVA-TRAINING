package Exercise5.Momento;

import java.util.ArrayList;
import java.util.List;

public class Originator {


     //list for holing the momento objects to history
     List<Momento> history = new ArrayList<Momento>();

     public void addToHistory(Momento momento){
        history.add(momento);
    }

    //getting using index number

    public Momento getFromHistory(int index){
        return history.get(index);
    }
}
