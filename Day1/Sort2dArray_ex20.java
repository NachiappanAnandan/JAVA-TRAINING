package Day1;


//largest element in two dimensional array
public class Sort2dArray_ex20 {
    public static void main(String[] args) {
        int arr [][] = {
            {1,3,44,55,6,3,87,9} , {3,4,5,64,75,5,72,68}, {2,34,57,86,98,34,45,21}
        };
        int temp;

        // sorting array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = j + 1; k < arr[i].length; k++) {
    //			checking greater
                    if (arr[i][j] < arr[i][k]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Largest element in the array is "+arr[i][0]);
        }
    }
}
