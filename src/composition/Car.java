package composition;

public class Car {

	private String colour;
	private int maxSpeed;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void printCarInformation() {
		
		System.out.println("Car colour is : "+colour);
		System.out.println("Car speed is : "+maxSpeed);
	}	
}
