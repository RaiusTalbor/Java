package java;

public class Java_lernen {

	public static void main(String[] args) {

		System.out.println("Hallo Welt");
		System.out.print("x ");				//ohne Zeilenumbruch
		
		int var = 27;		//Initialisierung
		int var2;			//Deklaration
		var = 29;			//Zuweisung
		
		var += 1;
		var ++;
		
		String name = "Tim";
		
		double kommazahl = 3.84738748346834638463846;
		long ganzzahl = 1234567894;
		int ganzzahl2 = 1233466;
		short ganzzahlkurz = 32766;				//kurze Ganzzahlen
		byte kurzeganzzahl = 127;				//gr_tm_glichste Ganzzahl ist 127
		char einbuchstabe = 'L';				//nur einzelne Buchstaben
		
		System.out.println("Text einf_gen");	//Reihenfolge etc. egal
		System.out.println(name);
		System.out.println(var + ganzzahl +"Text einf_gen" + kurzeganzzahl + "was auch immer Du hier haben willst");
		
		//Rechnen/Arithmetische Operatoren
		
		int L1 = 3 + 4;
		int L2 = 3 - 4;
		int L3 = 3 * 4;
		int L4 = 12 / 4;		//nur Dezimalzahlen werden ausgegeben; bei Ganzzahldatentypen wird auch nicht auf Rundung geachtet!		
		int L5 = 32 % 3;

		/*
		<, >, <=, >=, ==, !=
		*/

		//Arrays -------------------------------------------------------------

		String [] arrayvariablenbezeichnung = new String[3]; //Die Gr_e eines Arrays wird immer mit der Initialisierung festgelegt.
		
		arrayvariablenbezeichnung[0] = "Hendrik";			 //Achtung Größe!
		arrayvariablenbezeichnung[1] = "Paul";
		arrayvariablenbezeichnung[2] = "Fabienne";

		String [] var3 = {"Hendrik", "Paul", "Fabienne"};				//autom. Anzahl Strings

		int var4 = arrayvariablenbezeichnung.length;
		int var5 = arrayvariablenbezeichnung[0].length();
		
		//Mehrdimensionales Array
		
		String [][] firstAndLastName = new String [5][2];
		
		firstAndLastName [0][0] = "Franz";
		firstAndLastName [0][1] = "Bauer";
		
		firstAndLastName [1][0] = "Felix";
		firstAndLastName [1][1] = "Huber";
		
		firstAndLastName [2][0] = "Fritz";
		firstAndLastName [2][1] = "Meier";
		
		//_u_ere for-Schleife: Zeilenindex i
		//innere for-Schleife: Spaltenindex j
		
		for(int i = 0; i < firstAndLastName.length; i++) {
			for(int j = 0; j < firstAndLastName[i].length; j++) {
			System.out.print(firstAndLastName[i][j] + " ");
		}
		System.out.println();	
		}

		//Objekte ------------------------------------------------------------

		//Objekt erstellen
		Object name2 = new Object(); 
		
		//Methode aufrufen
		name2.methode();
		
		//If-Abfragen --------------------------------------------------------

		if(var > 17) {
			//
		}
		else { 
			//
		}
		
		//Switch -------------------------------------------------------------

		switch(einbuchstabe) {				//auch Strings und allles andere
			case 'A': System.out.println("..."); break;
			default: System.out.println("was anderes."); break;
		}
		
		//while-Schleifen ----------------------------------------------------

		while(var <= 30) {
			System.out.println(var);
			var = var + 1;				//Printe so oft das Alter aus, bis es <=30 ist. Bei jedem Durchlauf wird 'age' um 1 erh_ht.
		}

		//do-while-Schleife
		do {							//selbes Bsp. wie oben
			System.out.println(var);
			var = var + 1;
		}
		while(var <= 30);
		
		//for-Schleife -------------------------------------------------------
		
		for(int i = 0; i < 10; i+= 1) {
			System.out.println(i);
		}

		String [] names = new String[5];
		for(String names2 : names) {	
			//foreach
			//Durchlaufe das Array names Schritt f_r Schritt und 
			//speichere immer eine Kopie vom Wert an der aktuellen Stelle in die Variable "names2", die vom Typ String ist.
			//hier kann ich auf die Variable zugreifen; es wird nur eine Kopie angesprochen, die Originale bleiben unver_ndert!
		}

		//Fehlerbehandlung ---------------------------------------------------

		try {
			//versuche
		} 
		catch (Exception e) {
			//falls Fehler aufgetreten
		}
		finally {
			//immer danach, egal ob Fehler oder nicht
		}

		int fehler = 1;
		if (fehler == 0) {
			throw new ArithmeticException ("Ein Fehler ist aufgetreten");
		}
		
		//Methoden -----------------------------------------------------------
		
		int varMethode = methode(20, 20);
	}
	
