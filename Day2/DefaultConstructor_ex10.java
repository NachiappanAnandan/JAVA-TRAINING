package Day2;

public class DefaultConstructor_ex10 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    A(){
        System.out.println("Class A constructor");
    }
}
class B{
    B(){
        System.out.println("Class B constructor");
    }
}
 class C extends A{
    C(){
       B b = new B();
    }
 }
