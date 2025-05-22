import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;

    public LocalDate gebdatum;

    public Person () {
        this.name = "Namenlos :c";
    }

    public Person(String name) {
        this.name = name;
    }

    public void setGeb(String Datum) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        gebdatum = LocalDate.parse(Datum, formatter);
        System.out.println("Geburtsdatum ist: " + gebdatum);

    }

    public LocalDate getGeb() {
        System.out.println("Das Geburtsdatum ist " + gebdatum);

        return gebdatum;
    }

    //jeden Monat ausgeben können?

    //noch dieses Jahr Geburtstag?
    public boolean geburtstag(Person person) {

        boolean rückgabe = false;

        LocalDate heute = LocalDate.now();

        int tag = heute.getDayOfMonth();
        int monat = heute.getMonthValue();

        int gebtag = person.gebdatum.getDayOfMonth();
        int gebmonat = person.gebdatum.getMonthValue();

        if (gebmonat > monat) {
            if (gebtag > tag) {
                rückgabe = true;
            }
            else {
                rückgabe = false;
            }
        }
        else {
            rückgabe = false;
        }

        return rückgabe;
    }

    //Wie alt Person?
    public int alter() {

        int aktuellesalter;

        LocalDate heute = LocalDate.now();

        int jahr = heute.getYear();

        int gebjahr = this.gebdatum.getYear();

        //rechne
        aktuellesalter = jahr - gebjahr;

        if (geburtstag(this)) {
            aktuellesalter -= 1;
        }
        
        return aktuellesalter;
    }

}
