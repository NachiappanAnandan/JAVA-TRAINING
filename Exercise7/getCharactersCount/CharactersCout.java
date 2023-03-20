package getCharactersCount;

import java.util.Scanner;

public class CharactersCout {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		int count=0;
		char c;
		
		while(true) {
			c=scanner.next().charAt(0);
			count++;
			System.out.println("The count is "+count);
		}
	}
}
