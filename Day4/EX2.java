package Day4;


class EX2{
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
    public void mth2(){
        try{
            //line1
            int i=1/0;
            // throw new ArithmeticException("Demo");
            return;
            // System.exit(1);
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
            EX2 ex = new EX2();
            ex.mth1();
        }
    }
}