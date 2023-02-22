package Day2;


//static order


//static block
//main function
//static method


public class ex6 {
    public static void main(String[] args) {
        System.out.println("This is main function");
        StaticMethod();
    }
    static{
        System.out.println("This is a atatic block");
    }

    public static void StaticMethod(){
        System.out.println("This is a static method");
    }
}
