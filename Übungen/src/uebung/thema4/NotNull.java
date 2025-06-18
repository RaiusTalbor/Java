package uebung.thema4;

public class NotNull {

    @SafeVarargs //da bei Generics sehr viele Argumente, die zur Laufzeit nicht feststehen
    public static <T> T notNull(T... args) {

        //für die Liste der Argumente prüfe, ob was existiert
        for (T argument : args) {
            if (argument != null) {
                return argument; //gibt das nichtleere Argument zurück
            }
        }

        return null; //Objekt ist null
    }
}

