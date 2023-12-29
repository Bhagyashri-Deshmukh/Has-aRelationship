package inheritance;

//this is working of the Is-A relationship 

import java.io.*; 

class Device { 

	private String deviceName; 

	public void setDeviceName(String deviceName) { 
		this.deviceName = deviceName; 
	} 

	public String getDeviceName() { 
		return this.deviceName + " is a Device"; 
	} 
} 

public class Bulb extends Device { 
	public static void main(String args[]) 
	{ 
		Device device = new Bulb(); 
		
		System.out.println("Device name is Bulb"); 
		device.setDeviceName("Bulb"); 

		System.out.println(device.getDeviceName()); 
	} 
}

