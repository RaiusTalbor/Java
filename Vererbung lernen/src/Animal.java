public class Animal {				
	//Elternklasse, oder Superklasse

	private String name;
	private int age;
	
	public void sleep() {
			System.out.println("Schlafen...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public final void methode() {
		//Diese Methode darf von den Unterklassen nicht verändert werden
	}

}
