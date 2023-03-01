package commandPattern;

public class CustomPhone1 extends Command{
	public CustomPhone1(ApplePhone ap , VivoPhone vp , SamsungPhone sp) {
		super(ap,vp,sp);
	}
	public void merge() {
		System.out.println("Custom mobile 1");
		ap.cameraQuality();
		vp.bateryCapacity();
		sp.storageCapacity();
		
	}
}
