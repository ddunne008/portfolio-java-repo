import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        double average;

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter the first number: ");
        double val1 = scan.nextDouble();

        System.out.println("Enter the second number: ");
        double val2 = scan.nextDouble();

        System.out.println("Enter the third number");
        double val3 = scan.nextDouble();

        scan.close();

        average = (val1 + val2 + val3) / 3;
        System.out.println("The first number is " + val1);
        System.out.println("The second number is " + val2);
        System.out.println("The third number is " + val3);
        System.out.println("The average altogether is " + average);


    }
}
