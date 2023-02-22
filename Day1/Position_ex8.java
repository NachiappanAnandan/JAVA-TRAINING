package Day1;

//position of element
public class Position_ex8 {
 public static void main(String[] args) {
	int arr [ ] = {2,43,5,67,9,12,5};
	
	int N = 1;
	
	findPos(arr, N);

	
	
}
public static void findPos(int arr[] , int N){
	boolean present = false;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == N) {
			present = true;
			int pos = i+1;
			System.out.println("The position of the element is " + pos );
		}
	}
	if(!present){
System.out.println("The element is not present");
	}
}
}
