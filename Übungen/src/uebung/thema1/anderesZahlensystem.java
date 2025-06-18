package uebung.thema1;

public class anderesZahlensystem {

    private String zahlen [] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public void DezimalinBasis(int umformendezahl, int basis) {
        //rechnet Dualzahlen in Dezimalzahlen um

        if (basis > 35) {
            System.out.println("Achtung! Das Programm ist nicht für größere Basen ausgelegt! Das Ergebnis ist möglicherweise falsch.");
        }

        int ausgangszahl = umformendezahl;
        
        String StringErgebnis = "";       

        while (umformendezahl != 0) {

            int rest = umformendezahl % basis;
            umformendezahl /= basis;

            //wählt passenden String für die jeweilige Stelle aus zahlenliste aus
            String aenderung = zahlen[rest];

            StringErgebnis = StringErgebnis+aenderung;
        }

        String ergebnis = new StringBuilder(StringErgebnis).reverse().toString();

        System.out.println(ausgangszahl + " umgerechnet zur Basis " + basis + " ist " + ergebnis + ".");
    }

    public void BasisinDezimal(String umformendezahl, int aktuellebasis) {

        if (aktuellebasis > 35) {
            System.out.println("Achtung! Das Programm ist nicht für größere Basen ausgelegt! Das Ergebnis ist möglicherweise falsch.");
        }

        String ausgangszahl = umformendezahl;

        int ergebnis = 0;
        int rest = 0;

        umformendezahl = umformendezahl.toUpperCase();
        umformendezahl = new StringBuilder(umformendezahl).reverse().toString();

        for (int i = 0; i < (umformendezahl.length()); i++) {

            rest = Character.digit((umformendezahl.charAt(i)), aktuellebasis);

            ergebnis += rest * Math.pow(aktuellebasis, i);
        }

        System.out.println(ausgangszahl + " zur Basis " + aktuellebasis + " umgerechnet als Dezimalzahl ist " + ergebnis + ".");
    }
}