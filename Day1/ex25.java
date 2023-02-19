package Day1;

public class ex25 {
    public static void main(String[] args) {
        derived d = new derived();
        d.useD();

    }
    protected class base{//protected class can be declared within a class
        String Method(){
            return "Wow";
        }
    }
    
    
}
class derived extends ex25{ //extended ex25 so protected class can be accessed
    public void useD(){
        base z = new base();
        System.out.println("base says, "+z.Method());
    }
}

