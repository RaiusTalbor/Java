package uebung.thema5;

import java.util.Comparator;
import java.util.Scanner;

//Thema 5: Autolistensortieren Aufgabe 2
//Rouven L., s3005525, 3IT24-2

public class Main {
    public static void main(String[] args) {

        int abbruch = 0;
        
        while (abbruch == 0) {
            System.out.println("""
                    MENÜ
                    --------------------------------
                    [1] Nach Marke sortieren
                    [2] Nach Modell sortieren
                    [3] Nach Leistung sortieren
                    [4] Nach Baujahr sortieren
                    [5] Nach Preis sortieren
                    [6] Beenden
                    """);
            
            Scanner s = new Scanner(System.in);
            String auswahl = s.nextLine();

            switch (auswahl) {
                case "1":
                    sortiereMarke();
                    break;
                case "2":
                    sortiereModell();
                    break;
                case "3":
                    sortiereLeistung();
                    break;
                case "4":
                    sortiereBaujahr();
                    break;
                case "5":
                    sortierePreis();
                    break;
                case "6":
                    System.out.println("Programm wird beendet!");
                    abbruch = 1;
                    break;
                default:
                    System.out.println("Falsche Eingabe!");
                    break;
            }
        }
    }

    protected static Autoliste liste = new Autoliste();

    private static void sortierePreis() {
        liste.sort(Comparator.comparingInt(Auto::getPreis));
        for (Auto auto : liste) {
            System.out.println(auto.toString());
        }
    }

    private static void sortiereBaujahr() {
        liste.sort(Comparator.comparingInt(Auto::getBaujahr));
        for (Auto auto : liste) {
            System.out.println(auto.toString());
        }
    }

    private static void sortiereLeistung() {
        liste.sort(Comparator.comparingInt(Auto::getLeistung));
        for (Auto auto : liste) {
            System.out.println(auto.toString());
        }
    }

    private static void sortiereModell() {
        liste.sort(Comparator.comparing(Auto::getModell));
        for (Auto auto : liste) {
            System.out.println(auto.toString());
        }
    }

    private static void sortiereMarke() {
        liste.sort(Comparator.comparing(Auto::getMarke));
        for (Auto auto : liste) {
            System.out.println(auto.toString());
        }
    }
}
