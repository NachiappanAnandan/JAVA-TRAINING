package Day2;

public class ObjectCounter_ex5 {
    public static void main(String[] args) {
        ObjectCounter ob1 = new ObjectCounter();
        ObjectCounter ob2 = new ObjectCounter();
        ObjectCounter.ShowCounter();
    }
    
}

class ObjectCounter{
    static int counter = 0;
    ObjectCounter(){
        counter++;
    }
    static void ShowCounter(){
        System.out.println(counter);
    }
}
