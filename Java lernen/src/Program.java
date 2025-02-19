
public class Program {

	public static void main(String[] args) {
		System.out.println("Hallo Welt");
		
	int age = 27;		//Initialisierung
	int age2;			//Deklaration
	age = 29;			//Zuweisung
	
	age += 1;			//age = age + 1; 
	age ++;				//nur, wenn man Wert um 1 erhöhen möchte
	
	String name = "Tim";		//für Texte
	
	double kommazahl = 3.84738748346834638463846; 		//größter Definitionsbereich
	long ganzzahl = 1234567894; 						//größtmögliche Ganzzahlen
	int ganzzahl2 = 1233466;							//Ganzzahl
	short ganzzahlkurz = 32766;							//kurze Ganzzahlen
	byte kurzeganzzahl = 127;							//größtmöglichste Ganzzahl ist 127
	char einbuchstabe = 'L';							//nur einzelne Buchstaben
	
	System.out.println("Text einfügen");				//Reihenfolge etc. egal
	System.out.println(name);
	System.out.println(age);
	System.out.println(kommazahl);
	System.out.println("Text einfügen" + age);
	System.out.println(age + ganzzahl +"Text einfügen" + kurzeganzzahl + "was auch immer Du hier haben willst");
	
	//Rechnen/Arithmetische Operatoren:
	
	int L1 = 3 + 4;
	int L2 = 3 - 4;
	int L3 = 3 * 4;
	int L4 = 12 / 4;		//nur Dezimalzahlen werden ausgegeben; bei Ganzzahldatentypen wird auch nicht auf Rundung geachtet!
	int Ergebnis = L1 + L2;
	System.out.println(L3 + L4);
	System.out.println(L3 + " " + L4); //wenn die Rechnung nicht durchgeführt werden soll, sondern beide Zahlen hintereinander ausgeg. werden soll
	
	//Der Modulo Operator
	
	int L5 = 32 % 3; //gibt Rest der / Rechnung aus
	
	//If-Abfragen
	
	if(5 < 8) { 
		System.out.println("Das ist korrekt.");
	}

	int alter = 17;
	alter = alter + 1;
	
	if(alter > 17) {
		System.out.println("Du darfst Auto fahren.");
	}
	else { 
		System.out.println("Du darfst nicht Auto fahren");
	}
	
	switch(einbuchstabe) {											//auch Strings und allles andere
		case 'A': System.out.println("..."); break;
		case 'H': System.out.println("..."); break;
		case 'L': System.out.println(":-)"); break;
		default: System.out.println("was anderes."); break;
	}
	
	//while-Schleifen
	
	while(age <= 30) {
		System.out.println(age);
		age = age + 1;				//Printe so oft das Alter aus, bis es <=30 ist. Bei jedem Durchlauf wird 'age' um 1 erhöht.
	}
	//do-while-Schleife
	
	/*
	 * Hallo, ich habe ganz viel auskommentiert!
	 * 
	 * 
	 */
	
	do {							//selbes Bsp. wie oben
		System.out.println(age);
		age = age + 1;
	}
	while(age <= 30);
	
	//for-Schleife
	
	for(int i = 0; i < 10; i+= 1) {
		System.out.println(i);
	}
	
	//verschachtelte Schleifen
	
	for(int i = 1; i < 4; i++) {
		
		for(int j = 1; j < 4; j++) {		//3x wird es innerhalb der ersten Schleife dreimal ausgeführt. Dannach wird die erste Schleife 
											//ausgeführt (steht nämlich darunter)
			System.out.print("x ");			//fehlendes "ln" bedeutet, dass nicht in einer neuen Zeile gestartet wird.
		}
	System.out.println();					//einfacher Zeilenumbruch
	}
	
	//Array
	
	String [] arrayvariablenbezeichnung = new String[3]; //Die Größe eines Arrays wird immer mit der Initialisierung festgelegt.
	
	arrayvariablenbezeichnung[0] = "Hendrik";			 //weniger auch okay, aber nie mehr!
	arrayvariablenbezeichnung[1] = "Paul";
	arrayvariablenbezeichnung[2] = "Fabienne";
	
	System.out.println(arrayvariablenbezeichnung[1]);

	for(int i = 0; i < arrayvariablenbezeichnung.length; i++) {		//.lenght beschreibt die Länge des Arrays (max. Länge)
		System.out.println(arrayvariablenbezeichnung[i]);			//wenn "null" ausgegeben, dann ist Array-Wert nicht belegt.
																	//Sinn: leichter wartbar. Wenn Name hinzugefügt, muss man nur an einer Stelle
																	//(bei Array in []) was umändern und es werden trotzdem alle Werte ausgegeben.
	}
	
	//Array lässt sich auch so deklarieren: 
	
	String [] names = {"Hendrik", "Paul", "Fabienne"};				//autom. Anzahl Strings
	
	for(String names2 : names) {									//Durchlaufe das Array names Schritt für Schritt und speichere immer eine Kopie vom Wert an der aktuellen Stelle in die Variable "names2", die vom Typ String ist.
																	//hier kann ich auf die Variable zugreifen; es wird nur eine Kopie angesprochen, die Originale bleiben unverändert!
	}
	
	//Mehrdimensionales Array
	
	String [][] firstAndLastName = new String [5][2];
	
	firstAndLastName [0][0] = "Franz";
	firstAndLastName [0][1] = "Bauer";
	
	firstAndLastName [1][0] = "Felix";
	firstAndLastName [1][1] = "Huber";
	
	firstAndLastName [2][0] = "Fritz";
	firstAndLastName [2][1] = "Meier";
	
	//äußere for-Schleife: Zeilenindex i
	//innere for-Schleife: Spaltenindex j
	
	for(int i = 0; i < firstAndLastName.length; i++) {
		for(int j = 0; j < firstAndLastName[i].length; j++) {
		System.out.print(firstAndLastName[i][j] + " ");
	}
	System.out.println();	
	}
	
	lz(20, 20);										//Methode lz wird ausgeführt; Parameter müssen angeg. werden!
													//Achte auf die Reihenfolge!
	
	int intvonrl = rl(20, 20);						//Wiederverwendung Methoden
	
	System.out.println(rl(2, 3));
	
	}
	
	//Methoden
	
	public static void lz(int nummer1m, int nummer2m) {	//bei Methoden wie System.out.println() wurden Sie vom Java-Ersteller schon in der Bibliothek der Programmiersprache definiert
		
		/*int x = nummer1m;
		
		int y = nummer2m;
		
		int result = x + y; Auch so:
		*/
		
		int result = nummer1m + nummer2m;
		
		System.out.println(result);
		
	}
	
	public static int rl (int nummerl, int nummerr) {
		int result = nummerl + nummerr;
		return result;
	}
	
}
