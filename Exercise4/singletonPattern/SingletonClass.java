package singletonPattern;

public class SingletonClass {

	private static SingletonClass SingleObj = null;
	
	int value ;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass CreateInstance() {
		
		if(SingleObj == null) {
			SingleObj = new SingletonClass();
		}
		return SingleObj;
	}
	
	public void  changeValue(int n) {
		value  = n;
	}
	
	public void printValue() {
		System.out.println(value);
	}
	
	
	
}
