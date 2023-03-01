package visitorPattern;

public class InvalidPinException extends MyOwnExceptions{

	String message;
	 
	 public InvalidPinException(String message) {
		 this.message = message;
	 }
	 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return message;
		}

	 public void displayWarning() {
		 Handlers H = new Handlers();
		 H.handle(this);
	 }
}
