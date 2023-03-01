package commandPattern;

public class CustomPhone2 extends Command{
	public CustomPhone2(ApplePhone ap , VivoPhone vp , SamsungPhone sp) {
		super(ap,vp,sp);
	}
	public void merge() {
		System.out.println("Custom mobile 2");
		
		ap.storageCapacity();
		vp.cameraQuality();
		sp.bateryCapacity();
		
	}
}
