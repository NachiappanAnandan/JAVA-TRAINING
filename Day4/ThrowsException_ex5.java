package Day4;

import java.util.Scanner;

public class ThrowsException_ex5 {
    public static void main(String[] args)  {
        System.out.println("Enter a  Even number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       try {
//    	sys
        throwingException(n);
       } catch (Exception e) {
//         T ODO: handle exception
        System.out.println(e);
       }
    }

    
    public static void throwingException(int n) throws Exception{//method throwing exception
        if(n%2!=0){
            throw new MyException("It is not a even Number");
        }
 
    	
    }
}


