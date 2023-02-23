package Day4;

public class EX3 {
    
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
    public void mth2(){
        try{
            //line1
            System.exit(-1);
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
            EX3 ex = new EX3();
            ex.mth1();
        }
    }
}