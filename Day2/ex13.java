package Day2;


//abstract class with o abstract methods
public class ex13 {
    public static void main(String[] args) {
       AbstractClass abc = new AbstractClass();//cannot initiate a abstract class with no abstract methods
       //but can be used by extending to sub class

        
    }
}

abstract class  AbstractClass {
    public void doPrint(){
        System.out.println("Hiii");
    }
}
