package Exercise5.BridgePattern;

public class BridgePatternImplement {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedShape());

        circle.revealShape();
    }
}
