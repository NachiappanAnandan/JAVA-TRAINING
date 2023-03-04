package commandPattern;

public class MobileCreator {
	Command Phones [] = new Command[3];
	
	public MobileCreator() {
		
		for(int i=0;i<Phones.length;i++) {
			Phones[i] = new dummyMobile();
		}
		// TODO Auto-generated constructor stub
	}
	
	public void createMobile(int i , Command C) {
		Phones[i] = C;
		
	}
	public void displayMobile(int i ) {
		Phones[i].merge();
		
	}
}
