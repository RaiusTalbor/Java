package uebung.thema1;

public class Fakultaet {

    private int ausgangszahl;
    
    public void berechne(int zahl){
        this.ausgangszahl = zahl;
        int fa = 1;

        while (zahl > 1) {
            fa *= zahl;
            zahl -= 1;
        }

        System.out.println("Die Fakultät der Zahl " + this.ausgangszahl + " beträgt " + fa + ".");
    }
}
