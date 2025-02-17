import java.util.Scanner;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;


public class Deliformat {
    public static void main(String[] args) {

        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound;
        double weight;
        double weightOunces;
        double totalPrice;

        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the CS Deli!! /n" );



        System.out.println("Enter the price per pound of your item");
        pricePerPound = scan.nextDouble();




        System.out.println("Enter the weight (ounces)");
        weightOunces = scan.nextDouble();


        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
    }
}
