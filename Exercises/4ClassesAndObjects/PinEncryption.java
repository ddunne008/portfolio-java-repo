import java.util.Random;
import java.util.Scanner;

public class PinEncryption {
    public static void main(String[] args) {


        Random r = new Random();
        int PIN;
        int min = 1000;
        int max = 65536;

        int RandomSelec2;
        int RandomSelec1;

        RandomSelec1 = min + (int)(Math.random() * ((max - min + 1)));
        RandomSelec2 = min + (int)(Math.random() * ((max - min + 1)));



        Scanner scan = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        PIN = scan.nextInt();


        String toHexString = Integer.toHexString(PIN);


        System.out.println("PIN: " + PIN + " in hexadecimal is " + RandomSelec1 + toHexString + RandomSelec2);

    }
}
