package oop;

public class Program {

	public static void main(String[] args) {

		Car car1 = new Car("Gr_n", "Toyota", 110);
		
		car1.drive();
		car1.drive(30); 				//überladen

		car1.colour = "Gelb";				//da public, Wert ver_nderbar	
		System.out.println(car1.colour);
		
		car1.setColour("blau");
		
		System.out.println(car1.getColour()); 
	}
}