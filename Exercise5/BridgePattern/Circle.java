package Exercise5.BridgePattern;

public class Circle extends Shape{
    Circle(Color color){
        super(color);
        }
    @Override
    public void revealShape() {
        System.out.println("This is circle Shape");
        color.revealColor();
    }
}
