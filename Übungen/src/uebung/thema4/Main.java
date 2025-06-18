package uebung.thema4;

//NotNull, prüft, ob ein Objekt leer ist
//Rouven L., s3005525, 3IT24-2

public class Main {
    public static void main(String[] args) {

        System.out.println(NotNull.notNull(new String("Hallo!")));

        System.out.println(NotNull.notNull(23));

        System.out.println(NotNull.notNull(null, 123, "Wort2", null));
        
        String help = new String();
        help = null;
        System.out.println(NotNull.notNull(help));

    }
}
