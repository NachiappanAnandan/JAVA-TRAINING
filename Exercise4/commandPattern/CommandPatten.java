package commandPattern;

public class CommandPatten {
public static void main(String[] args) {
//	Normal phones
	ApplePhone apple = new ApplePhone();
	VivoPhone vivo = new VivoPhone();
	SamsungPhone samsung = new SamsungPhone();
	
	
//Random mobiles
	Command phone1 = new CustomPhone1(apple, vivo, samsung);
	Command phone2 = new CustomPhone2(apple, vivo, samsung);
	
	
	MobileCreator MC = new MobileCreator();
	
	MC.createMobile(0, phone1);
	MC.createMobile(1, phone2);
	
	
}
}
