package Day3.EX5;

public class Implement {
    public static void main(String[] args) {
        ImplementInterface i = new ImplementInterface();
        i.interfaceMethod1();
        i.interfaceMethod2();
        i.interfaceMethod3();
    }
    
}

class ImplementInterface implements NewInterface{
    public  void interfaceMethod1() {
        System.out.println("Method1 ");
    }
    public void interfaceMethod2() {
        System.out.println("Method2 ");
    }
    public void interfaceMethod3() {
        System.out.println("Method3 ");
    }
}
