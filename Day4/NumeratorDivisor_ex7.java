package Day4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * NumeratorDivisor_ex7
 */
public class NumeratorDivisor_ex7 {
public static void main(String[] args)  {
    //Scanner
    Scanner sc = new Scanner(System.in);

    int NumeratorInt = 0 , DivisorInt = 0;
    Boolean gotNumerator =false , gotDivisor = false;


    for(;;){
        for(;!gotNumerator;){
            System.out.println("Enter the numerator: ");
            String Numerator = sc.next();
            CheckQ(Numerator);
            try {
                NumeratorInt=  NumeratorCheck(Numerator);
                gotNumerator = true;
            }catch (NumberFormatException e) {
                System.out.println("Enter a Valid Number");
            }
        }

        for(;!gotDivisor;){
            System.out.println("Enter the Divisor: ");
            try {            
                 DivisorInt = getDivisor();
                gotDivisor= true;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid input.");
            }
            catch(CustomException C){
                System.out.println(C);
            }
        }
        gotDivisor = false;
        gotNumerator = false;
        System.out.println("The Result is "+ (NumeratorInt/DivisorInt));
    
    }
    
}



//Method for checking q
static void CheckQ(String Numerator){
    char Q = Numerator.charAt(0);
    if(Q =='q'|| Q=='q'){
        System.exit(0);
    }
}
//method for getting the numerator
static int NumeratorCheck(String Numerator) throws NumberFormatException {
    int num = Integer.parseInt(Numerator);
    return num;
}

//method for getting divisor
static int getDivisor() throws CustomException ,InputMismatchException {//getting input inside
    Scanner sc = new Scanner(System.in);
    int Divisor = sc.nextInt();
    if(Divisor==0){
        throw new CustomException("Divisor cannot be zero.");
    }else{
        return Divisor;
    }
    
}

    
}




class CustomException extends Exception{
    String msg;
    CustomException(String msg){
        this.msg=msg;
    }
    @Override
    public String toString() {
        return msg;
    }
}