package getAlphabets_ex6;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 *  user defined exception for non alphabets
 */
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
