package Day2;

public class Final_ex7 {
    public static void main(String[] args) {
        final FinalClass fc = new FinalClass(10);//initial value is 10
        fc.setValue(20);//set to value 20
        fc.display();//display value
    }
}

class FinalClass {
    int x;
    FinalClass(int x){
        this.x = x;
    }

    public void setValue(int x){
        this.x = x;
    }
    public void display(){
        System.out.println(this.x);
    }
}