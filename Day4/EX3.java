package Day4;

public class Ex3 {
    
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
    public void mth2(){
        try{
            //line1
            System.exit(0);
        }
         catch (Exception e) {
            // TODO: handle exception
            System.out.println("catch-mth2");
        }
        finally{
            System.out.println("finally -mth2");
        }
    }
    public static void main(String[] args) {
        {
            Ex3 ex = new Ex3();
            ex.mth1();
        }
    }
}