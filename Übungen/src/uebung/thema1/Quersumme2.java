//Bildet die Quersumme einer Zahl
//Rouven L., s3005525, 3IT24-2

package uebung.thema1;

public class Quersumme2 {
    private long number = 0;

    public Quersumme2(long n) {
        this.number = n;
    }

    public void quersumme() {
        System.out.println("Berechne die Quersumme von " + number + "!");

        int summe = 0;
        String textnumber = String.valueOf(number);

        for (int i = 0; i < textnumber.length(); i++) {
            summe += Character.getNumericValue(textnumber.charAt(i));
        }
        
        System.out.println("Die Quersumme ist " + summe + ".");
    }
}