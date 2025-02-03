import java.util.Scanner;

public class MilesToKilometersCalculator {
    public static void main(String[] args) {

        double miles;
        double kilometers;

        System.out.println("Welcome to the Miles to Kilometers Calculator!");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter miles to convert to Kilometers: ");
        kilometers = scan.nextFloat();
        miles = kilometers * 1.60935;

        System.out.println("Miles converted to Kilometers: " + miles);
    }
}
