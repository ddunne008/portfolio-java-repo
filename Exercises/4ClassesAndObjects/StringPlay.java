import java.util.Locale;

public class StringPlay {
    public static void main(String[] args) {

        String collage = new String("Leeds Beckett University");

        String town = "Leeds, UK";

        int stringLength;
        String change1, change2, change3;

        stringLength = collage.length();



        System.out.println(collage + " contains " + stringLength + " characters.");

        change1 = collage.substring(0, stringLength).toUpperCase();

        change2 = collage.substring(stringLength).toLowerCase();
        if (change2.contains("e")) {
            change2 = change2.replace("e", "*");
        }

        else if (change2.contains("s")) {
            change2 = change2.replace("s", "*");
        }

        change3 = collage.concat(town);



        System.out.println("The final string is " + change3);
    }
}
