package Day2;

public class ex9 {
    public static void main(String[] args) {
        ClassA A = new ClassA();
        ClassB B = new ClassB();
    }
}

class ClassA{
    public static int a= 10;
    private static int b = 20;
    protected static int c =30;

    // public method
    public void PublicDisplay(){
        System.out.println("Display using public method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    // // private method
    private void PrivateDisplay(){
        System.out.println("Display using private method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    // protected method
    public void ProtectedDisplay(){
        System.out.println("Display using protected method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class ClassB extends ClassA{
    int x=90;
    int y=100;

    ClassA CA = new ClassA();
    CA.PublicDisplay();
    CA.PrivateDisplay();
    CA.ProtectedDisplay();

    
}