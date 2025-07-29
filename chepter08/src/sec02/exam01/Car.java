package sec02.exam01;

public class Car {
	Tire frontLeftTire = new HanlookTire();
	Tire frontRightTire = new HanlookTire();
	Tire backLeftTire = new HanlookTire();
	Tire backRightTire = new HanlookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

}
