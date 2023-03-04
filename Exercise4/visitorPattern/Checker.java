package visitorPattern;

public class Checker {

	String name,Pin;
	int age;
	
	Checker(String name , int age, String Pin){
		this.name = name;
		this.age = age;
		this.Pin = Pin;
	}
	public void  doChcek() throws MyOwnExceptions {
		if(name!="RAMU") {
			throw new InvalidNameException("It is not an valid name"); 
		}else if(age<=18) {
			throw new InvalidAgeException("It is not an valid age"); 
		}else if(Pin!="1234") {
			throw new InvalidPinException("It is not an valid Password"); 
		}
		
	}
	
	
}
