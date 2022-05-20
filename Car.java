package week1.Day1;

public class Car {
	public void applyBrake() {
		System.out.println("Apply the brake");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchonAc() {
		System.out.println("Switch on the AC");
	}
	public void applyAcclerate() {
	System.out.println("Slowly Accelerate");	
	}
	
	public static void main(String[] args) {
		//classname objectname=new class();
		Car ETIOS = new Car();
		ETIOS.applyBrake();
		ETIOS.applyGear();
		ETIOS.switchonAc();
		ETIOS.applyAcclerate();		
	}

}
