import java.util.Scanner;

public class palyndromeClass {

    public void reverseString() {

        System.out.println("Gib String: ");

        Scanner s = new Scanner(System.in);
        String string = s.nextLine().toLowerCase();

        StringBuffer strB = new StringBuffer(string);
        System.out.println("Le String: " + string);

        String reverseStringBuffer = strB.reverse().toString();
        System.out.println("Le reverse String: " + reverseStringBuffer);

        if(string.equals(reverseStringBuffer) ){
            System.out.println("Palyndrome!");
        } 
        else {
            System.out.println("Wrong...");
        }
    }
}