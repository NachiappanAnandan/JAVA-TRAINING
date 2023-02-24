package Day1;


//position and occurance
public class PositionOccurance_ex16 {
    public static void main(String[] args) {
        int arr [ ] = {2,43,5,67,9,12,5};
        int count = 0;
        int N = 5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==N){
                count++;
            }
        }
        if(count==0){
            System.out.println("It is not present in the array");
        }else{
            System.out.println("It occurs "+count+" times in the array");
            Position_ex8.findPos(arr, N);//find position in ex8 class
        }

    }
   
}
