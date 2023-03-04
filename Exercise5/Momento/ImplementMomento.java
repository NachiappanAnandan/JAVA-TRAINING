package Exercise5.Momento;

public class ImplementMomento {
    public static void main(String[] args) {
        //initializig originator and caretaker
        Originator originator  = new Originator();
        Caretaker caretaker = new Caretaker();


        originator.setState("number 1");

        //adding to history

        caretaker.addToHistory(originator.AlterMomento());
        //changing the value
        originator.setState("Number 2");
        //geting value from history
    originator.getStateFromMomento(caretaker.getFromHistory(0));

    System.out.println(originator.getState());



       



        //using momento
        
         


      

   
        
    }
}
