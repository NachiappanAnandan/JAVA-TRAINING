package Day1;

import java.util.Scanner;

//sorting

public class Sorting_ex7 {
	public static void main(String[] args) {
//	int arr[] = {45,6,78,9,12,1};


		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int N = sc.nextInt();

		int arr[] = new int[N];
		System.out.println("Enter the elements of array");

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}
		Ascending(arr);
		Descending(arr);

	}

	public static void Ascending(int arr[]){
		int temp;
		System.out.println("Ascending Order");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
//			checking greater
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

	
	/**
	 * @param arr
	 */
	public static void Descending(int arr[]){
		int temp;
		System.out.println("Descending Order");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
//			checking greater
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
