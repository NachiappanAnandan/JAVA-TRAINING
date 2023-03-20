package countCharacters;

import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        

        String words[] = input.split("\\s");

        for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
        System.out.println("The number of words in the string is "+words.length);
		
		
		
		
	}
}
