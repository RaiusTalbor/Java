
public class Car {

	//Attribute --------------------------------------------------------------
	
	public String colour;	//normalerweise niemals public, hier aber wegen Zugriff von außen
	private String brand;
	private int ps;
	
	//Konstruktor ------------------------------------------------------------
	public Car(String colour, String brand, int ps) {
		//führt bei Instanziierung aus
		//dazu da, damit nichts public sein muss

		this.colour = colour;
		this.brand = brand;
		this.ps= ps;
	}
	
	//Methoden ---------------------------------------------------------------
	
	public void drive(int speed) {
		System.out.println("Das Auto f_hrt..." + speed + "km/h");
	}
	
	public void drive() {
		//überladen
		System.out.println("Das Auto f_hrt...");
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}
}