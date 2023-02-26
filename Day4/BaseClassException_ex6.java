package Day4;

import java.io.IOException;

public class BaseClassException_ex6 {
    public static void main(String[] args) {
        Child c = new Child();
//        Parent p = new Child();
    }
}
class Parent{
    Parent() throws ArithmeticException  {//constructor throws ioException
//        try {
//            Child.ThrowingException();
        	throw new ArithmeticException();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
            
    }
    

}

class Child extends Parent{
    public Child(){
        try {
        	

        } catch (Exception e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
        	System.out.println("Exception");
        	
        }
            // super();
        
       
    }
    public static void ThrowingException() throws IOException{//function throws ioException
        throw new IOException();
    }
}




