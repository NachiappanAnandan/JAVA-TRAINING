package statergyPattern;

import java.lang.reflect.InvocationTargetException;

class ChooseTransport {
 public static Transport transportSelector(String TransportChoice) {

	 
	 try {
		return (Transport) Class.forName("statergyPattern."+TransportChoice).getConstructor().newInstance();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
 }
}

interface Sample{
	public Sample createMe(Car car);
	public Sample createMe(Walk walk);
	public Sample createMe(Bicycle bicycle);
	public Sample createMe(MotorCycle motorcycle);
}