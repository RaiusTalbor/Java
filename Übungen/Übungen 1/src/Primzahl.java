public class Primzahl {

    // Methode prüft, ob eine Zahl eine Primzahl ist
    public void istPrimzahl(int zahl) {

        int stopp = 0; 

        if (zahl <= 1) {
            if (zahl == 2){
                if (zahl % 2 == 0) {
                    System.out.println("Die Zahl " + zahl + "ist keine Primzahl");
                }
            }
        }
        else {

            int wurzel = (int) Math.sqrt(zahl);

            for (int i = 3; i <= wurzel; i += 2) {
                if (zahl % i == 0) {
                    System.out.println("Die Zahl " + zahl + " ist keine Primzahl");
                    stopp = 1;
                }
            }

            if (stopp != 1) {
                System.out.println("Die Zahl " + zahl + " ist eine Primzahl");
            }
        }
    }
}
