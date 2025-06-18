package uebung.thema3;

public class Schokokeks extends Keks {

    public Schokokeks() {
        this.sorte = "Schoko"; //Getter und Setter der Einfachheit weggelassen --> dient nur dazu, hier etwas zu haben
        this.setEnergie(5); //gesündester Keks
    }

    public Schokokeks(Keksschachtel keksschachtel) {
        super(keksschachtel);
        this.setEnergie(5);
    }
}