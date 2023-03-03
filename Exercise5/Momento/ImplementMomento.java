package Exercise5.Momento;

public class ImplementMomento {
    public static void main(String[] args) {
        //initializig originator and caretaker


        //using momento

        Momento momento = new Momento("state 1");

         System.out.println(momento.getState());

         Originator originator = new Originator();

         originator.addToHistory(momento);
         


      

   
        
    }
}
