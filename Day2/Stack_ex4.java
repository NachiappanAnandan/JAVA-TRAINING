package Day2;

import java.util.Stack;

//stack
public class Stack_ex4 {
    public static void main(String[] args) {
        Stack<Integer> s  =new Stack<>();//int stack
        int arr [ ] = {1,3,5,7,9,2,4};
        for (int i = 0; i < arr.length; i++) {
                s.push(arr[i]);
        }
        System.out.println("The Stack is " + s);
    }
}
