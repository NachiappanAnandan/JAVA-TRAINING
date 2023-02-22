package Day2;


//add two complex numbers
public class AddComplex_ex2 {
    
    public static void main(String[] args) {
        //initializing two complex numbers
        complexNumbers c1 = new complexNumbers(3.5f, 2.1f);
        complexNumbers c2 = new complexNumbers(3.4f,5.6f);
        complexNumbers Result = complexNumbers.add(c1, c2);
        Result.showNumbers();
        
    }
    
    
}


class complexNumbers{
    public float real;
    public float img;

    //constrructors to set value
    complexNumbers(float r , float i){
        this.real = r;
        this.img =i;
    }
    complexNumbers(){
        this.real = 0.0f;
        this.img = 0.0f;
    }
    public void showNumbers(){
        System.out.println(real+" + i"+ img);
    }

    //adding complex numbers
    public static complexNumbers add(complexNumbers cn1 , complexNumbers cn2){
        complexNumbers result  = new complexNumbers();

        result.real  = cn1.real+cn2.real;
        result.img = cn1.img+cn2.img;
        return result;
    }
}