package commandPattern;

abstract public class Command {

//	Reference of classes
	ApplePhone ap;
	VivoPhone vp;
	SamsungPhone sp;
	
	public Command() {
		// TODO Auto-generated constructor stub
	}
	
	public Command(ApplePhone ap , VivoPhone vp , SamsungPhone sp) {
		this.ap = ap;
		this.vp = vp;
		this.sp = sp;
	}
	
	abstract public void merge();
	
}
