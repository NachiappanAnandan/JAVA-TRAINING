package Exercise5.Momento;



// holds the methods of history of values for the corresponding momento
public interface Caretaker {
    public void addToHistory(Momento momento);
    public Momento getFromHistory(int index);


}
