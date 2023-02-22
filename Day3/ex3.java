package Day3;

//stack interface
interface stack{
    public void push(int n);
    public void pop();
}

class FixedStack implements stack {
    static int pos=0;
    int a[]= new int [0];
    int length;
    FixedStack(int n){
        
        this.a = new int[n];
        this.length=n;
        System.out.println("Stack is created with length "+length);

    }
    // int a[]= new int [0];
    public void push (int n){
        if(pos<length){
            a[pos++] = n;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if(pos==length){//corresct positiioning of stack
            --pos;
        }
        if(pos==0){
            System.out.println("Stack is Empty");
        }else{
            a[pos--]=0;
        }
    }

    public void PrintStack(){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}


class DynamicStack{
    
    int length;
    int arr[];
    static int pos =0;

    DynamicStack(){
        this.length =10;
        this.arr=new int[this.length];
    }

    public void push(int n){
       if(pos<arr.length){
        this.arr[pos++]=n;
       }else{
        increaseStack();
        this.arr[pos++]=n;
       }
    }

    public void pop(){
        if(pos==0){
            System.out.println("Stack is Empty");
        }else{
            this.arr[pos--]=0;
        }
    }

    public void PrintStack(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" "+arr[i]);
        }
    }

    public void increaseStack(){
        int expand[] = new int[this.length*2];//new array with extra space
        this.length*=2;
        // copying elements to new array
        for (int i = 0; i < this.arr.length; i++) {
            expand[i]=this.arr[i];
            
        }
        //  COPYING TO THIS ARRAY
        this.arr=expand;
       

    }


   

}
public class ex3 {
    public static void main(String[] args) {
        System.out.println("FIXED STACK");

        FixedStack FS = new FixedStack(5);
        FS.PrintStack();
        FS.push(34);
        FS.push(31);
        FS.push(2);
        FS.push(90);
        FS.push(4);
        FS.push(76);
        // FS.PrintStack();
        FS.pop();
        FS.PrintStack();


        System.out.println("DYNAMIC STACK");
        DynamicStack DS = new DynamicStack();
       DS.push(12);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.push(20);
       DS.pop();
       DS.pop();
       DS.pop();



        DS.PrintStack();
        

        

        // DS.PrintStack();
    }
}
