package Day1;


//type casting

public class ex3 {
	public static void main(String args[]) {

		//using the values in primitive values class in ex 2
		PrimitiveTypes values = new PrimitiveTypes();
		
		
//		implicit type casting
		System.out.println("IMPLICIT TYPE CASTING");
		short s1 = values.b;
		System.out.println("Type casting byte to short = "+s1);
		
		int i1 = values.sh;
		System.out.println("Type casting short to int = "+i1);
		
		int i2 = values.c;
		System.out.println("Type casting char to int = "+i2);
		
		long l1 = values.i;
		System.out.println("Type casting int to long = "+l1);
		
		float f1 = values.i;
		System.out.println("Type casting int to float = "+f1);
		
		f1 = values.l;
		System.out.println("Type casting long to float = "+f1);
		
		double d1 = values.f;
		System.out.println("Type casting float to double = "+d1);
		d1 = values.l;
		System.out.println("Type casting long to double = "+d1);
		
		d1 = values.i;
		System.out.println("Type casting int to double = "+d1);
		
		
		System.out.println("EXPLICIT TYPECASTING");
		
		System.out.println("EXPLICIT Type casting byte to short = "+(short)values.b);
		System.out.println("EXPLICIT Type casting short to int = "+(int)values.sh);
		System.out.println("EXPLICIT Type casting int to long = "+(long)values.i);
		System.out.println("EXPLICIT Type casting long to float = "+(float)values.l);
		System.out.println("EXPLICIT Type casting float to double = "+(double)values.l);
		System.out.println("EXPLICIT Type casting char to int = "+(int)values.c);
		
		
		
	}
}
