package Day1;

//quadratic function

public class ex24 {
    public static void main(String[] args) {
        QuadraticFunction qF = new QuadraticFunction(1,-6,8);
        qF.findRoots();

    }
}

class QuadraticFunction{
    public static int a,b,c;
    QuadraticFunction(){
        a=1;b=1;c=1;
    }

    QuadraticFunction(int A ,int B, int C){
       
    }

    //extractors
    public  int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    //modifier
    public void setABC(int A, int B, int C){
        a=A;
        b=B;
        c=C;
    }
    //find roots
    public void findRoots(){
        double root1 , root2 , calculate;
        double Bsq = Math.pow(b, 2);
        root1 = (-b)+Math.pow((Bsq-(4*a*c)), .5)/2*a;
        root2 = (-b)-Math.pow((Bsq-(4*a*c)), .5)/2*a;

        System.out.println(root1);
        System.out.println(root2);
    }



}