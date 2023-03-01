package singletonPattern;

public class ObjCreation {
public static void main(String[] args) {
	SingletonClass  s1 = SingletonClass.CreateInstance();
	SingletonClass s2 = SingletonClass.CreateInstance();
	
	System.out.println(s1);
	System.out.println(s2);
	
	s1.changeValue(10);
	s2.printValue();
}
}
