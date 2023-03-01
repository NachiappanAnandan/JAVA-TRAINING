package statergyPattern;

class ChooseTransport {
 public static Transport transportSelector(String TransportChoice) {
	 if(TransportChoice == "car") {
		 return new Car();
	 }else  if(TransportChoice == "walk") {
		 return new Walk();
	 }else  if(TransportChoice == "bicycle") {
		 return new Bicycle();
	 }else  if(TransportChoice == "Motorcycle") {
		 return new MotorCycle();
	 }
	 return new Car();
 }
}
