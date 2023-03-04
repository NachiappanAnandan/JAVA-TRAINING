package Exercise5.BridgePattern;

public class Square extends Shape{
    Square(Color color){
    super(color);
    }
    
    @Override
    public void revealShape() {
        System.out.println("This is Square Shape");
        color.revealColor();
    }
}
