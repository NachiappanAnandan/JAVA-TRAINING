package getAlphabets_ex6;

public class NonAlphabetException extends Exception {
	String Message;
	
	NonAlphabetException(String Message){
		this.Message = Message;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Message;
	}
}
