package Day4;

import java.util.Scanner;

public class ThrowsException_ex5 {
    public static void main(String[] args) throws MyException {
        System.out.println("Enter a  Even number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       try {
        throwingException(n);
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
       }
    }

    
    public static void throwingException(int n) throws MyException{//method throwing exception
        if(n%2!=0){
            throw new MyException("It is not a even Number");
        }
       
    }
}


