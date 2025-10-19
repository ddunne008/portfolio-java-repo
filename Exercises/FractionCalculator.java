import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {

        double fraction;
        int numerator;
        int denominator;
        double value;
        double dec;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        numerator = scan.nextInt();
        System.out.print("Enter denominator: ");
        denominator = scan.nextInt();

        scan.close();


        fraction = (double) numerator / denominator;
        dec = fraction;


        System.out.println("The decimal of the fraction is: " + fraction);

    }
}
