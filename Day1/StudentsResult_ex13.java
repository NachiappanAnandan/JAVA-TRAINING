package Day1;

import java.util.Scanner;

// result of students

public class StudentsResult_ex13 {
	 public static void main(String[] args) {
		//Scanner
		 Scanner sc = new Scanner(System.in);
		 
//		 NStudents
		 System.out.println("Enter the number of students:");
		 int N = sc.nextInt();
		 
		 int arr[][] = new int [N][5];
		 int result[] = new int [N];
		 int total =0;
		 
//		 get marks
		 for (int i = 0; i < N; i++) {
			 System.out.println("Enter the marks for Student "+ ""+(i+1));
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
				total+=arr[i][j];
			}
			result[i] = total;
			total=0;
		}
		 //print result
		 for (int i = 0; i < result.length; i++) {
			System.out.println("The Result of student "+(i+1) +" is "+ result[i]+ " out of 500");
		}
		 
	}
}
