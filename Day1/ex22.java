package Day1;

public class ex22 {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        
        m.getPublic();
        //get private cannot be accesed outside the class
        m.getProtected();
    }
}


// class with access modified members

class Modifier{
    public int a=10;
    private int  b=20;
    protected int c =30;

    public void getPublic(){
        System.out.println("Values of pblic A, private B, protected  C  in public method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    private void getPrivate(){
        System.out.println("Values of pblic A, private B, protected  C  in private method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    protected void getProtected(){
        System.out.println("Values of pblic A, private B, protected  C  in protected method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
