package Exercise5.BridgePattern;

public class Triangle extends Shape{
    Triangle(Color color){
        super(color);
        }
    @Override
    public void revealShape() {
        System.out.println("This is Tiangle  Shape");
        color.revealColor();
    }
}
