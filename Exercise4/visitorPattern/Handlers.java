package visitorPattern;

public class Handlers extends HandlerContainer {
	public void handle(InvalidNameException IN) {
		System.out.println("Enter the valid name for Transaction.");
	}
	public void handle(InvalidAgeException IN) {
		System.out.println("Enter the valid Age for Transaction.");
	}
	public void handle(InvalidPinException IN) {
		System.out.println("Enter the valid Pin for Transaction.");
	}
	
}
