package Day1;

import java.util.Scanner;

//
public class DaysInMonth_ex21 {
    public static void main(String[] args) {
        // Getting input
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine().toLowerCase();


    switch (str) {
        case "january" ,"march" , "may" , "july" , "september" , "november":
            System.out.println("31 DAYS");
            break;
        
        case "february":
            System.out.println("Enter The Year:");
            int year = sc.nextInt();

            // finding leapyear
            if(year%4==0 || ((year%100==0) && (year%400==0))){
                System.out.println("29 DAYS");//leap year             
            }else{
                System.out.println("28 Days");//not a leap year
            }
            break;
        
        case "april" , "june" , "august"  , "october" ,"december":
            System.out.println("30 DAYS");
            break;
    
        default:
            System.out.println("Not a valid month");
            break;
    }
    sc.close();
    }
    
}
