package Exercise5.Momento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    String state;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Momento AlterMomento(){
        return new Momento(state);
    }
    
    public Momento getStateFromMomento(Momento momento){
        state = momento.getState();
        return momento;
    }

}
