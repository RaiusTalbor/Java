public class traurigeZahlen {
    
    public void traurigeZahl(int EingabeNumber) {

        int einzelneZahl [] = new int[20];
        int summe = 0;
        String textnumber = String.valueOf(EingabeNumber);

        for (int i = 0; i < textnumber.length(); i++) {
            einzelneZahl[i] = Character.getNumericValue(textnumber.charAt(i));
            summe += einzelneZahl[i] * einzelneZahl[i];
        }

        //mögliche Erweiterung: Zahl anzeigen, die eingegeben wurde
        if (summe == 1) {
            System.out.println("Die Zahl ist eine fröhliche Zahl. :D");
        }
        else if(summe == 4) {
            System.out.println("Die Zahl ist eine traurige Zahl. :c");
        }
        else {
            traurigeZahl(summe);
        }
    }
}
