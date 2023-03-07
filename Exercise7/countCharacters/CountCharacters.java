package countCharacters;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count=0;

        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)!=' '){
                count++;
            }
            
        }

        System.out.println("The number of words in the string is "+count);
		
		
		
		
	}
}
