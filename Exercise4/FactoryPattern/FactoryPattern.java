package FactoryPattern;

import java.util.Scanner;

public class FactoryPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the color");
		String color = scanner.next();
		
		Paint paint = PaintFactory.getInstance(color);
		
		paint.showColor();
		scanner.close();
		
		
		
	}

}
