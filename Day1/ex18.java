package Day1;


//Numbers to words
public class ex18 {
    // Declaring array for letters
    public static void main(String[] args) {
        String Words[][] = {
            {"One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" }, 
            {"Ten" , "Twenty" ,"Thirty" , "Forty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety"}
        };
        int length = 0 , quotient = 0;
    
        int n = 123;
        int duplicate = n;
    
        for(;duplicate !=0;duplicate/=10,length++);
        duplicate = n;
        
        for (;n!=0;) {
            // System.out.println(length);
            quotient =(int) Math.round(n/Math.pow(10, --length)) ; //Getting the first digit
            System.out.print(Words[0][quotient-1]+ " ");
            n%=Math.pow(10, length);
        }


    }
    



}
