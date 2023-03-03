package statergyPattern;

import java.util.Scanner;

public class UserChoice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your choice of transport");
		String Choice = scanner.next();
		
		Transport transportMode = ChooseTransport.transportSelector(Choice);
		transportMode.ShowRoute();
		
		scanner.close();
	
	}
}
