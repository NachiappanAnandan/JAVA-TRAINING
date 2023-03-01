package visitorPattern;

import java.util.Scanner;

public class AtmInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name , pin ;
		int age;
		
		System.out.println("Enter the valid name:");
		name = scanner.next();
		System.out.println("Enter the valid Age:");
		age = scanner.nextInt();
		System.out.println("Enter the valid Pin:");
		pin = scanner.next();
		
		Checker check = new Checker(name, age, pin);
		
		try {
			check.doChcek();
		} catch (MyOwnExceptions e) {
			// TODO: handle exception
			e.displayWarning();
			
		}
	
	}
}
