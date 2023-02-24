package Day4;

import java.util.Scanner;

public class CustomException_ex4 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number from 1 to 100");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        try {
            if(number>100|| number <0){
                throw new MyException("Number not in the range");
            }
            
        } catch (MyException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        sc.close();
    }
}



//user Defined Exception
class MyException extends Exception{
    String Str;
    MyException(String Str){
        this.Str = Str;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.Str;
    }
}
