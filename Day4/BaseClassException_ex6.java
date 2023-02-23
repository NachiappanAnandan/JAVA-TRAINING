package Day4;

import java.io.IOException;

public class BaseClassException_ex6 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
class Parent{
    Parent()  {//constructor throws ioException
        try {
            Child.ThrowingException();
        } catch (Exception e) {
            System.out.println(e);
        }
            
    }
    

}

class Child extends Parent{
    public Child(){
        try {
            // Parent p = new Parent(); //but parent object initializatiio works
            super();//cannot use super inside try
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            // super();
        
       
    }
    public static void ThrowingException() throws IOException{//function throws ioException
        throw new IOException();
    }
}




