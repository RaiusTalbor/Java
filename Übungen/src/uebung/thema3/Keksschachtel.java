package uebung.thema3;

import java.util.ArrayList;
import java.util.List;

public class Keksschachtel {

    private List<Keks> kekse = new ArrayList<>(); //Delegation, Keksdose hat Kekse

    private int füllgrenze = 42;

    //unendlich große Keksschachtel
    public Keksschachtel() {
        this.füllgrenze = 0; //definiert, unendlich große Dose
    }

    //begrenzt große Keksschachtel :c
    public Keksschachtel(int füllgrenze) {
        this.füllgrenze = füllgrenze;
    }

    //Keks hinzufügen
    public void addKeks(Keks keks) {

        //aber nur, wenn unendlich groß oder Füllgrenze noch nicht erreicht
        if (füllgrenze == 0 || this.kekse.size() < füllgrenze)
            this.kekse.add(keks);
        else {
            System.out.println("Die Keksschachtel ist voll!");
        }
    }

    //Keks wird herausgenommen
    public void removeKeks(Keks keks) {
        this.kekse.remove(keks);
    }

    //Gesamtenergie wird berechnet
    public int berechneEnergie() {
        int gesamtEnergie = 0;

        for (Keks keks : kekse) {
            gesamtEnergie += keks.getEnergie();
        }

        return gesamtEnergie;
    }
}