	//"neue Fkt."
	public static int methode (int nummerl, int nummerr) {
		int result = nummerl + nummerr;
		return result;
	}	
	//public oder private, static kann man auch weglassen, Rückgabewert, Parameter

	//Interface --------------------------------------------------------------

	//wie Klasse, nur mit Interface
	public interface InterfaceJavaLernen {
		//wie eine Klasse, nur alles offen gelassen, oftmals auch nur für Konstanten
		//für Mehrfachvererbung
	}

	//Generics, parametrisierter Typ -----------------------------------------

	//T ist Platzhalter und kann an jeder Stelle eines Typs stehen, wo es benötigt wird

	public class Box<T> {
		private T value;

		public void setValue(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		//Anwendungsbeispiel
		//wenn ich G[] einschränken will, kann ich auch "extends value" dahinterschreiben, 
		//dann werden nur Typen mit Oberklasse value erlaubt (davon aber alle Unterklassen)
		public <G> void printArray(G[] array) {
        	for (G element : array) {
            System.out.println(element);
        	}
    	}
	}

	//ein bisschen Advanced-Zeug unter Projekt TODO-Liste, ab hier unvollständig

	//Swing ------------------------------------------------------------------

	public class void Swing () {
		//Fenster erstellen
		JFrame mainFrame = new JFrame;
        mainFrame = new JFrame("TODO-Liste");
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);

		// Menü "Datei"
        JMenu dateiMenu = new JMenu("Datei");
        JMenuItem beendenItem = new JMenuItem("Beenden");
        JMenuItem hilfe = new JMenuItem("Hilfe");

        // Menüeinträge zeichnen
        dateiMenu.add(hilfe);
        dateiMenu.add(beendenItem);

        // Aktionen hinzufügen
        beendenItem.addActionListener(e -> System.exit(0));

		// Menü "neues Item"
        JMenu neueListeMenu = new JMenu("Neues Item");
        JMenuItem neueAufgabe = new JMenuItem("Neue Aufgabe");
        JMenuItem neueNotiz = new JMenuItem("Neue Notiz");
        neueListeMenu.add(neueAufgabe);
        neueListeMenu.add(neueNotiz);

		//--> viel unter TODO-Liste 
	}

	//Javadoc
	/*
	 * Über jeder Methode und Liste bzw. globale Var.
	 * Kann bei VSC nicht so einfach erstellt werden, erkennt die Syntax aber.
	 * Erstellung bisher nur über IntelliJ
	 */

	/**
     * Die Speicherliste selbst kann wie ein Päckchen angesehen werden, was viele weitere Päckchen enthält, mit denen dann die konkrete
     * Aufgabe identifiziert und rekonstruiert werden kann. 
	 * Diese Funktion ist notwendig, um einen Crash bei Programmstart zu verhindern, da sonst zum
     * Anzeigen der Aufgaben {@link #aufgabenNeuZeichnen} verwendet wird. Dies funktioniert nicht, da
     * {@link #aufgabenNeuZeichnen} zusätzlich noch {@link #aufgabeVerstecken(Aufgabe)} verwendet, was nicht funktioniert,
     * wenn noch keine Aufgaben angezeigt wurden. Außerdem wurde die for-Schleife eingespart, die die yKoordinaten
     * aller Tabs ({@link Tab}) zurücksetzt, was zum Start ja nicht benötigt wird. <br>
     * Die Funktion iteriert also nur durch die {@link #aufgabenliste} und ordnet jeder Aufgabe an, sich zu zeichnen.
     * Das große Paket dient der leichten Handhabung für das Speichern. So ist kein Parsen notwendig und es braucht nur eine Liste
     * geladen und gespeichert werden, die das Programm je nach Bedarf auspacken kann.
     * 
     * @see Aufgabe
     * @see Aufgabe#speichern
	 * 
	 * @param aufgabe Aufgabe, die versteckt werden soll.
     */
}