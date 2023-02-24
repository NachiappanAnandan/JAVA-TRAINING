package Day2;

// 
public class WiproSubClass_ex12 {
    public static void main(String[] args)  {

        Wipro w1 = new WiproTechnologies();
        Wipro w2 = new WiproInfoTech();
        Wipro w3 = new WiproBPO();
        Wipro arr [] = {w1,w2,w3};
        for (int i = 0; i < arr.length; i++) {
            arr[i].Display();
        }
        
    }
}
abstract class Wipro{
    abstract public void Display();
}

class WiproTechnologies extends Wipro{
    @Override
    public void Display(){
        System.out.println("Wipro Technologoes");
    }
}
class WiproInfoTech extends Wipro{
    public void Display(){
        System.out.println("Wipro InfoTech");
    }
}
class WiproBPO extends Wipro{
    public void Display(){
        System.out.println("Wipro BPO");
    }
}