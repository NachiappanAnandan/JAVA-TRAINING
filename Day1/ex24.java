package Day1;

//quadratic function

public class ex24 {
    public static void main(String[] args) {
        QuadraticFunction qF = new QuadraticFunction(1,-3,10);
        qF.calculate(4);

    }
}

class QuadraticFunction{
    public  int a,b,c;
    QuadraticFunction(){
        a=1;b=1;c=1;
    }

    QuadraticFunction(int A ,int B, int C){
       this.a=A;
       this.b=B;
       this.c=C;
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
    // public void setABC(int A, int B, int C){
    //     this.a=A;
    //     this.b=B;
    //     this.c=C;
    // }

    //find roots
    public void calculate(int x){
        // double root1 , root2 , calculate;
        // double Bsq = Math.pow(b, 2);
        // root1 = (-b)+Math.pow((Bsq-(4*a*c)), .5)/2*a;
        // root2 = (-b)-Math.pow((Bsq-(4*a*c)), .5)/2*a;

        // System.out.println(root1);
        // System.out.println(root2);
        // System.out.println(a*(b*x));
        int result = a*(x*x)+(b*x)+c;

        System.out.println(result);


    }



}