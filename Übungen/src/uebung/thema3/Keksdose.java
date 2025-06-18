package uebung.thema3;

import java.util.ArrayList;

public class Keksdose extends ArrayList<Keks> {

    private int füllgrenze = 0;

    //Instanziierung, unendlich große Keksdose
    public Keksdose () {
        super();
        this.füllgrenze = 0;
    }

    //begrenzt große Keksdose
    public Keksdose (int füllgrenze) {
        this.füllgrenze = füllgrenze;
    }

    //Gesamtenergie berechnen
    public int berechneEnergie() {
        int gesamtEnergie = 0;

        for (Keks keks : this) {
            gesamtEnergie += keks.getEnergie();
        }

        return gesamtEnergie;
    }

    //Keks hinzufügen
    public void addKeks(Keks keks) {

        //aber nur, wenn unendlich groß oder noch Platz in Dose
        if (füllgrenze == 0 || this.size() < füllgrenze)
            this.add(keks);
        else {
            System.out.println("Die Keksschachtel ist voll!");
        }
    }

}
