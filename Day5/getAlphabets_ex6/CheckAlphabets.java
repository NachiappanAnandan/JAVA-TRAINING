package getAlphabets_ex6;

public class CheckAlphabets {
//	String Input;
	
	int count =0;
	CheckAlphabets(String s){
		DoCheck(s);
		
		
	}
	
	public void DoCheck(String Input)  {
		for(int i=0;i<Input.length();i++) {
			try {
				if(CheckAlphabet(Input.charAt(i))) {
					count++;
					System.out.println(Input.charAt(i)+" is an alphabet");
				}
			}catch(NonAlphabetException e) {
				System.out.println(Input.charAt(i)+" "+e);
			}
			
		}
		
		System.out.println("The alphabetCount is "+count);
	}
	
	public boolean CheckAlphabet(char c) throws NonAlphabetException{
		if(!Character.isAlphabetic(c)) {
			throw new NonAlphabetException("is not an Alphabet");
		}
		
		return true;
	}
	
	
	
}
