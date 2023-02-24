package Day2;

/**
 * ex1
 */
public class PassByValueReference_ex1 {
    public static void main(String[] args) {
        //primitive values
        int a=10 ,b=20;
        //swaping primitive
        System.out.println("Primitive types are passed by value.");
        System.out.println("Before function call");
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
        swap(a,b);
        System.out.println("After function call");
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);


        // Array
        int arr[] = {1,2,3,4,5};
        System.out.println("Array before passing to the function");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        // altering array in function
        alterArr(arr);
        System.out.println("Array after passing to the function");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //Object creation

        AlterClass A = new AlterClass();
        System.out.println("\nObject is passed by reference.");
        System.out.println("Before function call");
        System.out.println(" A = "+A.a);
        System.out.println(" B = "+A.b);
        swapObj(A);
        System.out.println("After function call");
        System.out.println(" A = "+A.a);
        System.out.println(" B = "+A.b);
        


    }





    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("During function");
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
    }

    public static void alterArr(int arr[]){
        System.out.println("\n2nd element value is changed to 10");
        arr[2] = 10;
    }

    public static void swapObj(AlterClass ac){
        int temp;
        temp=ac.a;
        ac.a=ac.b;
        ac.b=temp;
        System.out.println("During function");
        System.out.println(" A = "+ac.a);
        System.out.println(" B = "+ac.b);
    }

}

/**
 * AlterClass
 */
class AlterClass {
    int a=10;
    int b=20;
    
}

