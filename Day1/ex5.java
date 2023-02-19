package Day1;

import java.util.Scanner;

//average of n numbers

public class ex5 {
	public static void main(String[] args) {
		//scanner
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int N =  sc.nextInt();
		
		
		System.out.println("The average is "+ average(N));
		
		sc.close();
	}
	public static float average (int n) {
		return (n*(n+1)/2)/n;
	}
}
