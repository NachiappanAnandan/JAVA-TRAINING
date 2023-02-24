package Day1;
//Default values of primitive values
public class DefaultValues_ex2 {

	public static void main(String args[]) {
		DefaultValues types = new DefaultValues();
		types.display();
		
	}
	
	}
class PrimitiveTypes{
	byte b = 127;//-128 to 127
	short sh = 32_767; //–32,768 to 32,767
	int i = 2_147_483_647; //–2,147,483,648 to 2,147,483,647
	long l =  2_147_483_647_567L;
	float f = 1.3f;
	double d = 2.4566;
	char c='n';
	boolean bol = true;
}
class DefaultValues{
	byte b ;
	short sh ;
	int i ;
	long l ;
	float f ;
	double d ;
	char c;
	boolean bol ;

	public void display() {
		System.out.println("byte value = "+ b);
		System.out.println("short value = "+ sh);
		System.out.println("int value = "+ i);
		System.out.println("long value = "+ l);
		System.out.println("float value = "+ f);
		System.out.println("double value = "+ d);
		System.out.println("char value = "+ c);
		System.out.println("boolean value = "+ bol);
	}
}



