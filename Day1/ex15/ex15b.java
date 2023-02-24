package Day1.ex15;

import java.util.Scanner;

//check whether amstrong or palindrome or perfect number
public class ex15b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       Execute ex = new Execute();
        ex.doCheck(N);
        sc.close();
        
       
       
    }
}

class Execute{
    CheckingNumber ch  = new Amstrong() ;
    public void doCheck(int N){
        ch.evaluate(N, this);
    }
}

abstract class CheckingNumber{
abstract void evaluate(int N  ,Execute ex);
}

//checking amstrong
 class Amstrong extends CheckingNumber{
    @Override
   void evaluate(int N ,Execute ex ){
    int length=0 ,duplicate = N, remainder , result = 0;
    for(;duplicate!=0;duplicate/=10,length++);//finding length
    duplicate = N;
    for(;duplicate!=0;){
        remainder = duplicate%10;
        result+= Math.pow(remainder, length);
        duplicate/=10;
    }
    if(result== N){
        System.out.println("It is an Amstrong Number");
    }else{
        System.out.println("It is not an amstrong number");
    }
    ex.ch = new perfectNum();
    ex.doCheck(N);
    
}
}

//checking perfect number
class perfectNum extends CheckingNumber{
    void evaluate(int N ,Execute ex ){
        int result = 0;
        //divisors addition
        for (int i = 1; i <= N/2; i++) {
            if(N%i==0){
                result+=i;
                
            }
        }
        //checking
        if(result== N){
            System.out.println("It is perfect Number");
        }else{
            System.out.println("It is not perfect number");
        }
        ex.ch = new palindrome();
        ex.doCheck(N);
    }
    

}

//checking palindrome
class palindrome extends CheckingNumber{
    void evaluate(int N  , Execute ex){
        int duplicate = N, result=0,remainder;
        for(;duplicate!=0;){
            remainder = duplicate%10;
            result = (result*10)+remainder;
            duplicate/=10;
        }
        if(result== N){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
        
    }
    
}