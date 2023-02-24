package Day2;

//singleton class

public class Singleton_ex8 {
    public static void main(String[] args) {
        Singleton s ;//reference creation
        s= Singleton.createInstance();
        // s.createInstance();

    }
}

class Singleton{
    private static Singleton Obj = null;//creating a private inner object

    private Singleton(){//private constructor

    }

    public static Singleton createInstance(){//public function that accesses private object
        if(Obj == null){//checking Object initialization
            Obj = new Singleton();
        }
        Obj.message();
        return Obj;
       
    }

    private void message(){
        System.out.println("Object created only once");
    }

    

}
