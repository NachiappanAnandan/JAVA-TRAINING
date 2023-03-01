package FactoryPattern;

public class PaintFactory {

	public static Paint getInstance(String color) {
		if(color == "red") {
			return new RedPaint();
		}else if(color == "blue") {
			return new BluePaint();
		}else if(color == "green") {
			return  new GreenPIaint();
		}
		return new  Default();
	}
}

