package Day1;

import java.util.Scanner;

//prime or not

public class Prime_ex4 {
	
	public static void main(String[] args) {
		// Scanner
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to check Prime or not:\n");
		int N = sc.nextInt();
		if(isPrime(N)){
			System.out.println(N+" is a prime number");
		}else{
			System.out.println(N+" is not a prime number");
		}
		sc.close();
	}
		

		public static boolean  isPrime(int N){
			;
		
			for(int i=2;i<N/2;i++) {
				if(N%i==0) {//CHECKING DIVISIBLITY
					return false;
				}
			}
			return true;
			
		}
	}
	
		
		
		
	
