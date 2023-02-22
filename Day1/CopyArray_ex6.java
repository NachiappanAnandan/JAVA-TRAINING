package Day1;
import java.util.Arrays;
public class CopyArray_ex6 {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,8};
        int arr2[] = new int[7];
        // copying elements to  the new  array
        // Arrays.copyOf(arr1, 8);
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(Arrays.toString(arr2));

    }
}
