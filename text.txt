package ded;

public class myBike {

	public static void main(String args[]) {
		Bike b1  = new Bike();
		Bike b2  = new Bike();
		
		b1.brand = "Yahama";
		b1.color = "black";
		b1.accelerate();
		b1.accelerate();
		b1.brake();
		b1.details();
		
		
		b2.brand = "Kawasaki";
		b2.color = "Green";
		b2.accelerate();
		b2.accelerate();
		b2.accelerate();
		b2.brake();
		b2.details();
	}
}

class Bike{
	int wheels = 2;
	String brand = "";
	String color = "";
	int speed = 0;
	public void accelerate() {
		this.speed++;
		System.out.println("Speed Increased by 1. Current speed: "+this.speed);
	}
	public void brake() {
		this.speed--;
		System.out.println("Speed Decreased by 1. Current speed: "+this.speed);
	}
	public void details() {
		System.out.println("No of wheels: "+this.wheels);
		System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
	}
}
