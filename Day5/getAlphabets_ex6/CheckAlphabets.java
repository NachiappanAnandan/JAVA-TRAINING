package getAlphabets_ex6;
/**
 *  @author Nachiappan 
 *   @version 1.0*//* 
 * Class check the character is alphabet or not 
 */
public class CheckAlphabets {
//	String Input;
	
	int count =0;
	CheckAlphabets(String s){
		doCheck(s);
		
		
	}
	
	public void doCheck(String Input)  {
		for(int i=0;i<Input.length();i++) {
			try {
				if(checkAlphabet(Input.charAt(i))) {
					count++;
					System.out.println(Input.charAt(i)+" is an alphabet");
				}
			}catch(NonAlphabetException e) {
				System.out.println(Input.charAt(i)+" "+e);
			}
			
		}
		
		System.out.println("The alphabetCount is "+count);
	}
	
	public boolean checkAlphabet(char c) throws NonAlphabetException{
		if(!Character.isAlphabetic(c)) {
			throw new NonAlphabetException("is not an Alphabet");
		}
		
		return true;
	}
	
	
	
}
