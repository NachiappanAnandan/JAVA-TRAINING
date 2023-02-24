package Day1;


// protected data  -> same package ,diff package if imported and extended
public class ex23 {
    public static void main(String[] args) {
        System.out.println(class1.i);
        class2.manipulate();
        System.out.println(class1.i);
    }
}

class class1{
    static protected int i=10;

}

class class2{
    public static void manipulate(){
        class1.i=20;
    }
}