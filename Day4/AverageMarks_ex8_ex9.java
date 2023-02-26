package Day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageMarks_ex8_ex9 {
    public static void main(String[] args) throws MyException {
        Scanner sc= new Scanner(System.in);
        // int arr[] = new int[10];
        int mark;
        int total = 0;
        int i=0;
        System.out.println("Enter marks of 10 students:");
        for(;i<10;){
            try{
                System.out.println("Enter Mark of Student "+(i+1));
                mark = sc.nextInt();
                checkConstraint(mark);
                total+=mark;
                ++i;
            }catch(InputMismatchException e){//input mismatch exception
                sc.next();
                System.out.println("Enter a valid Value...");
            }catch(MyException Me){
                System.out.println(Me);
            }
           
        }

        System.out.println("The average of the marks of Students is "+ (double)total/10);
    }

    /**
     * 
     * Checking the mark is on range 0 to 100
     * @param n
     * @throws MyException
     */
    static void checkConstraint(int n) throws MyException{
        if(n<0|| n>100){
            throw new MyException("Mark is not int the range of 0 to 100");
        }
    
    }
    
}




class MyException extends Exception{
    String msg;
    MyException(String msg){
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg;
    }
}