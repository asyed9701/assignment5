package assignment5;

class Car {
	public void motion() {
		System.out.println("Car can move up to 150mph");
	}
}

class Bike extends Car {
	public void motion() {
		System.out.println("Bikes can move up to 30mph");
	}
}

public class RunTimePoly {
	public static void main(String args[]) {
		Car a = new Car(); // Car reference and object
		Car b = new Bike(); // Car reference but bike object
		a.motion(); // runs the method in Car class
		b.motion(); // runs the method in Bike class
	}
}
