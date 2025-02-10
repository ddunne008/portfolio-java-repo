import java.util.Scanner;


public class StringReverser {
    public static void main(String[] args) {

        String enteredString;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        enteredString = sc.nextLine();


        StringBuilder reversedString = new StringBuilder();
        reversedString.append(enteredString);
        reversedString = reversedString.reverse();
        System.out.println("Entered sentence: " + enteredString);
        System.out.println("Reversed sentence: " + reversedString);


    }
}
