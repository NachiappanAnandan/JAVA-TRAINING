package Day1.ex15;

import Day1.ex4;

// import Day1.ex5;

//prime numbers in 1 to 100
public class ex15a {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(ex4.isPrime(i))//uding isprime function in ex4 class
            System.out.println(i);
            
        }
    }
}
