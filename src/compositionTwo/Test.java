package compositionTwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setColour("Silver");
		car.setMaxSpeed(75);
		car.printCarInformation();
		
		// This is composition, here Maruti800 has Engine.
		Maruti800 maruti = new Maruti800();
		maruti.marutiDemo();
	}

}
