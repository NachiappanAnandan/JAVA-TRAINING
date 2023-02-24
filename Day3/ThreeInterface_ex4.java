package Day3;

// interface
interface Parent extends A , B , C{
 public void methodParent();
}


interface A {
    public void methodA1();
    public void methodA2();
    
    
}

interface B {
    public void methodB1();
    public void methodB2();
    
}

interface C {
    public void methodC1();
    public void methodC2();
    
}


class ParentClass{

}

class Demo extends ParentClass implements Parent {
    public void methodA1() {
        
    }
    public void methodA2() {
        
    }
    public void methodB1() {
        
    }
    public void methodB2() {
        
    }
    public void methodC1() {
        
    }
    public void methodC2() {
        
    }
    public void methodParent(){

    }
}


public class ThreeInterface_ex4 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodA1();
    }
}


