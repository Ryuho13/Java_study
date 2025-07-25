package sec01.exam04;

public class SupersonicAirplaneExample {
	public static void main(String[]args) {
	 SupersonicAirplane sa = new SupersonicAirplane();
	 
	 sa.takeOff();
	 sa.fly();
	 sa.flymode = SupersonicAirplane.SUPERSONIC;
	 sa.fly();
	 sa.land();
		
	}

}
