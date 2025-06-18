package uebung.thema3;

public class Keks {

    private int energieKeks = 0;
    protected String sorte = "Keks";

    public Keks() {
        this.sorte = "Keks"; //Getter und Setter der Einfachheit weggelassen --> dient nur dazu, hier etwas zu haben
    }

    public Keks(Keksschachtel keksschachtel) {
        keksschachtel.addKeks(this);
    }

    public Keks(Keksschachtel keksschachtel, int energieeinheiten) {
        keksschachtel.addKeks(this);
        this.setEnergie(energieeinheiten);
    }

    public void setEnergie(int energieeinheiten) {
        this.energieKeks = energieeinheiten;
    }

    public int getEnergie() {
        return this.energieKeks;
    }
}
