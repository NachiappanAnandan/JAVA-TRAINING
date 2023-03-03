package Exercise5.BridgePattern;

public abstract class Shape {
    protected Color color;

    Shape(Color color){
        this.color = color  ;
    }
    public abstract void revealShape();
}
