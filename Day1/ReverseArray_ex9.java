package Day1;
//reverse an array

public class ReverseArray_ex9 {
	public static void main(String[] args) {
			int arr[] = {45,78,9,12,1};
			
			reverseArr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}
	public static void reverseArr(int arr[]){
		int temp , n = arr.length;
		for (int i = 0; i < n/2; i++) {
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
	}
}
