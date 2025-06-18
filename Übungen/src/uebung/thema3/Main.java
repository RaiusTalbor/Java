package uebung.thema3;

//Vererbung Keksaufgabe 1
//Rouven L., s3005525, 3IT24-2

public class Main {
    public static void main(String[] args) {
        //Welche Variante, wenn obere Grenze bei Kekssammlung?
        //Delegation: intuitiver, schöner zu machen (if-Abfrage und ein Output)
        //Vererbung: weniger Code, einfach zu bauen

        Keksschachtel schachtel = new Keksschachtel(42);
        Keksdose dose = new Keksdose(42);

        //Keks hinzufügen
        Keks keks = new Keks(schachtel, 7);
        dose.add(keks);

        //Energie ausgeben
        System.out.println("Energie Keks: " + keks.getEnergie());

        //sind zu viele --> Demo das es geht
        for (int i = 0; i < 44; i++) {
            Keks keks2 = new Keks(schachtel, 7);
            dose.addKeks(keks2);
        }

        //Gesamenergie ausgeben
        System.out.println("Gesamtenergie Dose: " + dose.berechneEnergie());
        System.out.println("Gesamtenergie Schachtel: " + schachtel.berechneEnergie());

        //Keks entfernen :c
        schachtel.removeKeks(keks);
        dose.remove(keks);

        //zur Prüfung Gesamtenergie noch mal
        System.out.println("Gesamtenergie Dose: " + dose.berechneEnergie());
        System.out.println("Gesamtenergie Schachtel: " + schachtel.berechneEnergie());

        //Schokokeks
        Schokokeks schoko = new Schokokeks();
        System.out.println("Schokokeks Energie muss 5 sein: " + schoko.getEnergie());
    }
}
