package Day1;

// Reverse elements in two dimensional array
public class ex19 {
    public static void main(String[] args) {
        int arr [][] = {
            {1,3,44,55,6,3,87,9} , {3,4,5,64,75,5,72,68}, {2,34,57,86,98,34,45,21}
        };
        // Reversing array
        for (int i = 0; i < arr.length; i++) {
            ex9.reverseArr(arr[i]); // resuing the reverse class in ex9
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
