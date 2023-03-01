package visitorPattern;

public abstract class HandlerContainer {
	public  abstract void handle(InvalidNameException IN);
	public abstract void  handle(InvalidAgeException IA);
	public abstract void  handle(InvalidPinException IP);
}
