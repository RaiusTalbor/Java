//Programmname und was es tut
//Rouven L., s3005525, 3IT24-2

package uebung.thema1;

import java.util.Scanner;

public class Palindrom {
    public void umdrehen() {

        System.out.println("Gib ein Wort ein: ");

        Scanner s = new Scanner(System.in);
        String eingabewort = s.nextLine();
        eingabewort = eingabewort.toLowerCase();

        System.out.println("Das Eingabewort lautet: " + eingabewort);
        String palindrom = new StringBuilder(eingabewort).reverse().toString();

        if (palindrom.equals(eingabewort)) {
            System.out.println("Das Wort ist ein Palindrom! :D");
        }
        else {
            System.out.println("Das Wort ist kein Palindrom. :c");
        }
    }
}
