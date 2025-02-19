
public class Car {

	//Attribute
	
	public String colour;			//normalerweise niemals public!
	private String brand;
	private int ps;
	
	//Konstruktor
	public Car(String colour, String brand, int ps) {		//Parameter...aus was soll Klasse bestehen
		this.colour = colour;								//was sind die Parameter
		this.brand = brand;
		this.ps= ps;
	}
	
	//Methoden
	
	public void drive(int speed) {
		System.out.println("Das Auto fährt..." + speed + "km/h");
	}
	
	public void drive() {
		System.out.println("Das Auto fährt...");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}
	
		
	
}