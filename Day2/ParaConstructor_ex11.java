package Day2;

public class ParaConstructor_ex11 {
    public static void main(String[] args) {
        C2 c  = new C2(10);
    }
}

class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println(a);
        System.out.println("Class A constructor");
    }
}
class B{
    int b;
    B(int b){
        this.b = b;
        System.out.println(b);
        System.out.println("Class B constructor");
    }
}
 class C2 extends A{
    B b = new B(30);
    C2(int a){
       super(a);
    }
 }
