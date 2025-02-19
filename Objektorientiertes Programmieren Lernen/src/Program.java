
public class Program {

	public static void main(String[] args) {

	Car car1 = new Car("Grün", "Toyota", 110);
	
	/*car1.drive();
	car1.colour = "Gelb";		//da public, Wert veränderbar	
	System.out.println(car1.colour);
	
	car1.setBrand("Rot");
	System.out.println(car1.getBrand());
	*/
	
	System.out.println(car1.getBrand()); 
	
	car1.drive(30);
	
	}
	 
	
}