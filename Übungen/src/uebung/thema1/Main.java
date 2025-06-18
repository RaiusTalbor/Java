//Thema 1, sämtliche Aufgaben
//Rouven L., s3005525, 3IT24-2

package uebung.thema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zahl eingeben, mit der Thema 1 durchgearbeitet werden soll: ");
        Scanner s = new Scanner(System.in);
        Integer zahl = s.nextInt();

        System.out.println();

        Quersumme2 quersumme = new Quersumme2(zahl);

        System.out.println();

        traurigeZahlen traurig = new traurigeZahlen();
        traurig.traurigeZahl(zahl);

        System.out.println();

        Palindrom palindrom = new Palindrom();
        palindrom.umdrehen();

        System.out.println();

        NewtonApproximation na = new NewtonApproximation();
        na.berechne(zahl);

        System.out.println();

        Primzahl prim = new Primzahl();
        prim.istPrimzahl(zahl);

        System.out.println();

        Fakultaet fa = new Fakultaet();
        fa.berechne(zahl);

        System.out.println();

        anderesZahlensystem dd = new anderesZahlensystem();
        dd.DezimalinBasis(zahl, 16);
        System.out.println();
        System.out.println("Binärzahl 1010:");
        dd.BasisinDezimal(Integer.toString(1011), 2);
    }
}
