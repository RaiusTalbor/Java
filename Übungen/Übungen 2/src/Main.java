//Übungskomplex 2
//Rouven L., s3005525, 3IT24-2

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Person> personenliste = new ArrayList<>();

    public static void main(String[] args) {

        Person personFinn = new Person("Finn");
        Person personDaniela = new Person("Daniela");

        personenliste.add(personFinn);
        personenliste.add(personDaniela);

        personFinn.setGeb("18.10.2005");
        personDaniela.setGeb("05.12.2003");

        System.out.println(personFinn.getGeb());
        System.out.println(personDaniela.getGeb());

        System.out.println(personFinn.alter());
        System.out.println(personDaniela.alter());

        System.out.println(personFinn.geburtstag(personFinn));
        System.out.println(personDaniela.geburtstag(personDaniela));

    }
}